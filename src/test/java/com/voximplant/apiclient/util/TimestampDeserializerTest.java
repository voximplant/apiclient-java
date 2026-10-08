package com.voximplant.apiclient.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

public class TimestampDeserializerTest {

    private static TimeZone defaultTimeZone;

    private final TimestampSerializer serializer = new TimestampSerializer();
    private final TimestampDeserializer deserializer = new TimestampDeserializer();

    @BeforeAll
    public static void setUpTimeZone() {
        // TimestampSerializer always formats in Etc/UTC, TimestampDeserializer parses in the JVM time zone
        // captured by its static SimpleDateFormat on class load. Pin the JVM time zone to Etc/UTC before
        // the test instance loads TimestampDeserializer, so only the hour parsing is under test.
        defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("Etc/UTC"));
    }

    @AfterAll
    public static void restoreTimeZone() {
        TimeZone.setDefault(defaultTimeZone);
    }

    @Test
    public void deserializeSerializedTimestampForEveryHourOfDayShouldReturnSameDate() throws IOException {
        List<String> failures = new ArrayList<>();
        for (int hour = 0; hour < 24; hour++) {
            Date date = utcDate(2026, Calendar.OCTOBER, 8, hour, 22, 49);
            String serialized = serializer.serialize(date);

            Date deserialized = deserialize(serialized);

            if (!date.equals(deserialized)) {
                failures.add(serialized + " -> " + serializer.serialize(deserialized));
            }
        }

        assertEquals(new ArrayList<String>(), failures, "timestamps changed after serialize/deserialize round trip");
    }

    @Test
    public void deserializeNoonShouldBeOneSecondAfterMorning() throws IOException {
        Date morning = deserialize("2026-10-08 11:59:59");
        Date noon = deserialize("2026-10-08 12:00:00");

        assertEquals(1000L, noon.getTime() - morning.getTime(), "12:00:00 must be one second after 11:59:59");
    }

    private Date deserialize(String value) throws IOException {
        try (JsonParser parser = new JsonFactory().createParser("\"" + value + "\"")) {
            parser.nextToken();
            return deserializer.deserialize(parser, null);
        }
    }

    private static Date utcDate(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
        calendar.clear();
        calendar.set(year, month, day, hour, minute, second);
        return calendar.getTime();
    }
}

package com.voximplant.apiclient.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimestampDeserializerTest {

    @Test
    public void parsesTwentyFourHourTimestampAsUtc() throws Exception {
        TimeZone previous = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("Pacific/Kiritimati"));
        try {
            assertEquals(Instant.parse("2020-06-01T00:00:00Z"), parse("2020-06-01 00:00:00").toInstant());
            assertEquals(Instant.parse("2020-06-01T12:00:00Z"), parse("2020-06-01 12:00:00").toInstant());
            assertEquals(Instant.parse("2020-06-01T15:30:45Z"), parse("2020-06-01 15:30:45").toInstant());
            assertEquals(Instant.parse("2020-06-01T23:59:59Z"), parse("2020-06-01 23:59:59").toInstant());
        } finally {
            TimeZone.setDefault(previous);
        }
    }

    private static Date parse(String timestamp) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try (JsonParser parser = mapper.createParser("\"" + timestamp + "\"")) {
            parser.nextToken();
            return new TimestampDeserializer().deserialize(parser, mapper.getDeserializationContext());
        }
    }
}

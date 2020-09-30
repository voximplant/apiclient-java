package com.voximplant.apiclient.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimestampSerializer implements ValueSerializer<Date> {
    public String serialize(Date d) {
        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
        calendar.setTime(d);
        return String.format("%04d-%02d-%02d %02d:%02d:%02d", calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
    }
}

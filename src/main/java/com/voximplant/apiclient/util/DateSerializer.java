package com.voximplant.apiclient.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateSerializer implements ValueSerializer<Date> {
    public String serialize(Date d) {
        return new SimpleDateFormat("yyyy-MM-dd").format(d);
    }
}

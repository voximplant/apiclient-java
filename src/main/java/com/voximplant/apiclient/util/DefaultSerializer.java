package com.voximplant.apiclient.util;

public class DefaultSerializer implements ValueSerializer<Object> {
    @Override
    public String serialize(Object obj) {
        return obj.toString();
    }
}

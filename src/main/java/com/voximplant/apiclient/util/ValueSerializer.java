package com.voximplant.apiclient.util;

public interface ValueSerializer<T> {
    public String serialize(T obj);
}

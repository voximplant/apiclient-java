package com.voximplant.apiclient.util;

public class Error {
    private String msg;
    private Long code;

    public String getMsg() {
        return msg;
    }

    public Long getCode() {
        return code;
    }

    public boolean hasMsg() {
        return this.msg != null;
    }

    public boolean hasCode() {
        return this.code != null;
    }
}

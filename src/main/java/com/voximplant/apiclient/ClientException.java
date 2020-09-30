package com.voximplant.apiclient;

public class ClientException extends Exception {
    public ClientException(String msg) {
        super(msg);
    }
    public ClientException(String msg, Exception cause) {
        super(msg, cause);
    }

}

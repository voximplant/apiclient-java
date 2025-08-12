package com.voximplant.apiclient;

class Credentials {
    private String privateKey;
    private long accountId;
    private String keyId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getKeyId() {
        return keyId;
    }

    public String getPrivateKey() {
        return privateKey;
    }
}

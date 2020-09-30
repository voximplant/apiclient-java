package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [CreateKey] function result.
*/
public class KeyInfo {

    private String accountEmail;

    /**
    * Client email.
    */
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean hasAccountEmail() {
        return this.accountEmail != null;
    }

    private Long accountId;

    /**
    * The account ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String keyId;

    /**
    * The key ID.
    */
    public String getKeyId() {
        return this.keyId;
    }

    public boolean hasKeyId() {
        return this.keyId != null;
    }

    private String privateKey;

    /**
    * The private key.
    */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public boolean hasPrivateKey() {
        return this.privateKey != null;
    }

}
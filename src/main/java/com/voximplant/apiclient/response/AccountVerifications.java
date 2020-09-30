package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The account verifications.
*/
public class AccountVerifications {

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

    private AccountVerificationType[] verifications;

    /**
    * The account verifications.
    */
    public AccountVerificationType[] getVerifications() {
        return this.verifications;
    }

    public boolean hasVerifications() {
        return this.verifications != null;
    }

}
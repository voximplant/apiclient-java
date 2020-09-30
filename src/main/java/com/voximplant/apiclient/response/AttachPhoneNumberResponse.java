package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class AttachPhoneNumberResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private NewAttachedPhoneInfoType[] phoneNumbers;

    /**
    * The attached phone numbers.
    */
    public NewAttachedPhoneInfoType[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public boolean hasPhoneNumbers() {
        return this.phoneNumbers != null;
    }

}
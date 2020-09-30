package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class ChargeAccountRequest {
    private MultiArgument<Long> phoneId;

    @RequestField(name="phone_id")
    /**
    * The phone ID list separated by the ';' symbol or the 'all' value. You
    * should specify the phones having the auto_charge=false.
    */
    public MultiArgument<Long> getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The phone ID list separated by the ';' symbol or the 'all' value. You
    * should specify the phones having the auto_charge=false.
    */
    public ChargeAccountRequest setPhoneId(MultiArgument<Long> d) {
        this.phoneId = d;
        return this;
    }

    private MultiArgument<String> phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number list separated by the ';' symbol or the 'all' value.
    * Can be used instead of <b>phone_id</b>. You should specify the phones
    * having the auto_charge=false.
    */
    public MultiArgument<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number list separated by the ';' symbol or the 'all' value.
    * Can be used instead of <b>phone_id</b>. You should specify the phones
    * having the auto_charge=false.
    */
    public ChargeAccountRequest setPhoneNumber(MultiArgument<String> d) {
        this.phoneNumber = d;
        return this;
    }

}
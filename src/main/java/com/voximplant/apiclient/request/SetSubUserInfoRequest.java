package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SetSubUserInfoRequest implements Alignable {
    private Long subuserId;

    @RequestField(name="subuser_id")
    /**
    * The subuser's ID
    */
    public Long getSubuserId() {
        return this.subuserId;
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    /**
    * The subuser's ID
    */
    public SetSubUserInfoRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private String oldSubuserPassword;

    @RequestField(name="old_subuser_password")
    /**
    * The subuser old password. It is required if __new_subuser_password__
    * is specified
    */
    public String getOldSubuserPassword() {
        return this.oldSubuserPassword;
    }

    public boolean hasOldSubuserPassword() {
        return this.oldSubuserPassword != null;
    }

    /**
    * The subuser old password. It is required if __new_subuser_password__
    * is specified
    */
    public SetSubUserInfoRequest setOldSubuserPassword(String d) {
        this.oldSubuserPassword = d;
        return this;
    }

    private String newSubuserPassword;

    @RequestField(name="new_subuser_password")
    /**
    * The new user password. Must be at least 8 characters long and contain
    * at least one uppercase and lowercase letter, one number, and one
    * special character
    */
    public String getNewSubuserPassword() {
        return this.newSubuserPassword;
    }

    public boolean hasNewSubuserPassword() {
        return this.newSubuserPassword != null;
    }

    /**
    * The new user password. Must be at least 8 characters long and contain
    * at least one uppercase and lowercase letter, one number, and one
    * special character
    */
    public SetSubUserInfoRequest setNewSubuserPassword(String d) {
        this.newSubuserPassword = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The new subuser description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The new subuser description
    */
    public SetSubUserInfoRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (subuserId != null) {
            sb.append(aligned)
                .append("\"subuserId\": \"")
                .append(subuserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (oldSubuserPassword != null) {
            sb.append(aligned)
                .append("\"oldSubuserPassword\": \"")
                .append(oldSubuserPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newSubuserPassword != null) {
            sb.append(aligned)
                .append("\"newSubuserPassword\": \"")
                .append(newSubuserPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
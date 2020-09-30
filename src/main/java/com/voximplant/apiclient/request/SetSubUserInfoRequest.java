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

public class SetSubUserInfoRequest {
    private Long subuserId;

    @RequestField(name="subuser_id")
    /**
    * The subuser's ID.
    */
    public long getSubuserId() {
        return this.subuserId.longValue();
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    /**
    * The subuser's ID.
    */
    public SetSubUserInfoRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private String oldSubuserPassword;

    @RequestField(name="old_subuser_password")
    /**
    * The subuser old password. It is required if __new_subuser_password__
    * is specified.
    */
    public String getOldSubuserPassword() {
        return this.oldSubuserPassword;
    }

    public boolean hasOldSubuserPassword() {
        return this.oldSubuserPassword != null;
    }

    /**
    * The subuser old password. It is required if __new_subuser_password__
    * is specified.
    */
    public SetSubUserInfoRequest setOldSubuserPassword(String d) {
        this.oldSubuserPassword = d;
        return this;
    }

    private String newSubuserPassword;

    @RequestField(name="new_subuser_password")
    /**
    * The new user password. The length must be at least 6 symbols.
    */
    public String getNewSubuserPassword() {
        return this.newSubuserPassword;
    }

    public boolean hasNewSubuserPassword() {
        return this.newSubuserPassword != null;
    }

    /**
    * The new user password. The length must be at least 6 symbols.
    */
    public SetSubUserInfoRequest setNewSubuserPassword(String d) {
        this.newSubuserPassword = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The new subuser description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The new subuser description.
    */
    public SetSubUserInfoRequest setDescription(String d) {
        this.description = d;
        return this;
    }

}
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

public class CreateKeyRequest {
    private String description;

    @RequestField(name="description")
    /**
    * The key's description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The key's description.
    */
    public CreateKeyRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    private MultiArgument<Long> roleId;

    @RequestField(name="role_id")
    /**
    * The role ID list separated by the ';' symbol. Use it instead of
    * **role_name**, but not combine with.
    */
    public MultiArgument<Long> getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    /**
    * The role ID list separated by the ';' symbol. Use it instead of
    * **role_name**, but not combine with.
    */
    public CreateKeyRequest setRoleId(MultiArgument<Long> d) {
        this.roleId = d;
        return this;
    }

    private MultiArgument<String> roleName;

    @RequestField(name="role_name")
    /**
    * The role name list separated by the ';' symbol. Use it instead of
    * **role_id**, but not combine with.
    */
    public MultiArgument<String> getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    /**
    * The role name list separated by the ';' symbol. Use it instead of
    * **role_id**, but not combine with.
    */
    public CreateKeyRequest setRoleName(MultiArgument<String> d) {
        this.roleName = d;
        return this;
    }

}
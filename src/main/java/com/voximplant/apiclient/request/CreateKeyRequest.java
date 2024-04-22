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

public class CreateKeyRequest implements Alignable {
    private String description;

    @RequestField(name="description")
    /**
    * The key's description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The key's description
    */
    public CreateKeyRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    private String keyName;

    @RequestField(name="key_name")
    /**
    * The key's name, up to 50 characters. Cannot be empty
    */
    public String getKeyName() {
        return this.keyName;
    }

    public boolean hasKeyName() {
        return this.keyName != null;
    }

    /**
    * The key's name, up to 50 characters. Cannot be empty
    */
    public CreateKeyRequest setKeyName(String d) {
        this.keyName = d;
        return this;
    }

    private MultiArgument<Long> roleId;

    @RequestField(name="role_id")
    /**
    * The role ID list separated by semicolons (;). Use it instead of
    * **role_name**, but not combine with
    */
    public MultiArgument<Long> getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    /**
    * The role ID list separated by semicolons (;). Use it instead of
    * **role_name**, but not combine with
    */
    public CreateKeyRequest setRoleId(MultiArgument<Long> d) {
        this.roleId = d;
        return this;
    }

    private MultiArgument<String> roleName;

    @RequestField(name="role_name")
    /**
    * The role name list separated by semicolons (;). Use it instead of
    * **role_id**, but not combine with
    */
    public MultiArgument<String> getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    /**
    * The role name list separated by semicolons (;). Use it instead of
    * **role_id**, but not combine with
    */
    public CreateKeyRequest setRoleName(MultiArgument<String> d) {
        this.roleName = d;
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
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (keyName != null) {
            sb.append(aligned)
                .append("\"keyName\": \"")
                .append(keyName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (roleId != null) {
            sb.append(aligned)
                .append("\"roleId\": \"")
                .append(roleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (roleName != null) {
            sb.append(aligned)
                .append("\"roleName\": \"")
                .append(roleName)
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
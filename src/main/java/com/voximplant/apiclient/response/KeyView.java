package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetKeys] function result.
*/
public class KeyView implements Alignable {

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

    private RoleView[] roles;

    /**
    * The key roles.
    */
    public RoleView[] getRoles() {
        return this.roles;
    }

    public boolean hasRoles() {
        return this.roles != null;
    }

    private String description;

    /**
    * The key description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private SubUserView[] subuser;

    /**
    * The key subuser.
    */
    public SubUserView[] getSubuser() {
        return this.subuser;
    }

    public boolean hasSubuser() {
        return this.subuser != null;
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
        if (keyId != null) {
            sb.append(aligned)
                .append("\"keyId\": \"")
                .append(keyId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (roles != null) {
            sb.append(aligned)
                .append("\"RoleView\": ")
                .append(StringHelper.arrayToString(roles, alignment + 1))
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
        if (subuser != null) {
            sb.append(aligned)
                .append("\"SubUserView\": ")
                .append(StringHelper.arrayToString(subuser, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
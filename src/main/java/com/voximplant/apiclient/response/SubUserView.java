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
* The [GetSubUsers] function result.
*/
public class SubUserView implements Alignable {

    private Long subuserId;

    /**
    * The subuser ID
    */
    public Long getSubuserId() {
        return this.subuserId;
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    private String subuserName;

    /**
    * The subuser name, can be used as __subuser_login__ to <a
    * href='/docs/guides/managementapi/authorization'>authenticate</a>
    */
    public String getSubuserName() {
        return this.subuserName;
    }

    public boolean hasSubuserName() {
        return this.subuserName != null;
    }

    private String description;

    /**
    * The subuser description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private RoleView[] roles;

    /**
    * The subuser roles
    */
    public RoleView[] getRoles() {
        return this.roles;
    }

    public boolean hasRoles() {
        return this.roles != null;
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
        if (subuserName != null) {
            sb.append(aligned)
                .append("\"subuserName\": \"")
                .append(subuserName)
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
        if (roles != null) {
            sb.append(aligned)
                .append("\"RoleView\": ")
                .append(StringHelper.arrayToString(roles, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
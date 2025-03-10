package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class GetSubUsersRequest implements Alignable {
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
    public GetSubUsersRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private Boolean withRoles;

    @RequestField(name="with_roles")
    /**
    * Whether to show subuser's roles
    */
    public Boolean getWithRoles() {
        return this.withRoles;
    }

    public boolean hasWithRoles() {
        return this.withRoles != null;
    }

    /**
    * Whether to show subuser's roles
    */
    public GetSubUsersRequest setWithRoles(boolean d) {
        this.withRoles = Boolean.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetSubUsersRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetSubUsersRequest setCount(long d) {
        this.count = Long.valueOf(d);
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
        if (withRoles != null) {
            sb.append(aligned)
                .append("\"withRoles\": \"")
                .append(withRoles)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
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
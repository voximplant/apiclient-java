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

public class GetAuthorizedAccountIPsRequest implements Alignable {
    private String authorizedIp;

    @RequestField(name="authorized_ip")
    /**
    * The authorized IP4 or network to filter
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    /**
    * The authorized IP4 or network to filter
    */
    public GetAuthorizedAccountIPsRequest setAuthorizedIp(String d) {
        this.authorizedIp = d;
        return this;
    }

    private Boolean allowed;

    @RequestField(name="allowed")
    /**
    * The allowed flag to filter
    */
    public Boolean getAllowed() {
        return this.allowed;
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    /**
    * The allowed flag to filter
    */
    public GetAuthorizedAccountIPsRequest setAllowed(boolean d) {
        this.allowed = Boolean.valueOf(d);
        return this;
    }

    private String containsIp;

    @RequestField(name="contains_ip")
    /**
    * Specify the parameter to filter the networks that contains the
    * particular IP4
    */
    public String getContainsIp() {
        return this.containsIp;
    }

    public boolean hasContainsIp() {
        return this.containsIp != null;
    }

    /**
    * Specify the parameter to filter the networks that contains the
    * particular IP4
    */
    public GetAuthorizedAccountIPsRequest setContainsIp(String d) {
        this.containsIp = d;
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
    public GetAuthorizedAccountIPsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output
    */
    public GetAuthorizedAccountIPsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The IP address description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The IP address description
    */
    public GetAuthorizedAccountIPsRequest setDescription(String d) {
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
        if (authorizedIp != null) {
            sb.append(aligned)
                .append("\"authorizedIp\": \"")
                .append(authorizedIp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (allowed != null) {
            sb.append(aligned)
                .append("\"allowed\": \"")
                .append(allowed)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (containsIp != null) {
            sb.append(aligned)
                .append("\"containsIp\": \"")
                .append(containsIp)
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
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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
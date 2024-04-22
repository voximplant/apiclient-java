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

public class GetApplicationsRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter
    */
    public GetApplicationsRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name part to filter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name part to filter
    */
    public GetApplicationsRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean withRules;

    @RequestField(name="with_rules")
    /**
    * Whether to get bound rules info
    */
    public Boolean getWithRules() {
        return this.withRules;
    }

    public boolean hasWithRules() {
        return this.withRules != null;
    }

    /**
    * Whether to get bound rules info
    */
    public GetApplicationsRequest setWithRules(boolean d) {
        this.withRules = Boolean.valueOf(d);
        return this;
    }

    private Boolean withScenarios;

    @RequestField(name="with_scenarios")
    /**
    * Whether to get bound rules and scenarios info
    */
    public Boolean getWithScenarios() {
        return this.withScenarios;
    }

    public boolean hasWithScenarios() {
        return this.withScenarios != null;
    }

    /**
    * Whether to get bound rules and scenarios info
    */
    public GetApplicationsRequest setWithScenarios(boolean d) {
        this.withScenarios = Boolean.valueOf(d);
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
    public GetApplicationsRequest setCount(long d) {
        this.count = Long.valueOf(d);
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
    public GetApplicationsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withRules != null) {
            sb.append(aligned)
                .append("\"withRules\": \"")
                .append(withRules)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withScenarios != null) {
            sb.append(aligned)
                .append("\"withScenarios\": \"")
                .append(withScenarios)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
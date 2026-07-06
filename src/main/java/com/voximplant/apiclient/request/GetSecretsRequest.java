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

public class GetSecretsRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID. <b>Required</b> unless <b>application_name</b> is
    * provided.
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID. <b>Required</b> unless <b>application_name</b> is
    * provided.
    */
    public GetSecretsRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Application name. <b>Required</b> unless <b>application_id</b> is
    * provided.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Application name. <b>Required</b> unless <b>application_id</b> is
    * provided.
    */
    public GetSecretsRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String secretNamePart;

    @RequestField(name="secret_name_part")
    /**
    * Filter by the secret name part
    */
    public String getSecretNamePart() {
        return this.secretNamePart;
    }

    public boolean hasSecretNamePart() {
        return this.secretNamePart != null;
    }

    /**
    * Filter by the secret name part
    */
    public GetSecretsRequest setSecretNamePart(String d) {
        this.secretNamePart = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum returning record number
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum returning record number
    */
    public GetSecretsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * First <b>N</b> records to be skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * First <b>N</b> records to be skipped in the output
    */
    public GetSecretsRequest setOffset(long d) {
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
        if (secretNamePart != null) {
            sb.append(aligned)
                .append("\"secretNamePart\": \"")
                .append(secretNamePart)
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
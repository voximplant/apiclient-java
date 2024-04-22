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

public class AddApplicationRequest implements Alignable {
    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The short application name in format \[a-z\]\[a-z0-9-\]{1,64}
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The short application name in format \[a-z\]\[a-z0-9-\]{1,64}
    */
    public AddApplicationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean secureRecordStorage;

    @RequestField(name="secure_record_storage")
    /**
    * Whether to enable secure storage for all logs and records of the
    * application
    */
    public Boolean getSecureRecordStorage() {
        return this.secureRecordStorage;
    }

    public boolean hasSecureRecordStorage() {
        return this.secureRecordStorage != null;
    }

    /**
    * Whether to enable secure storage for all logs and records of the
    * application
    */
    public AddApplicationRequest setSecureRecordStorage(boolean d) {
        this.secureRecordStorage = Boolean.valueOf(d);
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
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (secureRecordStorage != null) {
            sb.append(aligned)
                .append("\"secureRecordStorage\": \"")
                .append(secureRecordStorage)
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
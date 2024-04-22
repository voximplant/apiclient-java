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

public class SetApplicationInfoRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID
    */
    public SetApplicationInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String requiredApplicationName;

    @RequestField(name="required_application_name")
    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public String getRequiredApplicationName() {
        return this.requiredApplicationName;
    }

    public boolean hasRequiredApplicationName() {
        return this.requiredApplicationName != null;
    }

    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public SetApplicationInfoRequest setRequiredApplicationName(String d) {
        this.requiredApplicationName = d;
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The new short application name in format [a-z][a-z0-9-]{1,79}
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The new short application name in format [a-z][a-z0-9-]{1,79}
    */
    public SetApplicationInfoRequest setApplicationName(String d) {
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
    public SetApplicationInfoRequest setSecureRecordStorage(boolean d) {
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (requiredApplicationName != null) {
            sb.append(aligned)
                .append("\"requiredApplicationName\": \"")
                .append(requiredApplicationName)
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
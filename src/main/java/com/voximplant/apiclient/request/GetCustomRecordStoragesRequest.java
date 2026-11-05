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

public class GetCustomRecordStoragesRequest implements Alignable {
    private Long customRecordStorageId;

    @RequestField(name="custom_record_storage_id")
    /**
    * Unique identifier of the custom record storage configuration.
    */
    public Long getCustomRecordStorageId() {
        return this.customRecordStorageId;
    }

    public boolean hasCustomRecordStorageId() {
        return this.customRecordStorageId != null;
    }

    /**
    * Unique identifier of the custom record storage configuration.
    */
    public GetCustomRecordStoragesRequest setCustomRecordStorageId(long d) {
        this.customRecordStorageId = Long.valueOf(d);
        return this;
    }

    private Boolean withApplicationsAttached;

    @RequestField(name="with_applications_attached")
    /**
    * Whether to include attached applications in the response or execution.
    */
    public Boolean getWithApplicationsAttached() {
        return this.withApplicationsAttached;
    }

    public boolean hasWithApplicationsAttached() {
        return this.withApplicationsAttached != null;
    }

    /**
    * Whether to include attached applications in the response or execution.
    */
    public GetCustomRecordStoragesRequest setWithApplicationsAttached(boolean d) {
        this.withApplicationsAttached = Boolean.valueOf(d);
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
        if (customRecordStorageId != null) {
            sb.append(aligned)
                .append("\"customRecordStorageId\": \"")
                .append(customRecordStorageId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withApplicationsAttached != null) {
            sb.append(aligned)
                .append("\"withApplicationsAttached\": \"")
                .append(withApplicationsAttached)
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
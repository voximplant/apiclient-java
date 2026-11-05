package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [AddCustomRecordStorage] function result.
*/
public class AddCustomRecordStorageInfoType implements Alignable {

    private Long customRecordStorageId;

    /**
    * Unique identifier of the custom record storage configuration.
    */
    public Long getCustomRecordStorageId() {
        return this.customRecordStorageId;
    }

    public boolean hasCustomRecordStorageId() {
        return this.customRecordStorageId != null;
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
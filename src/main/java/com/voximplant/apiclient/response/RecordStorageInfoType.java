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
* The [GetRecordStorages] function result.
*/
public class RecordStorageInfoType implements Alignable {

    private Long recordStorageId;

    /**
    * The record storage ID
    */
    public Long getRecordStorageId() {
        return this.recordStorageId;
    }

    public boolean hasRecordStorageId() {
        return this.recordStorageId != null;
    }

    private String recordStorageName;

    /**
    * The record storage name
    */
    public String getRecordStorageName() {
        return this.recordStorageName;
    }

    public boolean hasRecordStorageName() {
        return this.recordStorageName != null;
    }

    private Boolean isPublic;

    /**
    * Whether the storage is public (The admin permission required)
    */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public boolean hasIsPublic() {
        return this.isPublic != null;
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
        if (recordStorageId != null) {
            sb.append(aligned)
                .append("\"recordStorageId\": \"")
                .append(recordStorageId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (recordStorageName != null) {
            sb.append(aligned)
                .append("\"recordStorageName\": \"")
                .append(recordStorageName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isPublic != null) {
            sb.append(aligned)
                .append("\"isPublic\": \"")
                .append(isPublic)
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
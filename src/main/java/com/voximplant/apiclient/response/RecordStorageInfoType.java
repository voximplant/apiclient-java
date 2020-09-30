package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetRecordStorages] function result.
*/
public class RecordStorageInfoType {

    private Long recordStorageId;

    /**
    * The record storage ID.
    */
    public long getRecordStorageId() {
        return this.recordStorageId.longValue();
    }

    public boolean hasRecordStorageId() {
        return this.recordStorageId != null;
    }

    private String recordStorageName;

    /**
    * The record storage name.
    */
    public String getRecordStorageName() {
        return this.recordStorageName;
    }

    public boolean hasRecordStorageName() {
        return this.recordStorageName != null;
    }

    private Boolean isPublic;

    /**
    * The public flag (The admin permission required).
    */
    public boolean getIsPublic() {
        return this.isPublic.booleanValue();
    }

    public boolean hasIsPublic() {
        return this.isPublic != null;
    }

}
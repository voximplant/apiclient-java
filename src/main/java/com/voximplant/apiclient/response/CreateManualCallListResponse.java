package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CreateManualCallListResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Boolean result;

    /**
    * true
    */
    public boolean getResult() {
        return this.result.booleanValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long count;

    /**
    * The number of stored records.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long listId;

    /**
    * The list ID.
    */
    public long getListId() {
        return this.listId.longValue();
    }

    public boolean hasListId() {
        return this.listId != null;
    }

}
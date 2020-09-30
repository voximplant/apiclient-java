package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class StopCallListProcessingRequest {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * The list Id.
    */
    public long getListId() {
        return this.listId.longValue();
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list Id.
    */
    public StopCallListProcessingRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

}
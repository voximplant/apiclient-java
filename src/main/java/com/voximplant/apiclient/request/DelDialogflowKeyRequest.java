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

public class DelDialogflowKeyRequest {
    private Long dialogflowKeyId;

    @RequestField(name="dialogflow_key_id")
    /**
    * The Dialogflow key's ID.
    */
    public long getDialogflowKeyId() {
        return this.dialogflowKeyId.longValue();
    }

    public boolean hasDialogflowKeyId() {
        return this.dialogflowKeyId != null;
    }

    /**
    * The Dialogflow key's ID.
    */
    public DelDialogflowKeyRequest setDialogflowKeyId(long d) {
        this.dialogflowKeyId = Long.valueOf(d);
        return this;
    }

}
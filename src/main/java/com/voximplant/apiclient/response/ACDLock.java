package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [ACD](/docs/references/voxengine/voxengine/enqueueacdrequest)
* lock type.
*/
public class ACDLock {

    private String id;

    /**
    * The ACD lock ID.
    */
    public String getId() {
        return this.id;
    }

    public boolean hasId() {
        return this.id != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The UTC lock created time in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

}
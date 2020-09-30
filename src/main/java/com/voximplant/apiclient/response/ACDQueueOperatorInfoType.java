package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The 'acd_queues' element of the [GetUsers] function result.
*/
public class ACDQueueOperatorInfoType {

    private Long acdQueueId;

    /**
    * The ACD queue ID.
    */
    public long getAcdQueueId() {
        return this.acdQueueId.longValue();
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private String acdQueueName;

    /**
    * The ACD queue name.
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    private Boolean autoLink;

    /**
    * The user is bound to the ACD queue in manual mode if false.
    */
    public boolean getAutoLink() {
        return this.autoLink.booleanValue();
    }

    public boolean hasAutoLink() {
        return this.autoLink != null;
    }

}
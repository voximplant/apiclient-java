package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [SmartQueueMetricsResult] details.
*/
public class SmartQueueMetricsGroups {

    private Long sqQueueId;

    /**
    * The smart queue ID.
    */
    public long getSqQueueId() {
        return this.sqQueueId.longValue();
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    private String sqQueueName;

    /**
    * The smart queue name.
    */
    public String getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    private Long userId;

    /**
    * The user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The user display name.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private SmartQueueMetricsGroupsValues[] values;

    /**
    * The group values.
    */
    public SmartQueueMetricsGroupsValues[] getValues() {
        return this.values;
    }

    public boolean hasValues() {
        return this.values != null;
    }

}
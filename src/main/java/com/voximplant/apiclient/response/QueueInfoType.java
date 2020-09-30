package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetQueues] function result item.
*/
public class QueueInfoType {

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
    * The queue name.
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    private Long applicationId;

    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private Long acdQueuePriority;

    /**
    * The integer queue priority. The highest priority is 0.
    */
    public long getAcdQueuePriority() {
        return this.acdQueuePriority.longValue();
    }

    public boolean hasAcdQueuePriority() {
        return this.acdQueuePriority != null;
    }

    private Long serviceProbability;

    /**
    * The value in the range of [0.5 ... 1.0]. The value 1.0 means the
    * service probability 100% in challenge with a lower priority queue.
    */
    public long getServiceProbability() {
        return this.serviceProbability.longValue();
    }

    public boolean hasServiceProbability() {
        return this.serviceProbability != null;
    }

    private Boolean autoBinding;

    /**
    * Set false to disable the auto binding of operators to a queue by
    * skills comparing.
    */
    public boolean getAutoBinding() {
        return this.autoBinding.booleanValue();
    }

    public boolean hasAutoBinding() {
        return this.autoBinding != null;
    }

    private Long maxWaitingTime;

    /**
    * The maximum predicted waiting time in minutes. When a call is going
    * to be enqueued to the queue, its predicted waiting time should be
    * less or equal to the maximum predicted waiting time; otherwise, a
    * call would be rejected.
    */
    public long getMaxWaitingTime() {
        return this.maxWaitingTime.longValue();
    }

    public boolean hasMaxWaitingTime() {
        return this.maxWaitingTime != null;
    }

    private Long maxQueueSize;

    /**
    * The maximum number of calls that can be enqueued into this queue.
    */
    public long getMaxQueueSize() {
        return this.maxQueueSize.longValue();
    }

    public boolean hasMaxQueueSize() {
        return this.maxQueueSize != null;
    }

    private Long averageServiceTime;

    /**
    * The average service time in seconds. Specify the parameter to correct
    * or initialize the waiting time prediction.
    */
    public long getAverageServiceTime() {
        return this.averageServiceTime.longValue();
    }

    public boolean hasAverageServiceTime() {
        return this.averageServiceTime != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The ACD queue creating UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The ACD queue editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date deleted;

    /**
    * The ACD queue deleting UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getDeleted() {
        return this.deleted;
    }

    public boolean hasDeleted() {
        return this.deleted != null;
    }

    private QueueUsers[] users;

    /**
    * The queue users info.
    */
    public QueueUsers[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

    private QueueSkills[] skills;

    /**
    * The queue skills info.
    */
    public QueueSkills[] getSkills() {
        return this.skills;
    }

    public boolean hasSkills() {
        return this.skills != null;
    }

    private long[] slThresholds;

    /**
    * The service level thresholds in seconds.
    */
    public long[] getSlThresholds() {
        return this.slThresholds;
    }

    public boolean hasSlThresholds() {
        return this.slThresholds != null;
    }

}
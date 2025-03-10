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
* The [GetQueues] function result item.
*/
public class QueueInfoType implements Alignable {

    private Long acdQueueId;

    /**
    * The ACD queue ID
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private String acdQueueName;

    /**
    * The queue name
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    private Long applicationId;

    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private Long acdQueuePriority;

    /**
    * The integer queue priority. The highest priority is 0
    */
    public Long getAcdQueuePriority() {
        return this.acdQueuePriority;
    }

    public boolean hasAcdQueuePriority() {
        return this.acdQueuePriority != null;
    }

    private Long serviceProbability;

    /**
    * The value in the range of [0.5 ... 1.0]. The value 1.0 means the
    * service probability 100% in challenge with a lower priority queue
    */
    public Long getServiceProbability() {
        return this.serviceProbability;
    }

    public boolean hasServiceProbability() {
        return this.serviceProbability != null;
    }

    private Boolean autoBinding;

    /**
    * Whether to enable the auto binding of operators to a queue by skills
    * comparing
    */
    public Boolean getAutoBinding() {
        return this.autoBinding;
    }

    public boolean hasAutoBinding() {
        return this.autoBinding != null;
    }

    private Long maxWaitingTime;

    /**
    * The maximum predicted waiting time in minutes. When a call is going
    * to be enqueued to the queue, its predicted waiting time should be
    * less or equal to the maximum predicted waiting time; otherwise, a
    * call would be rejected
    */
    public Long getMaxWaitingTime() {
        return this.maxWaitingTime;
    }

    public boolean hasMaxWaitingTime() {
        return this.maxWaitingTime != null;
    }

    private Long maxQueueSize;

    /**
    * The maximum number of calls that can be enqueued into this queue
    */
    public Long getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public boolean hasMaxQueueSize() {
        return this.maxQueueSize != null;
    }

    private Long averageServiceTime;

    /**
    * The average service time in seconds. Specify the parameter to correct
    * or initialize the waiting time prediction
    */
    public Long getAverageServiceTime() {
        return this.averageServiceTime;
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
    * The queue users info
    */
    public QueueUsers[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

    private QueueSkills[] skills;

    /**
    * The queue skills info
    */
    public QueueSkills[] getSkills() {
        return this.skills;
    }

    public boolean hasSkills() {
        return this.skills != null;
    }

    private Long[] slThresholds;

    /**
    * The service level thresholds in seconds
    */
    public Long[] getSlThresholds() {
        return this.slThresholds;
    }

    public boolean hasSlThresholds() {
        return this.slThresholds != null;
    }

    private Long operatorcount;

    /**
    * Number of agents bound to the queue
    */
    public Long getOperatorcount() {
        return this.operatorcount;
    }

    public boolean hasOperatorcount() {
        return this.operatorcount != null;
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
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueName != null) {
            sb.append(aligned)
                .append("\"acdQueueName\": \"")
                .append(acdQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueuePriority != null) {
            sb.append(aligned)
                .append("\"acdQueuePriority\": \"")
                .append(acdQueuePriority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serviceProbability != null) {
            sb.append(aligned)
                .append("\"serviceProbability\": \"")
                .append(serviceProbability)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoBinding != null) {
            sb.append(aligned)
                .append("\"autoBinding\": \"")
                .append(autoBinding)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxWaitingTime != null) {
            sb.append(aligned)
                .append("\"maxWaitingTime\": \"")
                .append(maxWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxQueueSize != null) {
            sb.append(aligned)
                .append("\"maxQueueSize\": \"")
                .append(maxQueueSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (averageServiceTime != null) {
            sb.append(aligned)
                .append("\"averageServiceTime\": \"")
                .append(averageServiceTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deleted != null) {
            sb.append(aligned)
                .append("\"deleted\": \"")
                .append(deleted)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (users != null) {
            sb.append(aligned)
                .append("\"QueueUsers\": ")
                .append(StringHelper.arrayToString(users, alignment + 1))
                .append(System.lineSeparator());
        }
        if (skills != null) {
            sb.append(aligned)
                .append("\"QueueSkills\": ")
                .append(StringHelper.arrayToString(skills, alignment + 1))
                .append(System.lineSeparator());
        }
        if (slThresholds != null) {
            sb.append(aligned)
                .append("\"number\": ")
                .append(StringHelper.arrayToString(slThresholds, alignment + 1))
                .append(System.lineSeparator());
        }
        if (operatorcount != null) {
            sb.append(aligned)
                .append("\"operatorcount\": \"")
                .append(operatorcount)
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
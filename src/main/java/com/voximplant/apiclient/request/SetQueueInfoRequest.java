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

public class SetQueueInfoRequest {
    private Long acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID.
    */
    public long getAcdQueueId() {
        return this.acdQueueId.longValue();
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID.
    */
    public SetQueueInfoRequest setAcdQueueId(long d) {
        this.acdQueueId = Long.valueOf(d);
        return this;
    }

    private String acdQueueName;

    @RequestField(name="acd_queue_name")
    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    */
    public SetQueueInfoRequest setAcdQueueName(String d) {
        this.acdQueueName = d;
        return this;
    }

    private String newAcdQueueName;

    @RequestField(name="new_acd_queue_name")
    /**
    * The new queue name. The length must be less than 100.
    */
    public String getNewAcdQueueName() {
        return this.newAcdQueueName;
    }

    public boolean hasNewAcdQueueName() {
        return this.newAcdQueueName != null;
    }

    /**
    * The new queue name. The length must be less than 100.
    */
    public SetQueueInfoRequest setNewAcdQueueName(String d) {
        this.newAcdQueueName = d;
        return this;
    }

    private Long acdQueuePriority;

    @RequestField(name="acd_queue_priority")
    /**
    * The integer queue priority. The highest priority is 0.
    */
    public long getAcdQueuePriority() {
        return this.acdQueuePriority.longValue();
    }

    public boolean hasAcdQueuePriority() {
        return this.acdQueuePriority != null;
    }

    /**
    * The integer queue priority. The highest priority is 0.
    */
    public SetQueueInfoRequest setAcdQueuePriority(long d) {
        this.acdQueuePriority = Long.valueOf(d);
        return this;
    }

    private Boolean autoBinding;

    @RequestField(name="auto_binding")
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

    /**
    * Set false to disable the auto binding of operators to a queue by
    * skills comparing.
    */
    public SetQueueInfoRequest setAutoBinding(boolean d) {
        this.autoBinding = Boolean.valueOf(d);
        return this;
    }

    private Long serviceProbability;

    @RequestField(name="service_probability")
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

    /**
    * The value in the range of [0.5 ... 1.0]. The value 1.0 means the
    * service probability 100% in challenge with a lower priority queue.
    */
    public SetQueueInfoRequest setServiceProbability(long d) {
        this.serviceProbability = Long.valueOf(d);
        return this;
    }

    private Long maxQueueSize;

    @RequestField(name="max_queue_size")
    /**
    * The max queue size.
    */
    public long getMaxQueueSize() {
        return this.maxQueueSize.longValue();
    }

    public boolean hasMaxQueueSize() {
        return this.maxQueueSize != null;
    }

    /**
    * The max queue size.
    */
    public SetQueueInfoRequest setMaxQueueSize(long d) {
        this.maxQueueSize = Long.valueOf(d);
        return this;
    }

    private Long maxWaitingTime;

    @RequestField(name="max_waiting_time")
    /**
    * The max predicted waiting time in minutes. The client is rejected if
    * the predicted waiting time is greater than the max predicted waiting
    * time.
    */
    public long getMaxWaitingTime() {
        return this.maxWaitingTime.longValue();
    }

    public boolean hasMaxWaitingTime() {
        return this.maxWaitingTime != null;
    }

    /**
    * The max predicted waiting time in minutes. The client is rejected if
    * the predicted waiting time is greater than the max predicted waiting
    * time.
    */
    public SetQueueInfoRequest setMaxWaitingTime(long d) {
        this.maxWaitingTime = Long.valueOf(d);
        return this;
    }

    private Long averageServiceTime;

    @RequestField(name="average_service_time")
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

    /**
    * The average service time in seconds. Specify the parameter to correct
    * or initialize the waiting time prediction.
    */
    public SetQueueInfoRequest setAverageServiceTime(long d) {
        this.averageServiceTime = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The new application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The new application ID.
    */
    public SetQueueInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

}
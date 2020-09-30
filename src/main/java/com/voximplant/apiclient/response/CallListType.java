package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Information about call list's configurations.
*/
public class CallListType {

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

    private String listName;

    /**
    * The list name.
    */
    public String getListName() {
        return this.listName;
    }

    public boolean hasListName() {
        return this.listName != null;
    }

    private Long priority;

    /**
    * The priority of the call list.
    */
    public long getPriority() {
        return this.priority.longValue();
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    private Long ruleId;

    /**
    * The rule id.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private Long maxSimultaneous;

    /**
    * The maximum number of simultaneous tasks.
    */
    public long getMaxSimultaneous() {
        return this.maxSimultaneous.longValue();
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    private Long numAttempts;

    /**
    * The number of task attempts run, which failed to call.
    */
    public long getNumAttempts() {
        return this.numAttempts.longValue();
    }

    public boolean hasNumAttempts() {
        return this.numAttempts != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date dtSubmit;

    /**
    * The date of submitted the list in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getDtSubmit() {
        return this.dtSubmit;
    }

    public boolean hasDtSubmit() {
        return this.dtSubmit != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date dtComplete;

    /**
    * The completion date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getDtComplete() {
        return this.dtComplete;
    }

    public boolean hasDtComplete() {
        return this.dtComplete != null;
    }

    private Long intervalSeconds;

    /**
    * The interval between attempts in seconds.
    */
    public long getIntervalSeconds() {
        return this.intervalSeconds.longValue();
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    private String status;

    /**
    * The status name. The possible values are: __In progress__,
    * __Completed__, __Canceled__.
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

}
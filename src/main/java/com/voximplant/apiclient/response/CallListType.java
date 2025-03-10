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
* Information about call list's configurations.
*/
public class CallListType implements Alignable {

    private Long listId;

    /**
    * The list ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    private String listName;

    /**
    * The list name
    */
    public String getListName() {
        return this.listName;
    }

    public boolean hasListName() {
        return this.listName != null;
    }

    private Long priority;

    /**
    * The priority of the call list
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    private Long ruleId;

    /**
    * The rule id
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private Long maxSimultaneous;

    /**
    * The maximum number of simultaneous tasks
    */
    public Long getMaxSimultaneous() {
        return this.maxSimultaneous;
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    private Long numAttempts;

    /**
    * The number of task attempts run, which failed to call
    */
    public Long getNumAttempts() {
        return this.numAttempts;
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
    * The interval between attempts in seconds
    */
    public Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    private String status;

    /**
    * The status name. The possible values are __In progress__,
    * __Completed__, __Canceled__
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
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
        if (listId != null) {
            sb.append(aligned)
                .append("\"listId\": \"")
                .append(listId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (listName != null) {
            sb.append(aligned)
                .append("\"listName\": \"")
                .append(listName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxSimultaneous != null) {
            sb.append(aligned)
                .append("\"maxSimultaneous\": \"")
                .append(maxSimultaneous)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (numAttempts != null) {
            sb.append(aligned)
                .append("\"numAttempts\": \"")
                .append(numAttempts)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (dtSubmit != null) {
            sb.append(aligned)
                .append("\"dtSubmit\": \"")
                .append(dtSubmit)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (dtComplete != null) {
            sb.append(aligned)
                .append("\"dtComplete\": \"")
                .append(dtComplete)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (intervalSeconds != null) {
            sb.append(aligned)
                .append("\"intervalSeconds\": \"")
                .append(intervalSeconds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
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
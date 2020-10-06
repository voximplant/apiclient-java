package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The 'acd_queues' element of the [GetUsers] function result.
*/
public class ACDQueueOperatorInfoType implements Alignable {

    private Long acdQueueId;

    /**
    * The ACD queue ID.
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
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
    public Boolean getAutoLink() {
        return this.autoLink;
    }

    public boolean hasAutoLink() {
        return this.autoLink != null;
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
        if (autoLink != null) {
            sb.append(aligned)
                .append("\"autoLink\": \"")
                .append(autoLink)
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
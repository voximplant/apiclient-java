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
* The current operator's status. Refer to <a
* href='https://voximplant.com/docs/guides/smartqueue/howto#set-up-an-operator's-workspace'>this
* guide</a> to read more about SmartQueue operator statuses
*/
public class SmartQueueState_Agent_Status implements Alignable {

    private SmartQueueState_Agent_Status_Type IM;

    /**
    * The IM status info
    */
    public SmartQueueState_Agent_Status_Type getIM() {
        return this.IM;
    }

    public boolean hasIM() {
        return this.IM != null;
    }

    private SmartQueueState_Agent_Status_Type CALL;

    /**
    * The CALL status info
    */
    public SmartQueueState_Agent_Status_Type getCALL() {
        return this.CALL;
    }

    public boolean hasCALL() {
        return this.CALL != null;
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
        if (IM != null) {
            sb.append(aligned)
                .append("\"IM\": \"")
                .append(IM)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (CALL != null) {
            sb.append(aligned)
                .append("\"CALL\": \"")
                .append(CALL)
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
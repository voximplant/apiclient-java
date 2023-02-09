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
* The [GetACDState] function result item.
*/
public class ACDStateType implements Alignable {

    private ACDQueueStateType[] acdQueues;

    /**
    * The queues' states
    */
    public ACDQueueStateType[] getAcdQueues() {
        return this.acdQueues;
    }

    public boolean hasAcdQueues() {
        return this.acdQueues != null;
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
        if (acdQueues != null) {
            sb.append(aligned)
                .append("\"ACDQueueStateType\": ")
                .append(StringHelper.arrayToString(acdQueues, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
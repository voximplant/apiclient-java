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
* Agent binding mode for the [SQ_BindAgent] function.
*/
public class SQAgentBindingModes implements Alignable {

    private String addQueues;

    /**
    * Add additional queues to the agent
    */
    public String getAddQueues() {
        return this.addQueues;
    }

    public boolean hasAddQueues() {
        return this.addQueues != null;
    }

    private String replaceAgents;

    /**
    * Unbind all the existing agents from the queue and bind new agents
    */
    public String getReplaceAgents() {
        return this.replaceAgents;
    }

    public boolean hasReplaceAgents() {
        return this.replaceAgents != null;
    }

    private String add;

    /**
    * Remove all the queues from the agent and bind new queues
    */
    public String getAdd() {
        return this.add;
    }

    public boolean hasAdd() {
        return this.add != null;
    }

    private String replace;

    /**
    * Unbind all the existing agents and all the existing queues, then bind
    * the specified queues to the specified agents
    */
    public String getReplace() {
        return this.replace;
    }

    public boolean hasReplace() {
        return this.replace != null;
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
        if (addQueues != null) {
            sb.append(aligned)
                .append("\"addQueues\": \"")
                .append(addQueues)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (replaceAgents != null) {
            sb.append(aligned)
                .append("\"replaceAgents\": \"")
                .append(replaceAgents)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (add != null) {
            sb.append(aligned)
                .append("\"add\": \"")
                .append(add)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (replace != null) {
            sb.append(aligned)
                .append("\"replace\": \"")
                .append(replace)
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
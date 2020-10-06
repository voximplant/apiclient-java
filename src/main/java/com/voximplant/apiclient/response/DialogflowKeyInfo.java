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
* The Dialogflow keys list info.
*/
public class DialogflowKeyInfo implements Alignable {

    private Long dialogflowKeyId;

    /**
    * The Dialogflow key's id
    */
    public Long getDialogflowKeyId() {
        return this.dialogflowKeyId;
    }

    public boolean hasDialogflowKeyId() {
        return this.dialogflowKeyId != null;
    }

    private DialogflowKey content;

    /**
    * The key's content.
    */
    public DialogflowKey getContent() {
        return this.content;
    }

    public boolean hasContent() {
        return this.content != null;
    }

    private ApplicationInfoType[] applications;

    /**
    * Bound applications.
    */
    public ApplicationInfoType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
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
        if (dialogflowKeyId != null) {
            sb.append(aligned)
                .append("\"dialogflowKeyId\": \"")
                .append(dialogflowKeyId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (content != null) {
            sb.append(aligned)
                .append("\"content\": \"")
                .append(content)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applications != null) {
            sb.append(aligned)
                .append("\"ApplicationInfoType\": ")
                .append(StringHelper.arrayToString(applications, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
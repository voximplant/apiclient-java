package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The Dialogflow keys list info.
*/
public class DialogflowKeyInfo {

    private Long dialogflowKeyId;

    /**
    * The Dialogflow key's id
    */
    public long getDialogflowKeyId() {
        return this.dialogflowKeyId.longValue();
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

}
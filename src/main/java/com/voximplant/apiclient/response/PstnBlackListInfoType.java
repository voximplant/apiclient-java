package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The PSTN black list item info.
*/
public class PstnBlackListInfoType {

    private Long pstnBlacklistId;

    /**
    * The black list item ID.
    */
    public long getPstnBlacklistId() {
        return this.pstnBlacklistId.longValue();
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    private String pstnBlacklistPhone ;

    /**
    * The phone number.
    */
    public String getPstnBlacklistPhone () {
        return this.pstnBlacklistPhone ;
    }

    public boolean hasPstnBlacklistPhone () {
        return this.pstnBlacklistPhone  != null;
    }

}
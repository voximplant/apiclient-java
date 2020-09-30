package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [AddSubUser] function result.
*/
public class SubUserID {

    private Long subuserId;

    /**
    * The subuser ID.
    */
    public long getSubuserId() {
        return this.subuserId.longValue();
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

}
package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Info about services that were provided.
*/
public class ClassificationUnit {

    private String type;

    /**
    * The classification type.
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private String info;

    /**
    * The classification info.
    */
    public String getInfo() {
        return this.info;
    }

    public boolean hasInfo() {
        return this.info != null;
    }

    private String errorCode;

    /**
    * Classification error code (if any).
    */
    public String getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
    }

}
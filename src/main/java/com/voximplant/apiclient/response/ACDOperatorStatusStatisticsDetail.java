package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual record in [ACDOperatorStatusStatisticsType].
*/
public class ACDOperatorStatusStatisticsDetail {

    private ACDStatisticsItemType OFFLINE;

    /**
    * The OFFLINE status statistics
    */
    public ACDStatisticsItemType getOFFLINE() {
        return this.OFFLINE;
    }

    public boolean hasOFFLINE() {
        return this.OFFLINE != null;
    }

    private ACDStatisticsItemType ONLINE;

    /**
    * The ONLINE status statistics
    */
    public ACDStatisticsItemType getONLINE() {
        return this.ONLINE;
    }

    public boolean hasONLINE() {
        return this.ONLINE != null;
    }

    private ACDStatisticsItemType READY;

    /**
    * The READY status statistics
    */
    public ACDStatisticsItemType getREADY() {
        return this.READY;
    }

    public boolean hasREADY() {
        return this.READY != null;
    }

    private ACDStatisticsItemType BANNED;

    /**
    * The BANNED status statistics
    */
    public ACDStatisticsItemType getBANNED() {
        return this.BANNED;
    }

    public boolean hasBANNED() {
        return this.BANNED != null;
    }

    private ACDStatisticsItemType INSERVICE;

    /**
    * The IN_SERVICE status statistics
    */
    public ACDStatisticsItemType getINSERVICE() {
        return this.INSERVICE;
    }

    public boolean hasINSERVICE() {
        return this.INSERVICE != null;
    }

    private ACDStatisticsItemType AFTERSERVICE;

    /**
    * The AFTER_SERVICE status statistics
    */
    public ACDStatisticsItemType getAFTERSERVICE() {
        return this.AFTERSERVICE;
    }

    public boolean hasAFTERSERVICE() {
        return this.AFTERSERVICE != null;
    }

    private ACDStatisticsItemType TIMEOUT;

    /**
    * The TIMEOUT status statistics
    */
    public ACDStatisticsItemType getTIMEOUT() {
        return this.TIMEOUT;
    }

    public boolean hasTIMEOUT() {
        return this.TIMEOUT != null;
    }

    private ACDStatisticsItemType DND;

    /**
    * The DND status statistics
    */
    public ACDStatisticsItemType getDND() {
        return this.DND;
    }

    public boolean hasDND() {
        return this.DND != null;
    }

}
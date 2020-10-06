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
* Individual record in [ACDOperatorStatusStatisticsType].
*/
public class ACDOperatorStatusStatisticsDetail implements Alignable {

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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (OFFLINE != null) {
            sb.append(aligned)
                .append("\"OFFLINE\": \"")
                .append(OFFLINE)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ONLINE != null) {
            sb.append(aligned)
                .append("\"ONLINE\": \"")
                .append(ONLINE)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (READY != null) {
            sb.append(aligned)
                .append("\"READY\": \"")
                .append(READY)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (BANNED != null) {
            sb.append(aligned)
                .append("\"BANNED\": \"")
                .append(BANNED)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (INSERVICE != null) {
            sb.append(aligned)
                .append("\"INSERVICE\": \"")
                .append(INSERVICE)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (AFTERSERVICE != null) {
            sb.append(aligned)
                .append("\"AFTERSERVICE\": \"")
                .append(AFTERSERVICE)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TIMEOUT != null) {
            sb.append(aligned)
                .append("\"TIMEOUT\": \"")
                .append(TIMEOUT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (DND != null) {
            sb.append(aligned)
                .append("\"DND\": \"")
                .append(DND)
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
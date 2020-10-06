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
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class CallHistoryReportCallback implements Alignable {

    private Long historyReportId;

    /**
    * The history report ID.
    */
    public Long getHistoryReportId() {
        return this.historyReportId;
    }

    public boolean hasHistoryReportId() {
        return this.historyReportId != null;
    }

    private Boolean success;

    /**
    * Is success?
    */
    public Boolean getSuccess() {
        return this.success;
    }

    public boolean hasSuccess() {
        return this.success != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date orderDate;

    /**
    * The UTC order date in format: YYYY-MM-DD HH::mm:ss
    */
    public Date getOrderDate() {
        return this.orderDate;
    }

    public boolean hasOrderDate() {
        return this.orderDate != null;
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
        if (historyReportId != null) {
            sb.append(aligned)
                .append("\"historyReportId\": \"")
                .append(historyReportId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (success != null) {
            sb.append(aligned)
                .append("\"success\": \"")
                .append(success)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (orderDate != null) {
            sb.append(aligned)
                .append("\"orderDate\": \"")
                .append(orderDate)
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
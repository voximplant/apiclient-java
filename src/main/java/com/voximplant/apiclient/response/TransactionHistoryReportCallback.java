package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class TransactionHistoryReportCallback {

    private Long historyReportId;

    /**
    * The history report ID.
    */
    public long getHistoryReportId() {
        return this.historyReportId.longValue();
    }

    public boolean hasHistoryReportId() {
        return this.historyReportId != null;
    }

    private Boolean success;

    /**
    * Is success?
    */
    public boolean getSuccess() {
        return this.success.booleanValue();
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

}
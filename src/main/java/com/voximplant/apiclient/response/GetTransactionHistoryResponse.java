package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetTransactionHistoryResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private TransactionInfoType[] result;

        public TransactionInfoType[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long totalCount;

    /**
    * The total found transaction count.
    */
    public long getTotalCount() {
        return this.totalCount.longValue();
    }

    public boolean hasTotalCount() {
        return this.totalCount != null;
    }

    private String timezone;

    /**
    * The used timezone. 'Etc/GMT' for example.
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

    private Long count;

    /**
    * The returned transaction count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long historyReportId;

    /**
    * The history report ID (async mode).
    */
    public long getHistoryReportId() {
        return this.historyReportId.longValue();
    }

    public boolean hasHistoryReportId() {
        return this.historyReportId != null;
    }

}
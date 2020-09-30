package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The history report info.
*/
public class HistoryReportType {

    private Long historyReportId;

    /**
    * The call history report ID.
    */
    public long getHistoryReportId() {
        return this.historyReportId.longValue();
    }

    public boolean hasHistoryReportId() {
        return this.historyReportId != null;
    }

    private String historyType;

    /**
    * The history report type. The following values are possible: calls,
    * transactions, audit, call_list.
    */
    public String getHistoryType() {
        return this.historyType;
    }

    public boolean hasHistoryType() {
        return this.historyType != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The creation time in the UTC timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    private String format;

    /**
    * The report format type. The following values are possible: csv
    */
    public String getFormat() {
        return this.format;
    }

    public boolean hasFormat() {
        return this.format != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date completed;

    /**
    * The UTC completion time in 24-h format: YYYY-MM-DD HH:mm:ss. The
    * report is completed if the field exists.
    */
    public Date getCompleted() {
        return this.completed;
    }

    public boolean hasCompleted() {
        return this.completed != null;
    }

    private String fileName;

    /**
    * The report file name.
    */
    public String getFileName() {
        return this.fileName;
    }

    public boolean hasFileName() {
        return this.fileName != null;
    }

    private BigDecimal fileSize;

    /**
    * The report file size.
    */
    public BigDecimal getFileSize() {
        return this.fileSize;
    }

    public boolean hasFileSize() {
        return this.fileSize != null;
    }

    private BigDecimal downloadSize;

    /**
    * The gzipped report size to download.
    */
    public BigDecimal getDownloadSize() {
        return this.downloadSize;
    }

    public boolean hasDownloadSize() {
        return this.downloadSize != null;
    }

    private Long downloadCount;

    /**
    * The download attempt count.
    */
    public long getDownloadCount() {
        return this.downloadCount.longValue();
    }

    public boolean hasDownloadCount() {
        return this.downloadCount != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date lastDownloaded;

    /**
    * The last download UTC time in 24-h format: YYYY-MM-DD HH:mm:ss. The
    * report is completed if the field exists.
    */
    public Date getLastDownloaded() {
        return this.lastDownloaded;
    }

    public boolean hasLastDownloaded() {
        return this.lastDownloaded != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date storeUntil;

    /**
    * Store the report until the UTC time in 24-h format: YYYY-MM-DD
    * HH:mm:ss. The report is completed if the field exists.
    */
    public Date getStoreUntil() {
        return this.storeUntil;
    }

    public boolean hasStoreUntil() {
        return this.storeUntil != null;
    }

    private API_Error error;

    /**
    * The report error.
    */
    public API_Error getError() {
        return this.error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Object filters;

    /**
    * The report order filters (the saved [GetCallHistory],
    * [GetTransactionHistory] parameters).
    */
    public Object getFilters() {
        return this.filters;
    }

    public boolean hasFilters() {
        return this.filters != null;
    }

    private Object calculatedData;

    /**
    * The calculated report data (the specific report data, see
    * [CalculatedCallHistoryDataType],
    * [CalculatedTransactionHistoryDataType]).
    */
    public Object getCalculatedData() {
        return this.calculatedData;
    }

    public boolean hasCalculatedData() {
        return this.calculatedData != null;
    }

}
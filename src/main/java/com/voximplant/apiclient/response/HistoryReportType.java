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
* The history report info.
*/
public class HistoryReportType implements Alignable {

    private Long historyReportId;

    /**
    * The call history report ID.
    */
    public Long getHistoryReportId() {
        return this.historyReportId;
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
    public Long getDownloadCount() {
        return this.downloadCount;
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
        if (historyType != null) {
            sb.append(aligned)
                .append("\"historyType\": \"")
                .append(historyType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (format != null) {
            sb.append(aligned)
                .append("\"format\": \"")
                .append(format)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (completed != null) {
            sb.append(aligned)
                .append("\"completed\": \"")
                .append(completed)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fileName != null) {
            sb.append(aligned)
                .append("\"fileName\": \"")
                .append(fileName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fileSize != null) {
            sb.append(aligned)
                .append("\"fileSize\": \"")
                .append(fileSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (downloadSize != null) {
            sb.append(aligned)
                .append("\"downloadSize\": \"")
                .append(downloadSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (downloadCount != null) {
            sb.append(aligned)
                .append("\"downloadCount\": \"")
                .append(downloadCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastDownloaded != null) {
            sb.append(aligned)
                .append("\"lastDownloaded\": \"")
                .append(lastDownloaded)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (storeUntil != null) {
            sb.append(aligned)
                .append("\"storeUntil\": \"")
                .append(storeUntil)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (error != null) {
            sb.append(aligned)
                .append("\"error\": \"")
                .append(error)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (filters != null) {
            sb.append(aligned)
                .append("\"filters\": \"")
                .append(filters)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (calculatedData != null) {
            sb.append(aligned)
                .append("\"calculatedData\": \"")
                .append(calculatedData)
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
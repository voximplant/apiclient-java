package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class A2PGetSmsHistoryRequest implements Alignable {
    private String sourceNumber;

    @RequestField(name="source_number")
    /**
    * The source phone number
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    /**
    * The source phone number
    */
    public A2PGetSmsHistoryRequest setSourceNumber(String d) {
        this.sourceNumber = d;
        return this;
    }

    private String destinationNumber;

    @RequestField(name="destination_number")
    /**
    * The destination phone number
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    /**
    * The destination phone number
    */
    public A2PGetSmsHistoryRequest setDestinationNumber(String d) {
        this.destinationNumber = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum number of resulting rows fetched. Must be not bigger than
    * 1000. If left blank, then the default value of 1000 is used
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum number of resulting rows fetched. Must be not bigger than
    * 1000. If left blank, then the default value of 1000 is used
    */
    public A2PGetSmsHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public A2PGetSmsHistoryRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date from which the search is to start. Format is 'yyyy-MM-dd
    * HH:mm:ss', time zone is UTC
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * Date from which the search is to start. Format is 'yyyy-MM-dd
    * HH:mm:ss', time zone is UTC
    */
    public A2PGetSmsHistoryRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date from which the search is to end. Format is 'yyyy-MM-dd
    * HH:mm:ss', time zone is UTC
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * Date from which the search is to end. Format is 'yyyy-MM-dd
    * HH:mm:ss', time zone is UTC
    */
    public A2PGetSmsHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: **json**, **csv**,
    * **xls**. The default value is **json**
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: **json**, **csv**,
    * **xls**. The default value is **json**
    */
    public A2PGetSmsHistoryRequest setOutput(String d) {
        this.output = d;
        return this;
    }

    private Long deliveryStatus;

    @RequestField(name="delivery_status")
    /**
    * The delivery status ID: QUEUED - 1, DISPATCHED - 2, ABORTED - 3,
    * REJECTED - 4, DELIVERED - 5, FAILED - 6, EXPIRED - 7, UNKNOWN - 8
    */
    public Long getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public boolean hasDeliveryStatus() {
        return this.deliveryStatus != null;
    }

    /**
    * The delivery status ID: QUEUED - 1, DISPATCHED - 2, ABORTED - 3,
    * REJECTED - 4, DELIVERED - 5, FAILED - 6, EXPIRED - 7, UNKNOWN - 8
    */
    public A2PGetSmsHistoryRequest setDeliveryStatus(long d) {
        this.deliveryStatus = Long.valueOf(d);
        return this;
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
        if (sourceNumber != null) {
            sb.append(aligned)
                .append("\"sourceNumber\": \"")
                .append(sourceNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (destinationNumber != null) {
            sb.append(aligned)
                .append("\"destinationNumber\": \"")
                .append(destinationNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fromDate != null) {
            sb.append(aligned)
                .append("\"fromDate\": \"")
                .append(fromDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (toDate != null) {
            sb.append(aligned)
                .append("\"toDate\": \"")
                .append(toDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (output != null) {
            sb.append(aligned)
                .append("\"output\": \"")
                .append(output)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deliveryStatus != null) {
            sb.append(aligned)
                .append("\"deliveryStatus\": \"")
                .append(deliveryStatus)
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
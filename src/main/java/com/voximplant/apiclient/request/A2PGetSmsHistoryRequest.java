package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class A2PGetSmsHistoryRequest {
    private String sourceNumber;

    @RequestField(name="source_number")
    /**
    * The source phone number.
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    /**
    * The source phone number.
    */
    public A2PGetSmsHistoryRequest setSourceNumber(String d) {
        this.sourceNumber = d;
        return this;
    }

    private String destinationNumber;

    @RequestField(name="destination_number")
    /**
    * The destination phone number.
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    /**
    * The destination phone number.
    */
    public A2PGetSmsHistoryRequest setDestinationNumber(String d) {
        this.destinationNumber = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum number of resulting rows fetched. Must be not more than 1000.
    * If left blank, then the default value of 1000 will be used.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum number of resulting rows fetched. Must be not more than 1000.
    * If left blank, then the default value of 1000 will be used.
    */
    public A2PGetSmsHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
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
    * HH:mm:ss'.
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * Date from which the search is to start. Format is 'yyyy-MM-dd
    * HH:mm:ss'.
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
    * Date from which the search is to end. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * Date from which the search is to end. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public A2PGetSmsHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The possible values are: json, csv.
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The possible values are: json, csv.
    */
    public A2PGetSmsHistoryRequest setOutput(String d) {
        this.output = d;
        return this;
    }

    private Long deliveryStatus;

    @RequestField(name="delivery_status")
    /**
    * The delivery status ID: QUEUED - 1, DISPATCHED - 2, ABORTED - 3,
    * REJECTED - 4, DELIVERED - 5, FAILED - 6, EXPIRED - 7, UNKNOWN - 8.
    */
    public long getDeliveryStatus() {
        return this.deliveryStatus.longValue();
    }

    public boolean hasDeliveryStatus() {
        return this.deliveryStatus != null;
    }

    /**
    * The delivery status ID: QUEUED - 1, DISPATCHED - 2, ABORTED - 3,
    * REJECTED - 4, DELIVERED - 5, FAILED - 6, EXPIRED - 7, UNKNOWN - 8.
    */
    public A2PGetSmsHistoryRequest setDeliveryStatus(long d) {
        this.deliveryStatus = Long.valueOf(d);
        return this;
    }

}
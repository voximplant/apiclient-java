package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetSmsHistory] function result.
*/
public class SmsHistoryType {

    private Long smsId;

    /**
    * Id of the message.
    */
    public long getSmsId() {
        return this.smsId.longValue();
    }

    public boolean hasSmsId() {
        return this.smsId != null;
    }

    private Long sourceNumber;

    /**
    * Number being called from.
    */
    public long getSourceNumber() {
        return this.sourceNumber.longValue();
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private Long destinationNumber;

    /**
    * Number being called to.
    */
    public long getDestinationNumber() {
        return this.destinationNumber.longValue();
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String direction;

    /**
    * Incoming or outgoing message.
    */
    public String getDirection() {
        return this.direction;
    }

    public boolean hasDirection() {
        return this.direction != null;
    }

    private Long fragments;

    /**
    * Number of fragments the initial message was divided into.
    */
    public long getFragments() {
        return this.fragments.longValue();
    }

    public boolean hasFragments() {
        return this.fragments != null;
    }

    private BigDecimal cost;

    /**
    * Cost of the message.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    private Long statusId;

    /**
    * Status of the message. 1 - Success, 2 - Error.
    */
    public long getStatusId() {
        return this.statusId.longValue();
    }

    public boolean hasStatusId() {
        return this.statusId != null;
    }

    private String errorMessage;

    /**
    * Error message if any.
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public boolean hasErrorMessage() {
        return this.errorMessage != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date processedDate;

    /**
    * Date of message processing. The format is yyyy-MM-dd HH:mm:ss
    */
    public Date getProcessedDate() {
        return this.processedDate;
    }

    public boolean hasProcessedDate() {
        return this.processedDate != null;
    }

    private Long transactionId;

    /**
    * Id of the transaction for this message.
    */
    public long getTransactionId() {
        return this.transactionId.longValue();
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

}
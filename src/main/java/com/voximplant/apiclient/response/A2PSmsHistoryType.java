package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [A2PGetSmsHistory] function result.
*/
public class A2PSmsHistoryType {

    private Long id;

    /**
    * The message ID.
    */
    public long getId() {
        return this.id.longValue();
    }

    public boolean hasId() {
        return this.id != null;
    }

    private Long sourceNumber;

    /**
    * SMS source number.
    */
    public long getSourceNumber() {
        return this.sourceNumber.longValue();
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private Long destinationNumber;

    /**
    * SMS destination number.
    */
    public long getDestinationNumber() {
        return this.destinationNumber.longValue();
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
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
    * The message cost.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    private Long statusId;

    /**
    * The message status. 1 - Success, 2 - Error.
    */
    public long getStatusId() {
        return this.statusId.longValue();
    }

    public boolean hasStatusId() {
        return this.statusId != null;
    }

    private String errorMessage;

    /**
    * Error message (if any).
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public boolean hasErrorMessage() {
        return this.errorMessage != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date processingDate;

    /**
    * Date of message processing. The format is yyyy-MM-dd HH:mm:ss
    */
    public Date getProcessingDate() {
        return this.processingDate;
    }

    public boolean hasProcessingDate() {
        return this.processingDate != null;
    }

    private Long transactionId;

    /**
    * The transaction ID for this message.
    */
    public long getTransactionId() {
        return this.transactionId.longValue();
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String deliveryStatus;

    /**
    * Delivery status: QUEUED, DISPATCHED, ABORTED, REJECTED, DELIVERED,
    * FAILED, EXPIRED, UNKNOWN
    */
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public boolean hasDeliveryStatus() {
        return this.deliveryStatus != null;
    }

}
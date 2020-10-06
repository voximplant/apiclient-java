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
* The [A2PGetSmsHistory] function result.
*/
public class A2PSmsHistoryType implements Alignable {

    private Long id;

    /**
    * The message ID.
    */
    public Long getId() {
        return this.id;
    }

    public boolean hasId() {
        return this.id != null;
    }

    private Long sourceNumber;

    /**
    * SMS source number.
    */
    public Long getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private Long destinationNumber;

    /**
    * SMS destination number.
    */
    public Long getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private Long fragments;

    /**
    * Number of fragments the initial message was divided into.
    */
    public Long getFragments() {
        return this.fragments;
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
    public Long getStatusId() {
        return this.statusId;
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
    public Long getTransactionId() {
        return this.transactionId;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (id != null) {
            sb.append(aligned)
                .append("\"id\": \"")
                .append(id)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (fragments != null) {
            sb.append(aligned)
                .append("\"fragments\": \"")
                .append(fragments)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cost != null) {
            sb.append(aligned)
                .append("\"cost\": \"")
                .append(cost)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (statusId != null) {
            sb.append(aligned)
                .append("\"statusId\": \"")
                .append(statusId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorMessage != null) {
            sb.append(aligned)
                .append("\"errorMessage\": \"")
                .append(errorMessage)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (processingDate != null) {
            sb.append(aligned)
                .append("\"processingDate\": \"")
                .append(processingDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionId != null) {
            sb.append(aligned)
                .append("\"transactionId\": \"")
                .append(transactionId)
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
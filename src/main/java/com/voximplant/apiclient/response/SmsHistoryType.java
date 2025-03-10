package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetSmsHistory] function result.
*/
public class SmsHistoryType implements Alignable {

    private Long messageId;

    /**
    * Message ID
    */
    public Long getMessageId() {
        return this.messageId;
    }

    public boolean hasMessageId() {
        return this.messageId != null;
    }

    private Long sourceNumber;

    /**
    * Number being called from
    */
    public Long getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private Long destinationNumber;

    /**
    * Number being called to
    */
    public Long getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String direction;

    /**
    * Incoming or outgoing message
    */
    public String getDirection() {
        return this.direction;
    }

    public boolean hasDirection() {
        return this.direction != null;
    }

    private Long fragments;

    /**
    * Number of fragments the initial message is divided into
    */
    public Long getFragments() {
        return this.fragments;
    }

    public boolean hasFragments() {
        return this.fragments != null;
    }

    private BigDecimal cost;

    /**
    * Cost of the message
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    private String statusId;

    /**
    * Status of the message. 1 - Success, 2 - Error
    */
    public String getStatusId() {
        return this.statusId;
    }

    public boolean hasStatusId() {
        return this.statusId != null;
    }

    private String errorMessage;

    /**
    * Error message (if any)
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
    * Id of the transaction for this message
    */
    public Long getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String text;

    /**
    * Stored message text
    */
    public String getText() {
        return this.text;
    }

    public boolean hasText() {
        return this.text != null;
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
        if (messageId != null) {
            sb.append(aligned)
                .append("\"messageId\": \"")
                .append(messageId)
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
        if (direction != null) {
            sb.append(aligned)
                .append("\"direction\": \"")
                .append(direction)
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
        if (processedDate != null) {
            sb.append(aligned)
                .append("\"processedDate\": \"")
                .append(processedDate)
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
        if (text != null) {
            sb.append(aligned)
                .append("\"text\": \"")
                .append(text)
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
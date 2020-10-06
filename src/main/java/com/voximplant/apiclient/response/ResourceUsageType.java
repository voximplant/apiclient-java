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
* The resource usage info.
*/
public class ResourceUsageType implements Alignable {

    private Long resourceUsageId;

    /**
    * The resource usage ID.
    */
    public Long getResourceUsageId() {
        return this.resourceUsageId;
    }

    public boolean hasResourceUsageId() {
        return this.resourceUsageId != null;
    }

    private String resourceType;

    /**
    * The resource type. The possible values are: CALLSESSION, VIDEOCALL,
    * VIDEORECORD, VOICEMAILDETECTION, YANDEXASR, ASR, TRANSCRIPTION,
    * TTS_TEXT_GOOGLE, TTS_YANDEX, AUDIOHDCONFERENCE.
    */
    public String getResourceType() {
        return this.resourceType;
    }

    public boolean hasResourceType() {
        return this.resourceType != null;
    }

    private BigDecimal cost;

    /**
    * The resource cost.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    private String description;

    /**
    * The description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date usedAt;

    /**
    * The start resource using time in the selected timezone in 24-h
    * format: YYYY-MM-DD HH:mm:ss
    */
    public Date getUsedAt() {
        return this.usedAt;
    }

    public boolean hasUsedAt() {
        return this.usedAt != null;
    }

    private Long transactionId;

    /**
    * The transaction ID.
    */
    public Long getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private Long resourceQuantity;

    /**
    * The resource quantity.
    */
    public Long getResourceQuantity() {
        return this.resourceQuantity;
    }

    public boolean hasResourceQuantity() {
        return this.resourceQuantity != null;
    }

    private String unit;

    /**
    * The resource unit.
    */
    public String getUnit() {
        return this.unit;
    }

    public boolean hasUnit() {
        return this.unit != null;
    }

    private Long refCallId;

    /**
    * The reference to call.
    */
    public Long getRefCallId() {
        return this.refCallId;
    }

    public boolean hasRefCallId() {
        return this.refCallId != null;
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
        if (resourceUsageId != null) {
            sb.append(aligned)
                .append("\"resourceUsageId\": \"")
                .append(resourceUsageId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resourceType != null) {
            sb.append(aligned)
                .append("\"resourceType\": \"")
                .append(resourceType)
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
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (usedAt != null) {
            sb.append(aligned)
                .append("\"usedAt\": \"")
                .append(usedAt)
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
        if (resourceQuantity != null) {
            sb.append(aligned)
                .append("\"resourceQuantity\": \"")
                .append(resourceQuantity)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (unit != null) {
            sb.append(aligned)
                .append("\"unit\": \"")
                .append(unit)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (refCallId != null) {
            sb.append(aligned)
                .append("\"refCallId\": \"")
                .append(refCallId)
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
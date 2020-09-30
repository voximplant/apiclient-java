package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The resource usage info.
*/
public class ResourceUsageType {

    private Long resourceUsageId;

    /**
    * The resource usage ID.
    */
    public long getResourceUsageId() {
        return this.resourceUsageId.longValue();
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
    public long getTransactionId() {
        return this.transactionId.longValue();
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private Long resourceQuantity;

    /**
    * The resource quantity.
    */
    public long getResourceQuantity() {
        return this.resourceQuantity.longValue();
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
    public long getRefCallId() {
        return this.refCallId.longValue();
    }

    public boolean hasRefCallId() {
        return this.refCallId != null;
    }

}
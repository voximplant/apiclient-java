package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class GetResourcePriceRequest implements Alignable {
    private MultiArgument<String> resourceType;

    @RequestField(name="resource_type")
    /**
    * The resource type list separated by semicolon (;). The possible
    * values are AUDIOHDCONFERENCE, AUDIOHDRECORD, AUDIORECORD, CALLLIST,
    * CALLSESSION, DIALOGFLOW, IM, PSTN_IN_ALASKA, PSTN_IN_GB,
    * PSTN_IN_GEOGRAPHIC, PSTN_IN_GEO_PH, PSTN_IN_RU, PSTN_IN_RU_TOLLFREE,
    * PSTN_INTERNATIONAL, PSTNINTEST, PSTN_IN_TF_AR, PSTN_IN_TF_AT,
    * PSTN_IN_TF_AU, PSTN_IN_TF_BE, PSTN_IN_TF_BR, PSTN_IN_TF_CA,
    * PSTN_IN_TF_CO, PSTN_IN_TF_CY, PSTN_IN_TF_DE, PSTN_IN_TF_DK,
    * PSTN_IN_TF_DO, PSTN_IN_TF_FI, PSTN_IN_TF_FR, PSTN_IN_TF_GB,
    * PSTN_IN_TF_HR, PSTN_IN_TF_HU, PSTN_IN_TF_IL, PSTN_IN_TF_LT,
    * PSTN_IN_TF_PE, PSTN_IN_TF_US, PSTN_IN_US, PSTNOUT, PSTNOUT_EEA,
    * PSTNOUTEMERG, PSTNOUT_KZ, PSTNOUT_LOCAL, PSTN_OUT_LOCAL_RU,
    * RELAYED_TRAFFIC, SIPOUT, SIPOUTVIDEO, SMSINPUT, SMSOUT,
    * SMSOUT_INTERNATIONAL, TRANSCRIPTION, TTS_TEXT_GOOGLE, TTS_YANDEX,
    * USER_LOGON, VIDEOCALL, VIDEORECORD, VOICEMAILDETECTION, VOIPIN,
    * VOIPOUT, VOIPOUTVIDEO, YANDEXASR, ASR, ASR_GOOGLE_ENHANCED
    */
    public MultiArgument<String> getResourceType() {
        return this.resourceType;
    }

    public boolean hasResourceType() {
        return this.resourceType != null;
    }

    /**
    * The resource type list separated by semicolon (;). The possible
    * values are AUDIOHDCONFERENCE, AUDIOHDRECORD, AUDIORECORD, CALLLIST,
    * CALLSESSION, DIALOGFLOW, IM, PSTN_IN_ALASKA, PSTN_IN_GB,
    * PSTN_IN_GEOGRAPHIC, PSTN_IN_GEO_PH, PSTN_IN_RU, PSTN_IN_RU_TOLLFREE,
    * PSTN_INTERNATIONAL, PSTNINTEST, PSTN_IN_TF_AR, PSTN_IN_TF_AT,
    * PSTN_IN_TF_AU, PSTN_IN_TF_BE, PSTN_IN_TF_BR, PSTN_IN_TF_CA,
    * PSTN_IN_TF_CO, PSTN_IN_TF_CY, PSTN_IN_TF_DE, PSTN_IN_TF_DK,
    * PSTN_IN_TF_DO, PSTN_IN_TF_FI, PSTN_IN_TF_FR, PSTN_IN_TF_GB,
    * PSTN_IN_TF_HR, PSTN_IN_TF_HU, PSTN_IN_TF_IL, PSTN_IN_TF_LT,
    * PSTN_IN_TF_PE, PSTN_IN_TF_US, PSTN_IN_US, PSTNOUT, PSTNOUT_EEA,
    * PSTNOUTEMERG, PSTNOUT_KZ, PSTNOUT_LOCAL, PSTN_OUT_LOCAL_RU,
    * RELAYED_TRAFFIC, SIPOUT, SIPOUTVIDEO, SMSINPUT, SMSOUT,
    * SMSOUT_INTERNATIONAL, TRANSCRIPTION, TTS_TEXT_GOOGLE, TTS_YANDEX,
    * USER_LOGON, VIDEOCALL, VIDEORECORD, VOICEMAILDETECTION, VOIPIN,
    * VOIPOUT, VOIPOUTVIDEO, YANDEXASR, ASR, ASR_GOOGLE_ENHANCED
    */
    public GetResourcePriceRequest setResourceType(MultiArgument<String> d) {
        this.resourceType = d;
        return this;
    }

    private MultiArgument<Long> priceGroupId;

    @RequestField(name="price_group_id")
    /**
    * The price group ID list separated by semicolon (;)
    */
    public MultiArgument<Long> getPriceGroupId() {
        return this.priceGroupId;
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    /**
    * The price group ID list separated by semicolon (;)
    */
    public GetResourcePriceRequest setPriceGroupId(MultiArgument<Long> d) {
        this.priceGroupId = d;
        return this;
    }

    private String priceGroupName;

    @RequestField(name="price_group_name")
    /**
    * The price group name template to filter
    */
    public String getPriceGroupName() {
        return this.priceGroupName;
    }

    public boolean hasPriceGroupName() {
        return this.priceGroupName != null;
    }

    /**
    * The price group name template to filter
    */
    public GetResourcePriceRequest setPriceGroupName(String d) {
        this.priceGroupName = d;
        return this;
    }

    private MultiArgument<String> resourceParam;

    @RequestField(name="resource_param")
    /**
    * The resource parameter list separated by semicolon (;). Example: a
    * phone number list
    */
    public MultiArgument<String> getResourceParam() {
        return this.resourceParam;
    }

    public boolean hasResourceParam() {
        return this.resourceParam != null;
    }

    /**
    * The resource parameter list separated by semicolon (;). Example: a
    * phone number list
    */
    public GetResourcePriceRequest setResourceParam(MultiArgument<String> d) {
        this.resourceParam = d;
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
        if (resourceType != null) {
            sb.append(aligned)
                .append("\"resourceType\": \"")
                .append(resourceType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priceGroupId != null) {
            sb.append(aligned)
                .append("\"priceGroupId\": \"")
                .append(priceGroupId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priceGroupName != null) {
            sb.append(aligned)
                .append("\"priceGroupName\": \"")
                .append(priceGroupName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resourceParam != null) {
            sb.append(aligned)
                .append("\"resourceParam\": \"")
                .append(resourceParam)
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
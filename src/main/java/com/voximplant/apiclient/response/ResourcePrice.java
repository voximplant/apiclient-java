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
* The [GetResourcePrice] function result.
*/
public class ResourcePrice implements Alignable {

    private String resourceType;

    /**
    * The resource type name. The possible values are AUDIOHDCONFERENCE,
    * AUDIOHDRECORD, AUDIORECORD, CALLLIST, CALLSESSION, DIALOGFLOW, IM,
    * PSTN_IN_ALASKA, PSTN_IN_GB, PSTN_IN_GEOGRAPHIC, PSTN_IN_GEO_PH,
    * PSTN_IN_RU, PSTN_IN_RU_TOLLFREE, PSTN_INTERNATIONAL, PSTNINTEST,
    * PSTN_IN_TF_AR, PSTN_IN_TF_AT, PSTN_IN_TF_AU, PSTN_IN_TF_BE,
    * PSTN_IN_TF_BR, PSTN_IN_TF_CA, PSTN_IN_TF_CO, PSTN_IN_TF_CY,
    * PSTN_IN_TF_DE, PSTN_IN_TF_DK, PSTN_IN_TF_DO, PSTN_IN_TF_FI,
    * PSTN_IN_TF_FR, PSTN_IN_TF_GB, PSTN_IN_TF_HR, PSTN_IN_TF_HU,
    * PSTN_IN_TF_IL, PSTN_IN_TF_LT, PSTN_IN_TF_PE, PSTN_IN_TF_US,
    * PSTN_IN_US, PSTNOUT, PSTNOUT_EEA, PSTNOUTEMERG, PSTNOUT_KZ,
    * PSTNOUT_LOCAL, PSTN_OUT_LOCAL_RU, RELAYED_TRAFFIC, SIPOUT,
    * SIPOUTVIDEO, SMSINPUT, SMSOUT, SMSOUT_INTERNATIONAL, TRANSCRIPTION,
    * TTS_TEXT_GOOGLE, TTS_YANDEX, USER_LOGON, VIDEOCALL, VIDEORECORD,
    * VOICEMAILDETECTION, VOIPIN, VOIPOUT, VOIPOUTVIDEO, YANDEXASR, ASR,
    * ASR_GOOGLE_ENHANCED
    */
    public String getResourceType() {
        return this.resourceType;
    }

    public boolean hasResourceType() {
        return this.resourceType != null;
    }

    private PriceGroup[] priceGroups;

    /**
    * The price group array
    */
    public PriceGroup[] getPriceGroups() {
        return this.priceGroups;
    }

    public boolean hasPriceGroups() {
        return this.priceGroups != null;
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
        if (priceGroups != null) {
            sb.append(aligned)
                .append("\"PriceGroup\": ")
                .append(StringHelper.arrayToString(priceGroups, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
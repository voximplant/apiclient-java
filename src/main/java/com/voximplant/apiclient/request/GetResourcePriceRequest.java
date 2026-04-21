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

public class GetResourcePriceRequest implements Alignable {
    private MultiArgument<String> resourceType;

    @RequestField(name="resource_type")
    /**
    * The resource type list separated by semicolons (;). The possible
    * values are: <ul><li><strong>A2P_SMS_E212</strong> — Service
    * SMS</li><li><strong>ASR</strong> — Speech
    * recognition</li><li><strong>ASR_AWS</strong> — Speech recognition by
    * Amazon</li><li><strong>ASR_DEEPGRAM</strong> — Speech recognition by
    * Deepgram</li><li><strong>ASR_GOOGLE_ENHANCED</strong> — Speech
    * recognition by Google</li><li><strong>ASR_SMARTSPEECH</strong> —
    * Speech recognition by SmartSpeech</li><li><strong>ASR_YANDEX</strong>
    * — Speech recognition by
    * Yandex</li><li><strong>AUDIOHDCONFERENCE</strong> — HD audio
    * conferencing</li><li><strong>AUDIOHDRECORD</strong> — HD audio call
    * recording</li><li><strong>AUDIORECORD</strong> — Audio call
    * recording</li><li><strong>CALLSESSION</strong> — Simultaneous
    * sessions per account</li><li><strong>DIALOGFLOW</strong> — Dialogflow
    * ES</li><li><strong>DIALOGFLOW_CX</strong> — Dialogflow
    * CX</li><li><strong>IM_OVERRUN</strong> — Exceeding instant
    * messages</li><li><strong>KV_STORAGE</strong> — Key-value
    * storage</li><li><strong>MAU_OVERRUN</strong> — Exceeding monthly
    * active users</li><li><strong>NLU</strong> — Avatar
    * requests</li><li><strong>PSTN_IN_ALASKA</strong> — Incoming phone
    * calls to Alaska phone numbers</li><li><strong>PSTN_IN_GB</strong> —
    * Incoming phone calls to United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_GEO_AE</strong> — Incoming
    * geographical phone calls to UAE phone
    * numbers</li><li><strong>PSTN_IN_GEO_AO</strong> — Incoming
    * geographical phone calls to Angola phone
    * numbers</li><li><strong>PSTN_IN_GEO_BH</strong> — Incoming
    * geographical phone calls to Bahrain phone
    * numbers</li><li><strong>PSTN_IN_GEO_BR</strong> — Incoming
    * geographical phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_GEO_CN</strong> — Incoming
    * geographical phone calls to China phone
    * numbers</li><li><strong>PSTN_IN_GEO_EC</strong> — Incoming
    * geographical phone calls to Ecuador phone
    * numbers</li><li><strong>PSTN_IN_GEO_IN</strong> — Incoming
    * geographical phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_GEO_JO</strong> — Incoming
    * geographical phone calls to Jordan phone
    * numbers</li><li><strong>PSTN_IN_GEO_JP</strong> — Incoming
    * geographical phone calls to Japan phone
    * numbers</li><li><strong>PSTN_IN_GEO_KG</strong> — Incoming
    * geographical phone calls to Kyrgyzstan phone
    * numbers</li><li><strong>PSTN_IN_GEO_KH</strong> — Incoming
    * geographical phone calls to Cambodia phone
    * numbers</li><li><strong>PSTN_IN_GEO_MA</strong> — Incoming
    * geographical phone calls to Morocco phone
    * numbers</li><li><strong>PSTN_IN_GEO_NG</strong> — Incoming
    * geographical phone calls to Nigeria phone
    * numbers</li><li><strong>PSTN_IN_GEO_PE</strong> — Incoming
    * geographical phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_GEO_PH</strong> — Incoming
    * geographical phone calls to Philippines phone
    * numbers</li><li><strong>PSTN_IN_GEO_PK</strong> — Incoming
    * geographical phone calls to Pakistan phone
    * numbers</li><li><strong>PSTN_IN_GEO_PY</strong> — Incoming
    * geographical phone calls to Paraguay phone
    * numbers</li><li><strong>PSTN_IN_GEO_RS</strong> — Incoming
    * geographical phone calls to Serbia phone
    * numbers</li><li><strong>PSTN_IN_GEO_SA</strong> — Incoming
    * geographical phone calls to Saudi Arabia phone
    * numbers</li><li><strong>PSTN_IN_GEO_UG</strong> — Incoming
    * geographical phone calls to Uganda phone
    * numbers</li><li><strong>PSTN_IN_GEO_UY</strong> — Incoming
    * geographical phone calls to Uruguay phone
    * numbers</li><li><strong>PSTN_IN_GEO_UZ</strong> — Incoming
    * geographical phone calls to Uzbekistan phone
    * numbers</li><li><strong>PSTN_IN_GEO_VN</strong> — Incoming
    * geographical phone calls to Vietnam phone
    * numbers</li><li><strong>PSTN_IN_GEOGRAPHIC</strong> — Incoming
    * geographical phone calls</li><li><strong>PSTN_IN_MOB_AU</strong> —
    * Incoming mobile phone calls to Australia phone
    * numbers</li><li><strong>PSTN_IN_MOB_BD</strong> — Incoming mobile
    * phone calls to Bangladesh phone
    * numbers</li><li><strong>PSTN_IN_MOB_BE</strong> — Incoming mobile
    * phone calls to Belgium phone
    * numbers</li><li><strong>PSTN_IN_MOB_BR</strong> — Incoming mobile
    * phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_MOB_CA</strong> — Incoming mobile
    * phone calls to Canada phone
    * numbers</li><li><strong>PSTN_IN_MOB_CO</strong> — Incoming mobile
    * phone calls to Colombia phone
    * numbers</li><li><strong>PSTN_IN_MOB_DK</strong> — Incoming mobile
    * phone calls to Denmark phone
    * numbers</li><li><strong>PSTN_IN_MOB_EG</strong> — Incoming mobile
    * phone calls to Egypt phone
    * numbers</li><li><strong>PSTN_IN_MOB_FI</strong> — Incoming mobile
    * phone calls to Finland phone
    * numbers</li><li><strong>PSTN_IN_MOB_GB</strong> — Incoming mobile
    * phone calls to United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_MOB_HK</strong> — Incoming mobile
    * phone calls to Hong Kong phone
    * numbers</li><li><strong>PSTN_IN_MOB_ID</strong> — Incoming mobile
    * phone calls to Indonesia phone
    * numbers</li><li><strong>PSTN_IN_MOB_IL</strong> — Incoming mobile
    * phone calls to Israel phone
    * numbers</li><li><strong>PSTN_IN_MOB_IN</strong> — Incoming mobile
    * phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_MOB_KZ</strong> — Incoming mobile
    * phone calls to Kazakhstan phone
    * numbers</li><li><strong>PSTN_IN_MOB_LA</strong> — Incoming mobile
    * phone calls to Laos phone
    * numbers</li><li><strong>PSTN_IN_MOB_LV</strong> — Incoming mobile
    * phone calls to Latvia phone
    * numbers</li><li><strong>PSTN_IN_MOB_MU</strong> — Incoming mobile
    * phone calls to Mauritius phone
    * numbers</li><li><strong>PSTN_IN_MOB_MX</strong> — Incoming mobile
    * phone calls to Mexico phone
    * numbers</li><li><strong>PSTN_IN_MOB_MY</strong> — Incoming mobile
    * phone calls to Malaysia phone
    * numbers</li><li><strong>PSTN_IN_MOB_NI</strong> — Incoming mobile
    * phone calls to Nicaragua phone
    * numbers</li><li><strong>PSTN_IN_MOB_NL</strong> — Incoming mobile
    * phone calls to the Netherlands phone
    * numbers</li><li><strong>PSTN_IN_MOB_NP</strong> — Incoming mobile
    * phone calls to Nepal phone
    * numbers</li><li><strong>PSTN_IN_MOB_PE</strong> — Incoming mobile
    * phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_MOB_PL</strong> — Incoming mobile
    * phone calls to Poland phone
    * numbers</li><li><strong>PSTN_IN_MOB_PR</strong> — Incoming mobile
    * phone calls to Puerto Rico phone
    * numbers</li><li><strong>PSTN_IN_MOB_PT</strong> — Incoming mobile
    * phone calls to Portugal phone
    * numbers</li><li><strong>PSTN_IN_MOB_RU</strong> — Incoming mobile
    * phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_MOB_SE</strong> — Incoming mobile
    * phone calls to Sweden phone
    * numbers</li><li><strong>PSTN_IN_MOB_US</strong> — Incoming mobile
    * phone calls to the United States phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_AM</strong> — Incoming
    * national phone calls to Armenia phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_BO</strong> — Incoming
    * national phone calls to Bolivia phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_HN</strong> — Incoming
    * national phone calls to Honduras phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_JM</strong> — Incoming
    * national phone calls to Jamaica phone
    * numbers</li><li><strong>PSTN_IN_RU</strong> — Incoming phone calls to
    * Russia phone numbers</li><li><strong>PSTN_IN_RU_TOLLFREE</strong> —
    * Incoming toll-free phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_SC_AU</strong> — Incoming phone calls
    * to Australia phone numbers</li><li><strong>PSTN_IN_STAR_RU</strong> —
    * Incoming phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_TF_AR</strong> — Incoming toll-free
    * phone calls to Argentina phone
    * numbers</li><li><strong>PSTN_IN_TF_AT</strong> — Incoming toll-free
    * phone calls to Austria phone
    * numbers</li><li><strong>PSTN_IN_TF_AU</strong> — Incoming toll-free
    * phone calls to Australia phone
    * numbers</li><li><strong>PSTN_IN_TF_BE</strong> — Incoming toll-free
    * phone calls to Belgium phone
    * numbers</li><li><strong>PSTN_IN_TF_BG</strong> — Incoming toll-free
    * phone calls to Bulgaria phone
    * numbers</li><li><strong>PSTN_IN_TF_BH</strong> — Incoming toll-free
    * phone calls to Bahrain phone
    * numbers</li><li><strong>PSTN_IN_TF_BR</strong> — Incoming toll-free
    * phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_TF_BY</strong> — Incoming toll-free
    * phone calls to Belarus phone
    * numbers</li><li><strong>PSTN_IN_TF_CA</strong> — Incoming toll-free
    * phone calls to Canada phone
    * numbers</li><li><strong>PSTN_IN_TF_CH</strong> — Incoming toll-free
    * phone calls to Switzerland phone
    * numbers</li><li><strong>PSTN_IN_TF_CL</strong> — Incoming toll-free
    * phone calls to Chile phone
    * numbers</li><li><strong>PSTN_IN_TF_CO</strong> — Incoming toll-free
    * phone calls to Colombia phone
    * numbers</li><li><strong>PSTN_IN_TF_CR</strong> — Incoming toll-free
    * phone calls to Costa Rica phone
    * numbers</li><li><strong>PSTN_IN_TF_CY</strong> — Incoming toll-free
    * phone calls to Cyprus phone
    * numbers</li><li><strong>PSTN_IN_TF_CZ</strong> — Incoming toll-free
    * phone calls to Czechia phone
    * numbers</li><li><strong>PSTN_IN_TF_DE</strong> — Incoming toll-free
    * phone calls to Germany phone
    * numbers</li><li><strong>PSTN_IN_TF_DK</strong> — Incoming toll-free
    * phone calls to Denmark phone
    * numbers</li><li><strong>PSTN_IN_TF_DO</strong> — Incoming toll-free
    * phone calls to Dominican Republic phone
    * numbers</li><li><strong>PSTN_IN_TF_EC</strong> — Incoming toll-free
    * phone calls to Ecuador phone
    * numbers</li><li><strong>PSTN_IN_TF_EE</strong> — Incoming toll-free
    * phone calls to Estonia phone
    * numbers</li><li><strong>PSTN_IN_TF_EG</strong> — Incoming toll-free
    * phone calls to Egypt phone
    * numbers</li><li><strong>PSTN_IN_TF_ES</strong> — Incoming toll-free
    * phone calls to Spain phone
    * numbers</li><li><strong>PSTN_IN_TF_FI</strong> — Incoming toll-free
    * phone calls to Finland phone
    * numbers</li><li><strong>PSTN_IN_TF_FR</strong> — Incoming toll-free
    * phone calls to France phone
    * numbers</li><li><strong>PSTN_IN_TF_GB</strong> — Incoming toll-free
    * phone calls to the United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_TF_GF</strong> — Incoming toll-free
    * phone calls to French Guiana phone
    * numbers</li><li><strong>PSTN_IN_TF_GP</strong> — Incoming toll-free
    * phone calls to Guadeloupe phone
    * numbers</li><li><strong>PSTN_IN_TF_HK</strong> — Incoming toll-free
    * phone calls to Hong Kong phone
    * numbers</li><li><strong>PSTN_IN_TF_HR</strong> — Incoming toll-free
    * phone calls to Croatia phone
    * numbers</li><li><strong>PSTN_IN_TF_HU</strong> — Incoming toll-free
    * phone calls to Hungary phone
    * numbers</li><li><strong>PSTN_IN_TF_ID</strong> — Incoming toll-free
    * phone calls to Indonesia phone
    * numbers</li><li><strong>PSTN_IN_TF_IE</strong> — Incoming toll-free
    * phone calls to Ireland phone
    * numbers</li><li><strong>PSTN_IN_TF_IL</strong> — Incoming toll-free
    * phone calls to Israel phone
    * numbers</li><li><strong>PSTN_IN_TF_IN</strong> — Incoming toll-free
    * phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_TF_IS</strong> — Incoming toll-free
    * phone calls to Iceland phone
    * numbers</li><li><strong>PSTN_IN_TF_IT</strong> — Incoming toll-free
    * phone calls to Italy phone
    * numbers</li><li><strong>PSTN_IN_TF_KE</strong> — Incoming toll-free
    * phone calls to Kenya phone
    * numbers</li><li><strong>PSTN_IN_TF_KR</strong> — Incoming toll-free
    * phone calls to South Korea phone
    * numbers</li><li><strong>PSTN_IN_TF_KW</strong> — Incoming toll-free
    * phone calls to Kuwait phone
    * numbers</li><li><strong>PSTN_IN_TF_KZ</strong> — Incoming toll-free
    * phone calls to Kazakhstan phone
    * numbers</li><li><strong>PSTN_IN_TF_LT</strong> — Incoming toll-free
    * phone calls to Lithuania phone
    * numbers</li><li><strong>PSTN_IN_TF_LV</strong> — Incoming toll-free
    * phone calls to Latvia phone
    * numbers</li><li><strong>PSTN_IN_TF_MC</strong> — Incoming toll-free
    * phone calls to Monaco phone
    * numbers</li><li><strong>PSTN_IN_TF_MK</strong> — Incoming toll-free
    * phone calls to North Macedonia phone
    * numbers</li><li><strong>PSTN_IN_TF_MQ</strong> — Incoming toll-free
    * phone calls to Martinique phone
    * numbers</li><li><strong>PSTN_IN_TF_MT</strong> — Incoming toll-free
    * phone calls to Malta phone
    * numbers</li><li><strong>PSTN_IN_TF_MX</strong> — Incoming toll-free
    * phone calls to Mexico phone
    * numbers</li><li><strong>PSTN_IN_TF_NL</strong> — Incoming toll-free
    * phone calls to the Netherlands phone
    * numbers</li><li><strong>PSTN_IN_TF_NZ</strong> — Incoming toll-free
    * phone calls to New Zealand phone
    * numbers</li><li><strong>PSTN_IN_TF_OM</strong> — Incoming toll-free
    * phone calls to Oman phone
    * numbers</li><li><strong>PSTN_IN_TF_PA</strong> — Incoming toll-free
    * phone calls to Panama phone
    * numbers</li><li><strong>PSTN_IN_TF_PE</strong> — Incoming toll-free
    * phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_TF_PK</strong> — Incoming toll-free
    * phone calls to Pakistan phone
    * numbers</li><li><strong>PSTN_IN_TF_PR</strong> — Incoming toll-free
    * phone calls to Puerto Rico phone
    * numbers</li><li><strong>PSTN_IN_TF_QA</strong> — Incoming toll-free
    * phone calls to Qatar phone
    * numbers</li><li><strong>PSTN_IN_TF_RE</strong> — Incoming toll-free
    * phone calls to Reunion phone
    * numbers</li><li><strong>PSTN_IN_TF_RO</strong> — Incoming toll-free
    * phone calls to Romania phone
    * numbers</li><li><strong>PSTN_IN_TF_RS</strong> — Incoming toll-free
    * phone calls to Serbia phone
    * numbers</li><li><strong>PSTN_IN_TF_SA</strong> — Incoming toll-free
    * phone calls to Saudi Arabia phone
    * numbers</li><li><strong>PSTN_IN_TF_SE</strong> — Incoming toll-free
    * phone calls to Sweden phone
    * numbers</li><li><strong>PSTN_IN_TF_SI</strong> — Incoming toll-free
    * phone calls to Slovenia phone
    * numbers</li><li><strong>PSTN_IN_TF_SK</strong> — Incoming toll-free
    * phone calls to Slovakia phone
    * numbers</li><li><strong>PSTN_IN_TF_TH</strong> — Incoming toll-free
    * phone calls to Thailand phone
    * numbers</li><li><strong>PSTN_IN_TF_UA</strong> — Incoming toll-free
    * phone calls to Ukraine phone
    * numbers</li><li><strong>PSTN_IN_TF_UG</strong> — Incoming toll-free
    * phone calls to Uganda phone
    * numbers</li><li><strong>PSTN_IN_TF_US</strong> — Incoming toll-free
    * phone calls to the United States phone
    * numbers</li><li><strong>PSTN_IN_TF_VE</strong> — Incoming toll-free
    * phone calls to Venezuela phone
    * numbers</li><li><strong>PSTN_IN_TF_YT</strong> — Incoming toll-free
    * phone calls to Mayotte phone
    * numbers</li><li><strong>PSTN_IN_TF_ZA</strong> — Incoming toll-free
    * phone calls to South Africa phone
    * numbers</li><li><strong>PSTN_IN_US</strong> — Incoming phone calls to
    * the United States phone
    * numbers</li><li><strong>PSTN_INTERNATIONAL</strong> — Outgoing
    * international calls</li><li><strong>PSTN_OUT_INCOUNTRY</strong> —
    * Outgoing domestic phone
    * calls</li><li><strong>PSTN_OUT_LOCAL_RU</strong> — Outgoing domestic
    * phone calls in Russia</li><li><strong>PSTNOUT</strong> — Outgoing
    * phone calls</li><li><strong>PSTNOUT_EEA</strong> — Outgoing phone
    * calls to EEA</li><li><strong>PSTNOUT_LOCAL</strong> — Outgoing local
    * phone calls</li><li><strong>RELAYED_TRAFFIC</strong> — TURN server
    * relayed traffic</li><li><strong>SIPIN</strong> — Incoming SIP
    * calls</li><li><strong>SIPOUT</strong> — Outgoing SIP
    * calls</li><li><strong>SIPREFER</strong> — Call transfer via SIP
    * REFER</li><li><strong>SMS_IN_MOB_AU</strong> — Incoming SMS to
    * Australia phone numbers</li><li><strong>SMS_IN_MOB_BE</strong> —
    * Incoming SMS to Belgium phone
    * numbers</li><li><strong>SMS_IN_MOB_BR</strong> — Incoming SMS to
    * Brazil phone numbers</li><li><strong>SMS_IN_MOB_CA</strong> —
    * Incoming SMS to Canada phone
    * numbers</li><li><strong>SMS_IN_MOB_CL</strong> — Incoming SMS to
    * Chile phone numbers</li><li><strong>SMS_IN_MOB_CO</strong> — Incoming
    * SMS to Colombia phone numbers</li><li><strong>SMS_IN_MOB_DK</strong>
    * — Incoming SMS to Denmark phone
    * numbers</li><li><strong>SMS_IN_MOB_FI</strong> — Incoming SMS to
    * Finland phone numbers</li><li><strong>SMS_IN_MOB_FR</strong> —
    * Incoming SMS to France phone
    * numbers</li><li><strong>SMS_IN_MOB_GB</strong> — Incoming SMS to the
    * United Kingdom phone numbers</li><li><strong>SMS_IN_MOB_HK</strong> —
    * Incoming SMS to Hong Kong phone
    * numbers</li><li><strong>SMS_IN_MOB_IL</strong> — Incoming SMS to
    * Israel phone numbers</li><li><strong>SMS_IN_MOB_LV</strong> —
    * Incoming SMS to Latvia phone
    * numbers</li><li><strong>SMS_IN_MOB_MU</strong> — Incoming SMS to
    * Mauritius phone numbers</li><li><strong>SMS_IN_MOB_MX</strong> —
    * Incoming SMS to Mexico phone
    * numbers</li><li><strong>SMS_IN_MOB_MY</strong> — Incoming SMS to
    * Malaysia phone numbers</li><li><strong>SMS_IN_MOB_NL</strong> —
    * Incoming SMS to the Netherlands phone
    * numbers</li><li><strong>SMS_IN_MOB_PE</strong> — Incoming SMS to Peru
    * phone numbers</li><li><strong>SMS_IN_MOB_PL</strong> — Incoming SMS
    * to Poland phone numbers</li><li><strong>SMS_IN_MOB_PR</strong> —
    * Incoming SMS to Puerto Rico phone
    * numbers</li><li><strong>SMS_IN_MOB_PT</strong> — Incoming SMS to
    * Portugal phone numbers</li><li><strong>SMS_IN_MOB_RU</strong> —
    * Incoming SMS to Russia phone
    * numbers</li><li><strong>SMS_IN_MOB_SE</strong> — Incoming SMS to
    * Sweden phone numbers</li><li><strong>SMS_IN_MOB_TH</strong> —
    * Incoming SMS to Thailand phone
    * numbers</li><li><strong>SMS_IN_MOB_TR</strong> — Incoming SMS to
    * Turkey phone numbers</li><li><strong>SMS_IN_MOB_US</strong> —
    * Incoming SMS to the United States phone
    * numbers</li><li><strong>SMSINPUT</strong> — Incoming
    * SMS</li><li><strong>SMSOUT</strong> — Outgoing
    * SMS</li><li><strong>SMSOUT_INTERNATIONAL</strong> — International
    * outgoing SMS</li><li><strong>SMSOUT_RU_INTERNATIONAL</strong> —
    * International outgoing SMS from
    * Russia</li><li><strong>TRANSCRIPTION</strong> — Speech
    * transcription</li><li><strong>TTS_CARTESIA</strong> — Text-to-speech
    * by Cartesia</li><li><strong>TTS_ELEVENLABS</strong> — Text-to-speech
    * by ElevenLabs</li><li><strong>TTS_GOOGLE_REALTIME</strong> — Realtime
    * text-to-speech by Google</li><li><strong>TTS_INWORLD</strong> —
    * Text-to-speech by Inworld</li><li><strong>TTS_SMARTSPEECH</strong> —
    * Text-to-speech by
    * SmartSpeech</li><li><strong>TTS_TEXT_CUSTOM_CREDENTIALS</strong> —
    * Text-to-speech with custom
    * credentials</li><li><strong>TTS_TEXT_GOOGLE</strong> — Text-to-speech
    * by Google</li><li><strong>TTS_TINKOFF</strong> — Text-to-speech by
    * T-bank</li><li><strong>TTS_YANDEX_NEURAL</strong> — Text-to-speech by
    * Yandex</li><li><strong>VIDEOCALL</strong> — Video
    * calls</li><li><strong>VIDEOCONFCALL_IN</strong> — Incoming video
    * conference</li><li><strong>VIDEOCONFCALL_OUT</strong> — Outgoing
    * video conference</li><li><strong>VIDEOCONFRECORD</strong> — Video
    * conference recording per
    * minute</li><li><strong>VIDEOPARTRECORD</strong> — Video conference
    * member recording per minute</li><li><strong>VIDEORECORD</strong> —
    * Video call recording</li><li><strong>VOICEMAILDETECTION</strong> —
    * Voicemail detection</li><li><strong>VOIPIN</strong> — Incoming VoIP
    * calls</li><li><strong>VOIPOUT</strong> — Outgoing VoIP
    * calls</li><li><strong>WAB_VOICE_IN</strong> — Incoming WhatsApp
    * Business calls</li><li><strong>WAB_VOICE_OUT_CONNECTOR</strong> —
    * Outgoing WhatsApp Business
    * calls</li><li><strong>WEBSOCKET_AUDIO</strong> — Audio via
    * WebSockets</li><li><strong>YANDEXASR</strong> — Speech recognition by
    * Yandex</li></ul>
    */
    public MultiArgument<String> getResourceType() {
        return this.resourceType;
    }

    public boolean hasResourceType() {
        return this.resourceType != null;
    }

    /**
    * The resource type list separated by semicolons (;). The possible
    * values are: <ul><li><strong>A2P_SMS_E212</strong> — Service
    * SMS</li><li><strong>ASR</strong> — Speech
    * recognition</li><li><strong>ASR_AWS</strong> — Speech recognition by
    * Amazon</li><li><strong>ASR_DEEPGRAM</strong> — Speech recognition by
    * Deepgram</li><li><strong>ASR_GOOGLE_ENHANCED</strong> — Speech
    * recognition by Google</li><li><strong>ASR_SMARTSPEECH</strong> —
    * Speech recognition by SmartSpeech</li><li><strong>ASR_YANDEX</strong>
    * — Speech recognition by
    * Yandex</li><li><strong>AUDIOHDCONFERENCE</strong> — HD audio
    * conferencing</li><li><strong>AUDIOHDRECORD</strong> — HD audio call
    * recording</li><li><strong>AUDIORECORD</strong> — Audio call
    * recording</li><li><strong>CALLSESSION</strong> — Simultaneous
    * sessions per account</li><li><strong>DIALOGFLOW</strong> — Dialogflow
    * ES</li><li><strong>DIALOGFLOW_CX</strong> — Dialogflow
    * CX</li><li><strong>IM_OVERRUN</strong> — Exceeding instant
    * messages</li><li><strong>KV_STORAGE</strong> — Key-value
    * storage</li><li><strong>MAU_OVERRUN</strong> — Exceeding monthly
    * active users</li><li><strong>NLU</strong> — Avatar
    * requests</li><li><strong>PSTN_IN_ALASKA</strong> — Incoming phone
    * calls to Alaska phone numbers</li><li><strong>PSTN_IN_GB</strong> —
    * Incoming phone calls to United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_GEO_AE</strong> — Incoming
    * geographical phone calls to UAE phone
    * numbers</li><li><strong>PSTN_IN_GEO_AO</strong> — Incoming
    * geographical phone calls to Angola phone
    * numbers</li><li><strong>PSTN_IN_GEO_BH</strong> — Incoming
    * geographical phone calls to Bahrain phone
    * numbers</li><li><strong>PSTN_IN_GEO_BR</strong> — Incoming
    * geographical phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_GEO_CN</strong> — Incoming
    * geographical phone calls to China phone
    * numbers</li><li><strong>PSTN_IN_GEO_EC</strong> — Incoming
    * geographical phone calls to Ecuador phone
    * numbers</li><li><strong>PSTN_IN_GEO_IN</strong> — Incoming
    * geographical phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_GEO_JO</strong> — Incoming
    * geographical phone calls to Jordan phone
    * numbers</li><li><strong>PSTN_IN_GEO_JP</strong> — Incoming
    * geographical phone calls to Japan phone
    * numbers</li><li><strong>PSTN_IN_GEO_KG</strong> — Incoming
    * geographical phone calls to Kyrgyzstan phone
    * numbers</li><li><strong>PSTN_IN_GEO_KH</strong> — Incoming
    * geographical phone calls to Cambodia phone
    * numbers</li><li><strong>PSTN_IN_GEO_MA</strong> — Incoming
    * geographical phone calls to Morocco phone
    * numbers</li><li><strong>PSTN_IN_GEO_NG</strong> — Incoming
    * geographical phone calls to Nigeria phone
    * numbers</li><li><strong>PSTN_IN_GEO_PE</strong> — Incoming
    * geographical phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_GEO_PH</strong> — Incoming
    * geographical phone calls to Philippines phone
    * numbers</li><li><strong>PSTN_IN_GEO_PK</strong> — Incoming
    * geographical phone calls to Pakistan phone
    * numbers</li><li><strong>PSTN_IN_GEO_PY</strong> — Incoming
    * geographical phone calls to Paraguay phone
    * numbers</li><li><strong>PSTN_IN_GEO_RS</strong> — Incoming
    * geographical phone calls to Serbia phone
    * numbers</li><li><strong>PSTN_IN_GEO_SA</strong> — Incoming
    * geographical phone calls to Saudi Arabia phone
    * numbers</li><li><strong>PSTN_IN_GEO_UG</strong> — Incoming
    * geographical phone calls to Uganda phone
    * numbers</li><li><strong>PSTN_IN_GEO_UY</strong> — Incoming
    * geographical phone calls to Uruguay phone
    * numbers</li><li><strong>PSTN_IN_GEO_UZ</strong> — Incoming
    * geographical phone calls to Uzbekistan phone
    * numbers</li><li><strong>PSTN_IN_GEO_VN</strong> — Incoming
    * geographical phone calls to Vietnam phone
    * numbers</li><li><strong>PSTN_IN_GEOGRAPHIC</strong> — Incoming
    * geographical phone calls</li><li><strong>PSTN_IN_MOB_AU</strong> —
    * Incoming mobile phone calls to Australia phone
    * numbers</li><li><strong>PSTN_IN_MOB_BD</strong> — Incoming mobile
    * phone calls to Bangladesh phone
    * numbers</li><li><strong>PSTN_IN_MOB_BE</strong> — Incoming mobile
    * phone calls to Belgium phone
    * numbers</li><li><strong>PSTN_IN_MOB_BR</strong> — Incoming mobile
    * phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_MOB_CA</strong> — Incoming mobile
    * phone calls to Canada phone
    * numbers</li><li><strong>PSTN_IN_MOB_CO</strong> — Incoming mobile
    * phone calls to Colombia phone
    * numbers</li><li><strong>PSTN_IN_MOB_DK</strong> — Incoming mobile
    * phone calls to Denmark phone
    * numbers</li><li><strong>PSTN_IN_MOB_EG</strong> — Incoming mobile
    * phone calls to Egypt phone
    * numbers</li><li><strong>PSTN_IN_MOB_FI</strong> — Incoming mobile
    * phone calls to Finland phone
    * numbers</li><li><strong>PSTN_IN_MOB_GB</strong> — Incoming mobile
    * phone calls to United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_MOB_HK</strong> — Incoming mobile
    * phone calls to Hong Kong phone
    * numbers</li><li><strong>PSTN_IN_MOB_ID</strong> — Incoming mobile
    * phone calls to Indonesia phone
    * numbers</li><li><strong>PSTN_IN_MOB_IL</strong> — Incoming mobile
    * phone calls to Israel phone
    * numbers</li><li><strong>PSTN_IN_MOB_IN</strong> — Incoming mobile
    * phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_MOB_KZ</strong> — Incoming mobile
    * phone calls to Kazakhstan phone
    * numbers</li><li><strong>PSTN_IN_MOB_LA</strong> — Incoming mobile
    * phone calls to Laos phone
    * numbers</li><li><strong>PSTN_IN_MOB_LV</strong> — Incoming mobile
    * phone calls to Latvia phone
    * numbers</li><li><strong>PSTN_IN_MOB_MU</strong> — Incoming mobile
    * phone calls to Mauritius phone
    * numbers</li><li><strong>PSTN_IN_MOB_MX</strong> — Incoming mobile
    * phone calls to Mexico phone
    * numbers</li><li><strong>PSTN_IN_MOB_MY</strong> — Incoming mobile
    * phone calls to Malaysia phone
    * numbers</li><li><strong>PSTN_IN_MOB_NI</strong> — Incoming mobile
    * phone calls to Nicaragua phone
    * numbers</li><li><strong>PSTN_IN_MOB_NL</strong> — Incoming mobile
    * phone calls to the Netherlands phone
    * numbers</li><li><strong>PSTN_IN_MOB_NP</strong> — Incoming mobile
    * phone calls to Nepal phone
    * numbers</li><li><strong>PSTN_IN_MOB_PE</strong> — Incoming mobile
    * phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_MOB_PL</strong> — Incoming mobile
    * phone calls to Poland phone
    * numbers</li><li><strong>PSTN_IN_MOB_PR</strong> — Incoming mobile
    * phone calls to Puerto Rico phone
    * numbers</li><li><strong>PSTN_IN_MOB_PT</strong> — Incoming mobile
    * phone calls to Portugal phone
    * numbers</li><li><strong>PSTN_IN_MOB_RU</strong> — Incoming mobile
    * phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_MOB_SE</strong> — Incoming mobile
    * phone calls to Sweden phone
    * numbers</li><li><strong>PSTN_IN_MOB_US</strong> — Incoming mobile
    * phone calls to the United States phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_AM</strong> — Incoming
    * national phone calls to Armenia phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_BO</strong> — Incoming
    * national phone calls to Bolivia phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_HN</strong> — Incoming
    * national phone calls to Honduras phone
    * numbers</li><li><strong>PSTN_IN_NATIONAL_JM</strong> — Incoming
    * national phone calls to Jamaica phone
    * numbers</li><li><strong>PSTN_IN_RU</strong> — Incoming phone calls to
    * Russia phone numbers</li><li><strong>PSTN_IN_RU_TOLLFREE</strong> —
    * Incoming toll-free phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_SC_AU</strong> — Incoming phone calls
    * to Australia phone numbers</li><li><strong>PSTN_IN_STAR_RU</strong> —
    * Incoming phone calls to Russia phone
    * numbers</li><li><strong>PSTN_IN_TF_AR</strong> — Incoming toll-free
    * phone calls to Argentina phone
    * numbers</li><li><strong>PSTN_IN_TF_AT</strong> — Incoming toll-free
    * phone calls to Austria phone
    * numbers</li><li><strong>PSTN_IN_TF_AU</strong> — Incoming toll-free
    * phone calls to Australia phone
    * numbers</li><li><strong>PSTN_IN_TF_BE</strong> — Incoming toll-free
    * phone calls to Belgium phone
    * numbers</li><li><strong>PSTN_IN_TF_BG</strong> — Incoming toll-free
    * phone calls to Bulgaria phone
    * numbers</li><li><strong>PSTN_IN_TF_BH</strong> — Incoming toll-free
    * phone calls to Bahrain phone
    * numbers</li><li><strong>PSTN_IN_TF_BR</strong> — Incoming toll-free
    * phone calls to Brazil phone
    * numbers</li><li><strong>PSTN_IN_TF_BY</strong> — Incoming toll-free
    * phone calls to Belarus phone
    * numbers</li><li><strong>PSTN_IN_TF_CA</strong> — Incoming toll-free
    * phone calls to Canada phone
    * numbers</li><li><strong>PSTN_IN_TF_CH</strong> — Incoming toll-free
    * phone calls to Switzerland phone
    * numbers</li><li><strong>PSTN_IN_TF_CL</strong> — Incoming toll-free
    * phone calls to Chile phone
    * numbers</li><li><strong>PSTN_IN_TF_CO</strong> — Incoming toll-free
    * phone calls to Colombia phone
    * numbers</li><li><strong>PSTN_IN_TF_CR</strong> — Incoming toll-free
    * phone calls to Costa Rica phone
    * numbers</li><li><strong>PSTN_IN_TF_CY</strong> — Incoming toll-free
    * phone calls to Cyprus phone
    * numbers</li><li><strong>PSTN_IN_TF_CZ</strong> — Incoming toll-free
    * phone calls to Czechia phone
    * numbers</li><li><strong>PSTN_IN_TF_DE</strong> — Incoming toll-free
    * phone calls to Germany phone
    * numbers</li><li><strong>PSTN_IN_TF_DK</strong> — Incoming toll-free
    * phone calls to Denmark phone
    * numbers</li><li><strong>PSTN_IN_TF_DO</strong> — Incoming toll-free
    * phone calls to Dominican Republic phone
    * numbers</li><li><strong>PSTN_IN_TF_EC</strong> — Incoming toll-free
    * phone calls to Ecuador phone
    * numbers</li><li><strong>PSTN_IN_TF_EE</strong> — Incoming toll-free
    * phone calls to Estonia phone
    * numbers</li><li><strong>PSTN_IN_TF_EG</strong> — Incoming toll-free
    * phone calls to Egypt phone
    * numbers</li><li><strong>PSTN_IN_TF_ES</strong> — Incoming toll-free
    * phone calls to Spain phone
    * numbers</li><li><strong>PSTN_IN_TF_FI</strong> — Incoming toll-free
    * phone calls to Finland phone
    * numbers</li><li><strong>PSTN_IN_TF_FR</strong> — Incoming toll-free
    * phone calls to France phone
    * numbers</li><li><strong>PSTN_IN_TF_GB</strong> — Incoming toll-free
    * phone calls to the United Kingdom phone
    * numbers</li><li><strong>PSTN_IN_TF_GF</strong> — Incoming toll-free
    * phone calls to French Guiana phone
    * numbers</li><li><strong>PSTN_IN_TF_GP</strong> — Incoming toll-free
    * phone calls to Guadeloupe phone
    * numbers</li><li><strong>PSTN_IN_TF_HK</strong> — Incoming toll-free
    * phone calls to Hong Kong phone
    * numbers</li><li><strong>PSTN_IN_TF_HR</strong> — Incoming toll-free
    * phone calls to Croatia phone
    * numbers</li><li><strong>PSTN_IN_TF_HU</strong> — Incoming toll-free
    * phone calls to Hungary phone
    * numbers</li><li><strong>PSTN_IN_TF_ID</strong> — Incoming toll-free
    * phone calls to Indonesia phone
    * numbers</li><li><strong>PSTN_IN_TF_IE</strong> — Incoming toll-free
    * phone calls to Ireland phone
    * numbers</li><li><strong>PSTN_IN_TF_IL</strong> — Incoming toll-free
    * phone calls to Israel phone
    * numbers</li><li><strong>PSTN_IN_TF_IN</strong> — Incoming toll-free
    * phone calls to India phone
    * numbers</li><li><strong>PSTN_IN_TF_IS</strong> — Incoming toll-free
    * phone calls to Iceland phone
    * numbers</li><li><strong>PSTN_IN_TF_IT</strong> — Incoming toll-free
    * phone calls to Italy phone
    * numbers</li><li><strong>PSTN_IN_TF_KE</strong> — Incoming toll-free
    * phone calls to Kenya phone
    * numbers</li><li><strong>PSTN_IN_TF_KR</strong> — Incoming toll-free
    * phone calls to South Korea phone
    * numbers</li><li><strong>PSTN_IN_TF_KW</strong> — Incoming toll-free
    * phone calls to Kuwait phone
    * numbers</li><li><strong>PSTN_IN_TF_KZ</strong> — Incoming toll-free
    * phone calls to Kazakhstan phone
    * numbers</li><li><strong>PSTN_IN_TF_LT</strong> — Incoming toll-free
    * phone calls to Lithuania phone
    * numbers</li><li><strong>PSTN_IN_TF_LV</strong> — Incoming toll-free
    * phone calls to Latvia phone
    * numbers</li><li><strong>PSTN_IN_TF_MC</strong> — Incoming toll-free
    * phone calls to Monaco phone
    * numbers</li><li><strong>PSTN_IN_TF_MK</strong> — Incoming toll-free
    * phone calls to North Macedonia phone
    * numbers</li><li><strong>PSTN_IN_TF_MQ</strong> — Incoming toll-free
    * phone calls to Martinique phone
    * numbers</li><li><strong>PSTN_IN_TF_MT</strong> — Incoming toll-free
    * phone calls to Malta phone
    * numbers</li><li><strong>PSTN_IN_TF_MX</strong> — Incoming toll-free
    * phone calls to Mexico phone
    * numbers</li><li><strong>PSTN_IN_TF_NL</strong> — Incoming toll-free
    * phone calls to the Netherlands phone
    * numbers</li><li><strong>PSTN_IN_TF_NZ</strong> — Incoming toll-free
    * phone calls to New Zealand phone
    * numbers</li><li><strong>PSTN_IN_TF_OM</strong> — Incoming toll-free
    * phone calls to Oman phone
    * numbers</li><li><strong>PSTN_IN_TF_PA</strong> — Incoming toll-free
    * phone calls to Panama phone
    * numbers</li><li><strong>PSTN_IN_TF_PE</strong> — Incoming toll-free
    * phone calls to Peru phone
    * numbers</li><li><strong>PSTN_IN_TF_PK</strong> — Incoming toll-free
    * phone calls to Pakistan phone
    * numbers</li><li><strong>PSTN_IN_TF_PR</strong> — Incoming toll-free
    * phone calls to Puerto Rico phone
    * numbers</li><li><strong>PSTN_IN_TF_QA</strong> — Incoming toll-free
    * phone calls to Qatar phone
    * numbers</li><li><strong>PSTN_IN_TF_RE</strong> — Incoming toll-free
    * phone calls to Reunion phone
    * numbers</li><li><strong>PSTN_IN_TF_RO</strong> — Incoming toll-free
    * phone calls to Romania phone
    * numbers</li><li><strong>PSTN_IN_TF_RS</strong> — Incoming toll-free
    * phone calls to Serbia phone
    * numbers</li><li><strong>PSTN_IN_TF_SA</strong> — Incoming toll-free
    * phone calls to Saudi Arabia phone
    * numbers</li><li><strong>PSTN_IN_TF_SE</strong> — Incoming toll-free
    * phone calls to Sweden phone
    * numbers</li><li><strong>PSTN_IN_TF_SI</strong> — Incoming toll-free
    * phone calls to Slovenia phone
    * numbers</li><li><strong>PSTN_IN_TF_SK</strong> — Incoming toll-free
    * phone calls to Slovakia phone
    * numbers</li><li><strong>PSTN_IN_TF_TH</strong> — Incoming toll-free
    * phone calls to Thailand phone
    * numbers</li><li><strong>PSTN_IN_TF_UA</strong> — Incoming toll-free
    * phone calls to Ukraine phone
    * numbers</li><li><strong>PSTN_IN_TF_UG</strong> — Incoming toll-free
    * phone calls to Uganda phone
    * numbers</li><li><strong>PSTN_IN_TF_US</strong> — Incoming toll-free
    * phone calls to the United States phone
    * numbers</li><li><strong>PSTN_IN_TF_VE</strong> — Incoming toll-free
    * phone calls to Venezuela phone
    * numbers</li><li><strong>PSTN_IN_TF_YT</strong> — Incoming toll-free
    * phone calls to Mayotte phone
    * numbers</li><li><strong>PSTN_IN_TF_ZA</strong> — Incoming toll-free
    * phone calls to South Africa phone
    * numbers</li><li><strong>PSTN_IN_US</strong> — Incoming phone calls to
    * the United States phone
    * numbers</li><li><strong>PSTN_INTERNATIONAL</strong> — Outgoing
    * international calls</li><li><strong>PSTN_OUT_INCOUNTRY</strong> —
    * Outgoing domestic phone
    * calls</li><li><strong>PSTN_OUT_LOCAL_RU</strong> — Outgoing domestic
    * phone calls in Russia</li><li><strong>PSTNOUT</strong> — Outgoing
    * phone calls</li><li><strong>PSTNOUT_EEA</strong> — Outgoing phone
    * calls to EEA</li><li><strong>PSTNOUT_LOCAL</strong> — Outgoing local
    * phone calls</li><li><strong>RELAYED_TRAFFIC</strong> — TURN server
    * relayed traffic</li><li><strong>SIPIN</strong> — Incoming SIP
    * calls</li><li><strong>SIPOUT</strong> — Outgoing SIP
    * calls</li><li><strong>SIPREFER</strong> — Call transfer via SIP
    * REFER</li><li><strong>SMS_IN_MOB_AU</strong> — Incoming SMS to
    * Australia phone numbers</li><li><strong>SMS_IN_MOB_BE</strong> —
    * Incoming SMS to Belgium phone
    * numbers</li><li><strong>SMS_IN_MOB_BR</strong> — Incoming SMS to
    * Brazil phone numbers</li><li><strong>SMS_IN_MOB_CA</strong> —
    * Incoming SMS to Canada phone
    * numbers</li><li><strong>SMS_IN_MOB_CL</strong> — Incoming SMS to
    * Chile phone numbers</li><li><strong>SMS_IN_MOB_CO</strong> — Incoming
    * SMS to Colombia phone numbers</li><li><strong>SMS_IN_MOB_DK</strong>
    * — Incoming SMS to Denmark phone
    * numbers</li><li><strong>SMS_IN_MOB_FI</strong> — Incoming SMS to
    * Finland phone numbers</li><li><strong>SMS_IN_MOB_FR</strong> —
    * Incoming SMS to France phone
    * numbers</li><li><strong>SMS_IN_MOB_GB</strong> — Incoming SMS to the
    * United Kingdom phone numbers</li><li><strong>SMS_IN_MOB_HK</strong> —
    * Incoming SMS to Hong Kong phone
    * numbers</li><li><strong>SMS_IN_MOB_IL</strong> — Incoming SMS to
    * Israel phone numbers</li><li><strong>SMS_IN_MOB_LV</strong> —
    * Incoming SMS to Latvia phone
    * numbers</li><li><strong>SMS_IN_MOB_MU</strong> — Incoming SMS to
    * Mauritius phone numbers</li><li><strong>SMS_IN_MOB_MX</strong> —
    * Incoming SMS to Mexico phone
    * numbers</li><li><strong>SMS_IN_MOB_MY</strong> — Incoming SMS to
    * Malaysia phone numbers</li><li><strong>SMS_IN_MOB_NL</strong> —
    * Incoming SMS to the Netherlands phone
    * numbers</li><li><strong>SMS_IN_MOB_PE</strong> — Incoming SMS to Peru
    * phone numbers</li><li><strong>SMS_IN_MOB_PL</strong> — Incoming SMS
    * to Poland phone numbers</li><li><strong>SMS_IN_MOB_PR</strong> —
    * Incoming SMS to Puerto Rico phone
    * numbers</li><li><strong>SMS_IN_MOB_PT</strong> — Incoming SMS to
    * Portugal phone numbers</li><li><strong>SMS_IN_MOB_RU</strong> —
    * Incoming SMS to Russia phone
    * numbers</li><li><strong>SMS_IN_MOB_SE</strong> — Incoming SMS to
    * Sweden phone numbers</li><li><strong>SMS_IN_MOB_TH</strong> —
    * Incoming SMS to Thailand phone
    * numbers</li><li><strong>SMS_IN_MOB_TR</strong> — Incoming SMS to
    * Turkey phone numbers</li><li><strong>SMS_IN_MOB_US</strong> —
    * Incoming SMS to the United States phone
    * numbers</li><li><strong>SMSINPUT</strong> — Incoming
    * SMS</li><li><strong>SMSOUT</strong> — Outgoing
    * SMS</li><li><strong>SMSOUT_INTERNATIONAL</strong> — International
    * outgoing SMS</li><li><strong>SMSOUT_RU_INTERNATIONAL</strong> —
    * International outgoing SMS from
    * Russia</li><li><strong>TRANSCRIPTION</strong> — Speech
    * transcription</li><li><strong>TTS_CARTESIA</strong> — Text-to-speech
    * by Cartesia</li><li><strong>TTS_ELEVENLABS</strong> — Text-to-speech
    * by ElevenLabs</li><li><strong>TTS_GOOGLE_REALTIME</strong> — Realtime
    * text-to-speech by Google</li><li><strong>TTS_INWORLD</strong> —
    * Text-to-speech by Inworld</li><li><strong>TTS_SMARTSPEECH</strong> —
    * Text-to-speech by
    * SmartSpeech</li><li><strong>TTS_TEXT_CUSTOM_CREDENTIALS</strong> —
    * Text-to-speech with custom
    * credentials</li><li><strong>TTS_TEXT_GOOGLE</strong> — Text-to-speech
    * by Google</li><li><strong>TTS_TINKOFF</strong> — Text-to-speech by
    * T-bank</li><li><strong>TTS_YANDEX_NEURAL</strong> — Text-to-speech by
    * Yandex</li><li><strong>VIDEOCALL</strong> — Video
    * calls</li><li><strong>VIDEOCONFCALL_IN</strong> — Incoming video
    * conference</li><li><strong>VIDEOCONFCALL_OUT</strong> — Outgoing
    * video conference</li><li><strong>VIDEOCONFRECORD</strong> — Video
    * conference recording per
    * minute</li><li><strong>VIDEOPARTRECORD</strong> — Video conference
    * member recording per minute</li><li><strong>VIDEORECORD</strong> —
    * Video call recording</li><li><strong>VOICEMAILDETECTION</strong> —
    * Voicemail detection</li><li><strong>VOIPIN</strong> — Incoming VoIP
    * calls</li><li><strong>VOIPOUT</strong> — Outgoing VoIP
    * calls</li><li><strong>WAB_VOICE_IN</strong> — Incoming WhatsApp
    * Business calls</li><li><strong>WAB_VOICE_OUT_CONNECTOR</strong> —
    * Outgoing WhatsApp Business
    * calls</li><li><strong>WEBSOCKET_AUDIO</strong> — Audio via
    * WebSockets</li><li><strong>YANDEXASR</strong> — Speech recognition by
    * Yandex</li></ul>
    */
    public GetResourcePriceRequest setResourceType(MultiArgument<String> d) {
        this.resourceType = d;
        return this;
    }

    private MultiArgument<Long> priceGroupId;

    @RequestField(name="price_group_id")
    /**
    * The price group ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getPriceGroupId() {
        return this.priceGroupId;
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    /**
    * The price group ID list separated by semicolons (;)
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
    * The resource parameter list separated by semicolons (;). Example: a
    * phone number list
    */
    public MultiArgument<String> getResourceParam() {
        return this.resourceParam;
    }

    public boolean hasResourceParam() {
        return this.resourceParam != null;
    }

    /**
    * The resource parameter list separated by semicolons (;). Example: a
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
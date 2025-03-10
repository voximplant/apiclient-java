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

public class SetAccountInfoRequest implements Alignable {
    private String newAccountEmail;

    @RequestField(name="new_account_email")
    /**
    * The new account email
    */
    public String getNewAccountEmail() {
        return this.newAccountEmail;
    }

    public boolean hasNewAccountEmail() {
        return this.newAccountEmail != null;
    }

    /**
    * The new account email
    */
    public SetAccountInfoRequest setNewAccountEmail(String d) {
        this.newAccountEmail = d;
        return this;
    }

    private String newAccountPassword;

    @RequestField(name="new_account_password")
    /**
    * The new account password. Must be at least 8 characters long and
    * contain at least one uppercase and lowercase letter, one number, and
    * one special character
    */
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

    public boolean hasNewAccountPassword() {
        return this.newAccountPassword != null;
    }

    /**
    * The new account password. Must be at least 8 characters long and
    * contain at least one uppercase and lowercase letter, one number, and
    * one special character
    */
    public SetAccountInfoRequest setNewAccountPassword(String d) {
        this.newAccountPassword = d;
        return this;
    }

    private String languageCode;

    @RequestField(name="language_code")
    /**
    * The notification language code (2 symbols, ISO639-1). The following
    * values are available: aa (Afar), ab (Abkhazian), af (Afrikaans), am
    * (Amharic), ar (Arabic), as (Assamese), ay (Aymara), az (Azerbaijani),
    * ba (Bashkir), be (Belarusian), bg (Bulgarian), bh (Bihari), bi
    * (Bislama), bn (Bengali), bo (Tibetan), br (Breton), ca (Catalan), co
    * (Corsican), cs (Czech), cy (Welch), da (Danish), de (German), dz
    * (Bhutani), el (Greek), en (English), eo (Esperanto), es (Spanish), et
    * (Estonian), eu (Basque), fa (Persian), fi (Finnish), fj (Fiji), fo
    * (Faeroese), fr (French), fy (Frisian), ga (Irish), gd (Scots Gaelic),
    * gl (Galician), gn (Guarani), gu (Gujarati), ha (Hausa), hi (Hindi),
    * he (Hebrew), hr (Croatian), hu (Hungarian), hy (Armenian), ia
    * (Interlingua), id (Indonesian), ie (Interlingue), ik (Inupiak), in
    * (Indonesian), is (Icelandic), it (Italian), iu (Inuktitut), iw
    * (Hebrew), ja (Japanese), ji (Yiddish), jw (Javanese), ka (Georgian),
    * kk (Kazakh), kl (Greenlandic), km (Cambodian), kn (Kannada), ko
    * (Korean), ks (Kashmiri), ku (Kurdish), ky (Kirghiz), la (Latin), ln
    * (Lingala), lo (Laothian), lt (Lithuanian), lv (Latvian), mg
    * (Malagasy), mi (Maori), mk (Macedonian), ml (Malayalam), mn
    * (Mongolian), mo (Moldavian), mr (Marathi), ms (Malay), mt (Maltese),
    * my (Burmese), na (Nauru), ne (Nepali), nl (Dutch), no (Norwegian), oc
    * (Occitan), om (Oromo), or (Oriya), pa (Punjabi), pl (Polish), ps
    * (Pashto), pt (Portuguese), qu (Quechua), rm (Rhaeto-Romance), rn
    * (Kirundi), ro (Romanian), ru (Russian), rw (Kinyarwanda), sa
    * (Sanskrit), sd (Sindhi), sg (Sangro), sh (Serbo-Croatian), si
    * (Singhalese), sk (Slovak), sl (Slovenian), sm (Samoan), sn (Shona),
    * so (Somali), sq (Albanian), sr (Serbian), ss (Siswati), st (Sesotho),
    * su (Sudanese), sv (Swedish), sw (Swahili), ta (Tamil), te (Tegulu),
    * tg (Tajik), th (Thai), ti (Tigrinya), tk (Turkmen), tl (Tagalog), tn
    * (Setswana), to (Tonga), tr (Turkish), ts (Tsonga), tt (Tatar), tw
    * (Twi), ug (Uigur), uk (Ukrainian), ur (Urdu), uz (Uzbek), vi
    * (Vietnamese), vo (Volapuk), wo (Wolof), xh (Xhosa), yi (Yiddish), yo
    * (Yoruba), za (Zhuang), zh (Chinese), zu (Zulu)
    */
    public String getLanguageCode() {
        return this.languageCode;
    }

    public boolean hasLanguageCode() {
        return this.languageCode != null;
    }

    /**
    * The notification language code (2 symbols, ISO639-1). The following
    * values are available: aa (Afar), ab (Abkhazian), af (Afrikaans), am
    * (Amharic), ar (Arabic), as (Assamese), ay (Aymara), az (Azerbaijani),
    * ba (Bashkir), be (Belarusian), bg (Bulgarian), bh (Bihari), bi
    * (Bislama), bn (Bengali), bo (Tibetan), br (Breton), ca (Catalan), co
    * (Corsican), cs (Czech), cy (Welch), da (Danish), de (German), dz
    * (Bhutani), el (Greek), en (English), eo (Esperanto), es (Spanish), et
    * (Estonian), eu (Basque), fa (Persian), fi (Finnish), fj (Fiji), fo
    * (Faeroese), fr (French), fy (Frisian), ga (Irish), gd (Scots Gaelic),
    * gl (Galician), gn (Guarani), gu (Gujarati), ha (Hausa), hi (Hindi),
    * he (Hebrew), hr (Croatian), hu (Hungarian), hy (Armenian), ia
    * (Interlingua), id (Indonesian), ie (Interlingue), ik (Inupiak), in
    * (Indonesian), is (Icelandic), it (Italian), iu (Inuktitut), iw
    * (Hebrew), ja (Japanese), ji (Yiddish), jw (Javanese), ka (Georgian),
    * kk (Kazakh), kl (Greenlandic), km (Cambodian), kn (Kannada), ko
    * (Korean), ks (Kashmiri), ku (Kurdish), ky (Kirghiz), la (Latin), ln
    * (Lingala), lo (Laothian), lt (Lithuanian), lv (Latvian), mg
    * (Malagasy), mi (Maori), mk (Macedonian), ml (Malayalam), mn
    * (Mongolian), mo (Moldavian), mr (Marathi), ms (Malay), mt (Maltese),
    * my (Burmese), na (Nauru), ne (Nepali), nl (Dutch), no (Norwegian), oc
    * (Occitan), om (Oromo), or (Oriya), pa (Punjabi), pl (Polish), ps
    * (Pashto), pt (Portuguese), qu (Quechua), rm (Rhaeto-Romance), rn
    * (Kirundi), ro (Romanian), ru (Russian), rw (Kinyarwanda), sa
    * (Sanskrit), sd (Sindhi), sg (Sangro), sh (Serbo-Croatian), si
    * (Singhalese), sk (Slovak), sl (Slovenian), sm (Samoan), sn (Shona),
    * so (Somali), sq (Albanian), sr (Serbian), ss (Siswati), st (Sesotho),
    * su (Sudanese), sv (Swedish), sw (Swahili), ta (Tamil), te (Tegulu),
    * tg (Tajik), th (Thai), ti (Tigrinya), tk (Turkmen), tl (Tagalog), tn
    * (Setswana), to (Tonga), tr (Turkish), ts (Tsonga), tt (Tatar), tw
    * (Twi), ug (Uigur), uk (Ukrainian), ur (Urdu), uz (Uzbek), vi
    * (Vietnamese), vo (Volapuk), wo (Wolof), xh (Xhosa), yi (Yiddish), yo
    * (Yoruba), za (Zhuang), zh (Chinese), zu (Zulu)
    */
    public SetAccountInfoRequest setLanguageCode(String d) {
        this.languageCode = d;
        return this;
    }

    private String location;

    @RequestField(name="location")
    /**
    * The account location (timezone). Examples: America/Los_Angeles,
    * Etc/GMT-8, Etc/GMT+10
    */
    public String getLocation() {
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null;
    }

    /**
    * The account location (timezone). Examples: America/Los_Angeles,
    * Etc/GMT-8, Etc/GMT+10
    */
    public SetAccountInfoRequest setLocation(String d) {
        this.location = d;
        return this;
    }

    private String accountFirstName;

    @RequestField(name="account_first_name")
    /**
    * The first name
    */
    public String getAccountFirstName() {
        return this.accountFirstName;
    }

    public boolean hasAccountFirstName() {
        return this.accountFirstName != null;
    }

    /**
    * The first name
    */
    public SetAccountInfoRequest setAccountFirstName(String d) {
        this.accountFirstName = d;
        return this;
    }

    private String accountLastName;

    @RequestField(name="account_last_name")
    /**
    * The last name
    */
    public String getAccountLastName() {
        return this.accountLastName;
    }

    public boolean hasAccountLastName() {
        return this.accountLastName != null;
    }

    /**
    * The last name
    */
    public SetAccountInfoRequest setAccountLastName(String d) {
        this.accountLastName = d;
        return this;
    }

    private String mobilePhone;

    @RequestField(name="mobile_phone")
    /**
    * The mobile phone linked to the account
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean hasMobilePhone() {
        return this.mobilePhone != null;
    }

    /**
    * The mobile phone linked to the account
    */
    public SetAccountInfoRequest setMobilePhone(String d) {
        this.mobilePhone = d;
        return this;
    }

    private BigDecimal minBalanceToNotify;

    @RequestField(name="min_balance_to_notify")
    /**
    * The min balance value to notify by email or SMS
    */
    public BigDecimal getMinBalanceToNotify() {
        return this.minBalanceToNotify;
    }

    public boolean hasMinBalanceToNotify() {
        return this.minBalanceToNotify != null;
    }

    /**
    * The min balance value to notify by email or SMS
    */
    public SetAccountInfoRequest setMinBalanceToNotify(BigDecimal d) {
        this.minBalanceToNotify = d;
        return this;
    }

    private Boolean accountNotifications;

    @RequestField(name="account_notifications")
    /**
    * Whether Voximplant notifications are required
    */
    public Boolean getAccountNotifications() {
        return this.accountNotifications;
    }

    public boolean hasAccountNotifications() {
        return this.accountNotifications != null;
    }

    /**
    * Whether Voximplant notifications are required
    */
    public SetAccountInfoRequest setAccountNotifications(boolean d) {
        this.accountNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean tariffChangingNotifications;

    @RequestField(name="tariff_changing_notifications")
    /**
    * Whether to receive the emails about the Voximplant plan changing
    */
    public Boolean getTariffChangingNotifications() {
        return this.tariffChangingNotifications;
    }

    public boolean hasTariffChangingNotifications() {
        return this.tariffChangingNotifications != null;
    }

    /**
    * Whether to receive the emails about the Voximplant plan changing
    */
    public SetAccountInfoRequest setTariffChangingNotifications(boolean d) {
        this.tariffChangingNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean newsNotifications;

    @RequestField(name="news_notifications")
    /**
    * Whether to receive the emails about the Voximplant news
    */
    public Boolean getNewsNotifications() {
        return this.newsNotifications;
    }

    public boolean hasNewsNotifications() {
        return this.newsNotifications != null;
    }

    /**
    * Whether to receive the emails about the Voximplant news
    */
    public SetAccountInfoRequest setNewsNotifications(boolean d) {
        this.newsNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean sendJsError;

    @RequestField(name="send_js_error")
    /**
    * Whether to receive the emails about a JS scenario error
    */
    public Boolean getSendJsError() {
        return this.sendJsError;
    }

    public boolean hasSendJsError() {
        return this.sendJsError != null;
    }

    /**
    * Whether to receive the emails about a JS scenario error
    */
    public SetAccountInfoRequest setSendJsError(boolean d) {
        this.sendJsError = Boolean.valueOf(d);
        return this;
    }

    private String billingAddressName;

    @RequestField(name="billing_address_name")
    /**
    * The company or businessman name
    */
    public String getBillingAddressName() {
        return this.billingAddressName;
    }

    public boolean hasBillingAddressName() {
        return this.billingAddressName != null;
    }

    /**
    * The company or businessman name
    */
    public SetAccountInfoRequest setBillingAddressName(String d) {
        this.billingAddressName = d;
        return this;
    }

    private String billingAddressCountryCode;

    @RequestField(name="billing_address_country_code")
    /**
    * The billing address country code (2 symbols, ISO 3166-1 alpha-2). The
    * following values are available: AF (Afghanistan), AL (Albania), DZ
    * (Algeria), AS (American Samoa), AD (Andorra), AO (Angola), AI
    * (Anguilla), AQ (Antarctica), AG (Antigua and Barbuda), AR
    * (Argentina), AM (Armenia), AW (Aruba), AU (Australia), AT (Austria),
    * AZ (Azerbaijan), BH (Bahrain), BD (Bangladesh), BB (Barbados), BY
    * (Belarus), BE (Belgium), BZ (Belize), BJ (Benin), BM (Bermuda), BT
    * (Bhutan), BO (Bolivia), BA (Bosnia and Herzegovina), BW (Botswana),
    * BV (Bouvet Island), BR (Brazil), IO (British Indian Ocean Territory),
    * BN (Brunei), BG (Bulgaria), BF (Burkina Faso), BI (Burundi), KH
    * (Cambodia), CM (Cameroon), CA (Canada), CV (Cape Verde), KY (Cayman
    * Islands), CF (Central African Republic), TD (Chad), CL (Chile), CN
    * (China), CX (Christmas Island), CO (Colombia), KM (Comoros), CG
    * (Congo), CK (Cook Islands), CR (Costa Rica), HR (Croatia), CU (Cuba),
    * CY (Cyprus), CZ (Czech Republic), DK (Denmark), DJ (Djibouti), DM
    * (Dominica), DO (Dominican Republic), EC (Ecuador), EG (Egypt), SV (El
    * Salvador), GQ (Equatorial Guinea), ER (Eritrea), EE (Estonia), ET
    * (Ethiopia), FO (Faroe Islands), FJ (Fiji Islands), FI (Finland), FR
    * (France), GF (French Guiana), PF (French Polynesia), TF (French
    * Southern and Antarctic Lands), GA (Gabon), GE (Georgia), DE
    * (Germany), GH (Ghana), GI (Gibraltar), GR (Greece), GL (Greenland),
    * GD (Grenada), GP (Guadeloupe), GU (Guam), GT (Guatemala), GG
    * (Guernsey), GN (Guinea), GY (Guyana), HT (Haiti), HM (Heard Island
    * and McDonald Islands), HN (Honduras), HU (Hungary), IS (Iceland), IN
    * (India), ID (Indonesia), IR (Iran), IQ (Iraq), IE (Ireland), IL
    * (Israel), IT (Italy), JM (Jamaica), JP (Japan), JE (Jersey), JO
    * (Jordan), KZ (Kazakhstan), KE (Kenya), KI (Kiribati), KR (Korea), KW
    * (Kuwait), KG (Kyrgyzstan), LA (Laos), LV (Latvia), LB (Lebanon), LS
    * (Lesotho), LR (Liberia), LY (Libya), LI (Liechtenstein), LT
    * (Lithuania), LU (Luxembourg), MG (Madagascar), MW (Malawi), MY
    * (Malaysia), MV (Maldives), ML (Mali), MT (Malta), MH (Marshall
    * Islands), MQ (Martinique), MR (Mauritania), MU (Mauritius), YT
    * (Mayotte), MX (Mexico), FM (Micronesia), MD (Moldova), MC (Monaco),
    * MN (Mongolia), ME (Montenegro), MS (Montserrat), MA (Morocco), MZ
    * (Mozambique), MM (Myanmar), NA (Namibia), NR (Nauru), NP (Nepal), NL
    * (Netherlands), AN (Netherlands Antilles), NC (New Caledonia), NZ (New
    * Zealand), NI (Nicaragua), NE (Niger), NG (Nigeria), NU (Niue), NF
    * (Norfolk Island), KP (North Korea), MP (Northern Mariana Islands), NO
    * (Norway), OM (Oman), PK (Pakistan), PW (Palau), PS (Palestinian
    * Authority), PA (Panama), PG (Papua New Guinea), PY (Paraguay), PE
    * (Peru), PH (Philippines), PN (Pitcairn Islands), PL (Poland), PT
    * (Portugal), PR (Puerto Rico), QA (Qatar), RE (Reunion), RO (Romania),
    * RU (Russia), RW (Rwanda), WS (Samoa), SM (San Marino), SA (Saudi
    * Arabia), SN (Senegal), RS (Serbia), SC (Seychelles), SL (Sierra
    * Leone), SG (Singapore), SK (Slovakia), SI (Slovenia), SB (Solomon
    * Islands), SO (Somalia), ZA (South Africa), GS (South Georgia and the
    * South Sandwich Islands), ES (Spain), LK (Sri Lanka), SD (Sudan), SR
    * (Suriname), SZ (Swaziland), SE (Sweden), CH (Switzerland), SY
    * (Syria), ST (Sao Tome and Principe), TW (Taiwan), TJ (Tajikistan), TZ
    * (Tanzania), TH (Thailand), TG (Togo), TK (Tokelau), TO (Tonga), TT
    * (Trinidad and Tobago), TN (Tunisia), TR (Turkey), TM (Turkmenistan),
    * TC (Turks and Caicos Islands), TV (Tuvalu), UG (Uganda), UA
    * (Ukraine), AE (United Arab Emirates), GB (United Kingdom), US (United
    * States), UY (Uruguay), UZ (Uzbekistan), VU (Vanuatu), VA (Vatican
    * City), VE (Venezuela), VN (Vietnam), VI (Virgin Islands), WF (Wallis
    * and Futuna), EH (Western Sahara), YE (Yemen), ZM (Zambia), ZW
    * (Zimbabwe), AX (Aland Islands)
    */
    public String getBillingAddressCountryCode() {
        return this.billingAddressCountryCode;
    }

    public boolean hasBillingAddressCountryCode() {
        return this.billingAddressCountryCode != null;
    }

    /**
    * The billing address country code (2 symbols, ISO 3166-1 alpha-2). The
    * following values are available: AF (Afghanistan), AL (Albania), DZ
    * (Algeria), AS (American Samoa), AD (Andorra), AO (Angola), AI
    * (Anguilla), AQ (Antarctica), AG (Antigua and Barbuda), AR
    * (Argentina), AM (Armenia), AW (Aruba), AU (Australia), AT (Austria),
    * AZ (Azerbaijan), BH (Bahrain), BD (Bangladesh), BB (Barbados), BY
    * (Belarus), BE (Belgium), BZ (Belize), BJ (Benin), BM (Bermuda), BT
    * (Bhutan), BO (Bolivia), BA (Bosnia and Herzegovina), BW (Botswana),
    * BV (Bouvet Island), BR (Brazil), IO (British Indian Ocean Territory),
    * BN (Brunei), BG (Bulgaria), BF (Burkina Faso), BI (Burundi), KH
    * (Cambodia), CM (Cameroon), CA (Canada), CV (Cape Verde), KY (Cayman
    * Islands), CF (Central African Republic), TD (Chad), CL (Chile), CN
    * (China), CX (Christmas Island), CO (Colombia), KM (Comoros), CG
    * (Congo), CK (Cook Islands), CR (Costa Rica), HR (Croatia), CU (Cuba),
    * CY (Cyprus), CZ (Czech Republic), DK (Denmark), DJ (Djibouti), DM
    * (Dominica), DO (Dominican Republic), EC (Ecuador), EG (Egypt), SV (El
    * Salvador), GQ (Equatorial Guinea), ER (Eritrea), EE (Estonia), ET
    * (Ethiopia), FO (Faroe Islands), FJ (Fiji Islands), FI (Finland), FR
    * (France), GF (French Guiana), PF (French Polynesia), TF (French
    * Southern and Antarctic Lands), GA (Gabon), GE (Georgia), DE
    * (Germany), GH (Ghana), GI (Gibraltar), GR (Greece), GL (Greenland),
    * GD (Grenada), GP (Guadeloupe), GU (Guam), GT (Guatemala), GG
    * (Guernsey), GN (Guinea), GY (Guyana), HT (Haiti), HM (Heard Island
    * and McDonald Islands), HN (Honduras), HU (Hungary), IS (Iceland), IN
    * (India), ID (Indonesia), IR (Iran), IQ (Iraq), IE (Ireland), IL
    * (Israel), IT (Italy), JM (Jamaica), JP (Japan), JE (Jersey), JO
    * (Jordan), KZ (Kazakhstan), KE (Kenya), KI (Kiribati), KR (Korea), KW
    * (Kuwait), KG (Kyrgyzstan), LA (Laos), LV (Latvia), LB (Lebanon), LS
    * (Lesotho), LR (Liberia), LY (Libya), LI (Liechtenstein), LT
    * (Lithuania), LU (Luxembourg), MG (Madagascar), MW (Malawi), MY
    * (Malaysia), MV (Maldives), ML (Mali), MT (Malta), MH (Marshall
    * Islands), MQ (Martinique), MR (Mauritania), MU (Mauritius), YT
    * (Mayotte), MX (Mexico), FM (Micronesia), MD (Moldova), MC (Monaco),
    * MN (Mongolia), ME (Montenegro), MS (Montserrat), MA (Morocco), MZ
    * (Mozambique), MM (Myanmar), NA (Namibia), NR (Nauru), NP (Nepal), NL
    * (Netherlands), AN (Netherlands Antilles), NC (New Caledonia), NZ (New
    * Zealand), NI (Nicaragua), NE (Niger), NG (Nigeria), NU (Niue), NF
    * (Norfolk Island), KP (North Korea), MP (Northern Mariana Islands), NO
    * (Norway), OM (Oman), PK (Pakistan), PW (Palau), PS (Palestinian
    * Authority), PA (Panama), PG (Papua New Guinea), PY (Paraguay), PE
    * (Peru), PH (Philippines), PN (Pitcairn Islands), PL (Poland), PT
    * (Portugal), PR (Puerto Rico), QA (Qatar), RE (Reunion), RO (Romania),
    * RU (Russia), RW (Rwanda), WS (Samoa), SM (San Marino), SA (Saudi
    * Arabia), SN (Senegal), RS (Serbia), SC (Seychelles), SL (Sierra
    * Leone), SG (Singapore), SK (Slovakia), SI (Slovenia), SB (Solomon
    * Islands), SO (Somalia), ZA (South Africa), GS (South Georgia and the
    * South Sandwich Islands), ES (Spain), LK (Sri Lanka), SD (Sudan), SR
    * (Suriname), SZ (Swaziland), SE (Sweden), CH (Switzerland), SY
    * (Syria), ST (Sao Tome and Principe), TW (Taiwan), TJ (Tajikistan), TZ
    * (Tanzania), TH (Thailand), TG (Togo), TK (Tokelau), TO (Tonga), TT
    * (Trinidad and Tobago), TN (Tunisia), TR (Turkey), TM (Turkmenistan),
    * TC (Turks and Caicos Islands), TV (Tuvalu), UG (Uganda), UA
    * (Ukraine), AE (United Arab Emirates), GB (United Kingdom), US (United
    * States), UY (Uruguay), UZ (Uzbekistan), VU (Vanuatu), VA (Vatican
    * City), VE (Venezuela), VN (Vietnam), VI (Virgin Islands), WF (Wallis
    * and Futuna), EH (Western Sahara), YE (Yemen), ZM (Zambia), ZW
    * (Zimbabwe), AX (Aland Islands)
    */
    public SetAccountInfoRequest setBillingAddressCountryCode(String d) {
        this.billingAddressCountryCode = d;
        return this;
    }

    private String billingAddressAddress;

    @RequestField(name="billing_address_address")
    /**
    * The valid address that needs to be specified to pay for any services.
    * You cannot delete it later, only change
    */
    public String getBillingAddressAddress() {
        return this.billingAddressAddress;
    }

    public boolean hasBillingAddressAddress() {
        return this.billingAddressAddress != null;
    }

    /**
    * The valid address that needs to be specified to pay for any services.
    * You cannot delete it later, only change
    */
    public SetAccountInfoRequest setBillingAddressAddress(String d) {
        this.billingAddressAddress = d;
        return this;
    }

    private String billingAddressZip;

    @RequestField(name="billing_address_zip")
    /**
    * The office ZIP
    */
    public String getBillingAddressZip() {
        return this.billingAddressZip;
    }

    public boolean hasBillingAddressZip() {
        return this.billingAddressZip != null;
    }

    /**
    * The office ZIP
    */
    public SetAccountInfoRequest setBillingAddressZip(String d) {
        this.billingAddressZip = d;
        return this;
    }

    private String billingAddressPhone;

    @RequestField(name="billing_address_phone")
    /**
    * The office phone number
    */
    public String getBillingAddressPhone() {
        return this.billingAddressPhone;
    }

    public boolean hasBillingAddressPhone() {
        return this.billingAddressPhone != null;
    }

    /**
    * The office phone number
    */
    public SetAccountInfoRequest setBillingAddressPhone(String d) {
        this.billingAddressPhone = d;
        return this;
    }

    private String accountCustomData;

    @RequestField(name="account_custom_data")
    /**
    * The custom data
    */
    public String getAccountCustomData() {
        return this.accountCustomData;
    }

    public boolean hasAccountCustomData() {
        return this.accountCustomData != null;
    }

    /**
    * The custom data
    */
    public SetAccountInfoRequest setAccountCustomData(String d) {
        this.accountCustomData = d;
        return this;
    }

    private String callbackUrl;

    @RequestField(name="callback_url")
    /**
    * If URL is specified, Voximplant cloud makes HTTP POST requests to it
    * when something happens. For a full list of reasons see the
    * <b>type</b> field of the [AccountCallback] structure. The HTTP
    * request has a JSON-encoded body that conforms to the
    * [AccountCallbacks] structure
    */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public boolean hasCallbackUrl() {
        return this.callbackUrl != null;
    }

    /**
    * If URL is specified, Voximplant cloud makes HTTP POST requests to it
    * when something happens. For a full list of reasons see the
    * <b>type</b> field of the [AccountCallback] structure. The HTTP
    * request has a JSON-encoded body that conforms to the
    * [AccountCallbacks] structure
    */
    public SetAccountInfoRequest setCallbackUrl(String d) {
        this.callbackUrl = d;
        return this;
    }

    private String callbackSalt;

    @RequestField(name="callback_salt")
    /**
    * If salt string is specified, each HTTP request made by the Voximplant
    * cloud toward the <b>callback_url</b> has a <b>salt</b> field set to
    * MD5 hash of account information and salt. That hash can be used be a
    * developer to ensure that HTTP request is made by the Voximplant cloud
    */
    public String getCallbackSalt() {
        return this.callbackSalt;
    }

    public boolean hasCallbackSalt() {
        return this.callbackSalt != null;
    }

    /**
    * If salt string is specified, each HTTP request made by the Voximplant
    * cloud toward the <b>callback_url</b> has a <b>salt</b> field set to
    * MD5 hash of account information and salt. That hash can be used be a
    * developer to ensure that HTTP request is made by the Voximplant cloud
    */
    public SetAccountInfoRequest setCallbackSalt(String d) {
        this.callbackSalt = d;
        return this;
    }

    private Boolean storeOutboundSms;

    @RequestField(name="store_outbound_sms")
    /**
    * Whether to store outgoing message texts. Default value is false
    */
    public Boolean getStoreOutboundSms() {
        return this.storeOutboundSms;
    }

    public boolean hasStoreOutboundSms() {
        return this.storeOutboundSms != null;
    }

    /**
    * Whether to store outgoing message texts. Default value is false
    */
    public SetAccountInfoRequest setStoreOutboundSms(boolean d) {
        this.storeOutboundSms = Boolean.valueOf(d);
        return this;
    }

    private Boolean storeInboundSms;

    @RequestField(name="store_inbound_sms")
    /**
    * Whether to store incoming message texts. Default value is false
    */
    public Boolean getStoreInboundSms() {
        return this.storeInboundSms;
    }

    public boolean hasStoreInboundSms() {
        return this.storeInboundSms != null;
    }

    /**
    * Whether to store incoming message texts. Default value is false
    */
    public SetAccountInfoRequest setStoreInboundSms(boolean d) {
        this.storeInboundSms = Boolean.valueOf(d);
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
        if (newAccountEmail != null) {
            sb.append(aligned)
                .append("\"newAccountEmail\": \"")
                .append(newAccountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newAccountPassword != null) {
            sb.append(aligned)
                .append("\"newAccountPassword\": \"")
                .append(newAccountPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (languageCode != null) {
            sb.append(aligned)
                .append("\"languageCode\": \"")
                .append(languageCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (location != null) {
            sb.append(aligned)
                .append("\"location\": \"")
                .append(location)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountFirstName != null) {
            sb.append(aligned)
                .append("\"accountFirstName\": \"")
                .append(accountFirstName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountLastName != null) {
            sb.append(aligned)
                .append("\"accountLastName\": \"")
                .append(accountLastName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mobilePhone != null) {
            sb.append(aligned)
                .append("\"mobilePhone\": \"")
                .append(mobilePhone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minBalanceToNotify != null) {
            sb.append(aligned)
                .append("\"minBalanceToNotify\": \"")
                .append(minBalanceToNotify)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountNotifications != null) {
            sb.append(aligned)
                .append("\"accountNotifications\": \"")
                .append(accountNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (tariffChangingNotifications != null) {
            sb.append(aligned)
                .append("\"tariffChangingNotifications\": \"")
                .append(tariffChangingNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newsNotifications != null) {
            sb.append(aligned)
                .append("\"newsNotifications\": \"")
                .append(newsNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sendJsError != null) {
            sb.append(aligned)
                .append("\"sendJsError\": \"")
                .append(sendJsError)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressName != null) {
            sb.append(aligned)
                .append("\"billingAddressName\": \"")
                .append(billingAddressName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressCountryCode != null) {
            sb.append(aligned)
                .append("\"billingAddressCountryCode\": \"")
                .append(billingAddressCountryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressAddress != null) {
            sb.append(aligned)
                .append("\"billingAddressAddress\": \"")
                .append(billingAddressAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressZip != null) {
            sb.append(aligned)
                .append("\"billingAddressZip\": \"")
                .append(billingAddressZip)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressPhone != null) {
            sb.append(aligned)
                .append("\"billingAddressPhone\": \"")
                .append(billingAddressPhone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountCustomData != null) {
            sb.append(aligned)
                .append("\"accountCustomData\": \"")
                .append(accountCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callbackUrl != null) {
            sb.append(aligned)
                .append("\"callbackUrl\": \"")
                .append(callbackUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callbackSalt != null) {
            sb.append(aligned)
                .append("\"callbackSalt\": \"")
                .append(callbackSalt)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (storeOutboundSms != null) {
            sb.append(aligned)
                .append("\"storeOutboundSms\": \"")
                .append(storeOutboundSms)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (storeInboundSms != null) {
            sb.append(aligned)
                .append("\"storeInboundSms\": \"")
                .append(storeInboundSms)
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
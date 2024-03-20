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

public class SetChildAccountInfoRequest implements Alignable {
    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by semicolons (;). Use the 'all'
    * value to select all child accounts
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by semicolons (;). Use the 'all'
    * value to select all child accounts
    */
    public SetChildAccountInfoRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private MultiArgument<String> childAccountName;

    @RequestField(name="child_account_name")
    /**
    * The child account name list separated by semicolons (;). Can be used
    * instead of <b>child_account_id</b>
    */
    public MultiArgument<String> getChildAccountName() {
        return this.childAccountName;
    }

    public boolean hasChildAccountName() {
        return this.childAccountName != null;
    }

    /**
    * The child account name list separated by semicolons (;). Can be used
    * instead of <b>child_account_id</b>
    */
    public SetChildAccountInfoRequest setChildAccountName(MultiArgument<String> d) {
        this.childAccountName = d;
        return this;
    }

    private MultiArgument<String> childAccountEmail;

    @RequestField(name="child_account_email")
    /**
    * The child account email list separated by semicolons (;). Can be used
    * instead of <b>child_account_id</b>
    */
    public MultiArgument<String> getChildAccountEmail() {
        return this.childAccountEmail;
    }

    public boolean hasChildAccountEmail() {
        return this.childAccountEmail != null;
    }

    /**
    * The child account email list separated by semicolons (;). Can be used
    * instead of <b>child_account_id</b>
    */
    public SetChildAccountInfoRequest setChildAccountEmail(MultiArgument<String> d) {
        this.childAccountEmail = d;
        return this;
    }

    private String newChildAccountEmail;

    @RequestField(name="new_child_account_email")
    /**
    * The new child account email
    */
    public String getNewChildAccountEmail() {
        return this.newChildAccountEmail;
    }

    public boolean hasNewChildAccountEmail() {
        return this.newChildAccountEmail != null;
    }

    /**
    * The new child account email
    */
    public SetChildAccountInfoRequest setNewChildAccountEmail(String d) {
        this.newChildAccountEmail = d;
        return this;
    }

    private String newChildAccountPassword;

    @RequestField(name="new_child_account_password")
    /**
    * The new child account password. Must be at least 8 characters long
    * and contain at least one uppercase and lowercase letter, one number,
    * and one special character
    */
    public String getNewChildAccountPassword() {
        return this.newChildAccountPassword;
    }

    public boolean hasNewChildAccountPassword() {
        return this.newChildAccountPassword != null;
    }

    /**
    * The new child account password. Must be at least 8 characters long
    * and contain at least one uppercase and lowercase letter, one number,
    * and one special character
    */
    public SetChildAccountInfoRequest setNewChildAccountPassword(String d) {
        this.newChildAccountPassword = d;
        return this;
    }

    private Boolean accountNotifications;

    @RequestField(name="account_notifications")
    /**
    * Voximplant notifications are required
    */
    public Boolean getAccountNotifications() {
        return this.accountNotifications;
    }

    public boolean hasAccountNotifications() {
        return this.accountNotifications != null;
    }

    /**
    * Voximplant notifications are required
    */
    public SetChildAccountInfoRequest setAccountNotifications(boolean d) {
        this.accountNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean tariffChangingNotifications;

    @RequestField(name="tariff_changing_notifications")
    /**
    * Set to true to receive the emails about the Voximplant plan changing
    */
    public Boolean getTariffChangingNotifications() {
        return this.tariffChangingNotifications;
    }

    public boolean hasTariffChangingNotifications() {
        return this.tariffChangingNotifications != null;
    }

    /**
    * Set to true to receive the emails about the Voximplant plan changing
    */
    public SetChildAccountInfoRequest setTariffChangingNotifications(boolean d) {
        this.tariffChangingNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean newsNotifications;

    @RequestField(name="news_notifications")
    /**
    * Set to true to receive the emails about the Voximplant news
    */
    public Boolean getNewsNotifications() {
        return this.newsNotifications;
    }

    public boolean hasNewsNotifications() {
        return this.newsNotifications != null;
    }

    /**
    * Set to true to receive the emails about the Voximplant news
    */
    public SetChildAccountInfoRequest setNewsNotifications(boolean d) {
        this.newsNotifications = Boolean.valueOf(d);
        return this;
    }

    private Boolean active;

    @RequestField(name="active")
    /**
    * Set false to disable the child account
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
    }

    /**
    * Set false to disable the child account
    */
    public SetChildAccountInfoRequest setActive(boolean d) {
        this.active = Boolean.valueOf(d);
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
    public SetChildAccountInfoRequest setLanguageCode(String d) {
        this.languageCode = d;
        return this;
    }

    private String location;

    @RequestField(name="location")
    /**
    * The child account location (timezone). Examples: America/Los_Angeles,
    * Etc/GMT-8, Etc/GMT+10
    */
    public String getLocation() {
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null;
    }

    /**
    * The child account location (timezone). Examples: America/Los_Angeles,
    * Etc/GMT-8, Etc/GMT+10
    */
    public SetChildAccountInfoRequest setLocation(String d) {
        this.location = d;
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
    public SetChildAccountInfoRequest setMinBalanceToNotify(BigDecimal d) {
        this.minBalanceToNotify = d;
        return this;
    }

    private Boolean supportRobokassa;

    @RequestField(name="support_robokassa")
    /**
    * Set to true to allow the robokassa payments
    */
    public Boolean getSupportRobokassa() {
        return this.supportRobokassa;
    }

    public boolean hasSupportRobokassa() {
        return this.supportRobokassa != null;
    }

    /**
    * Set to true to allow the robokassa payments
    */
    public SetChildAccountInfoRequest setSupportRobokassa(boolean d) {
        this.supportRobokassa = Boolean.valueOf(d);
        return this;
    }

    private Boolean supportBankCard;

    @RequestField(name="support_bank_card")
    /**
    * Set to true to allow the bank card payments
    */
    public Boolean getSupportBankCard() {
        return this.supportBankCard;
    }

    public boolean hasSupportBankCard() {
        return this.supportBankCard != null;
    }

    /**
    * Set to true to allow the bank card payments
    */
    public SetChildAccountInfoRequest setSupportBankCard(boolean d) {
        this.supportBankCard = Boolean.valueOf(d);
        return this;
    }

    private Boolean supportInvoice;

    @RequestField(name="support_invoice")
    /**
    * Set to true to allow the bank invoices
    */
    public Boolean getSupportInvoice() {
        return this.supportInvoice;
    }

    public boolean hasSupportInvoice() {
        return this.supportInvoice != null;
    }

    /**
    * Set to true to allow the bank invoices
    */
    public SetChildAccountInfoRequest setSupportInvoice(boolean d) {
        this.supportInvoice = Boolean.valueOf(d);
        return this;
    }

    private Boolean canUseRestricted;

    @RequestField(name="can_use_restricted")
    /**
    * Set to true to allow use restricted directions
    */
    public Boolean getCanUseRestricted() {
        return this.canUseRestricted;
    }

    public boolean hasCanUseRestricted() {
        return this.canUseRestricted != null;
    }

    /**
    * Set to true to allow use restricted directions
    */
    public SetChildAccountInfoRequest setCanUseRestricted(boolean d) {
        this.canUseRestricted = Boolean.valueOf(d);
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
        if (childAccountId != null) {
            sb.append(aligned)
                .append("\"childAccountId\": \"")
                .append(childAccountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childAccountName != null) {
            sb.append(aligned)
                .append("\"childAccountName\": \"")
                .append(childAccountName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childAccountEmail != null) {
            sb.append(aligned)
                .append("\"childAccountEmail\": \"")
                .append(childAccountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newChildAccountEmail != null) {
            sb.append(aligned)
                .append("\"newChildAccountEmail\": \"")
                .append(newChildAccountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newChildAccountPassword != null) {
            sb.append(aligned)
                .append("\"newChildAccountPassword\": \"")
                .append(newChildAccountPassword)
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
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
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
        if (minBalanceToNotify != null) {
            sb.append(aligned)
                .append("\"minBalanceToNotify\": \"")
                .append(minBalanceToNotify)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportRobokassa != null) {
            sb.append(aligned)
                .append("\"supportRobokassa\": \"")
                .append(supportRobokassa)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportBankCard != null) {
            sb.append(aligned)
                .append("\"supportBankCard\": \"")
                .append(supportBankCard)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportInvoice != null) {
            sb.append(aligned)
                .append("\"supportInvoice\": \"")
                .append(supportInvoice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (canUseRestricted != null) {
            sb.append(aligned)
                .append("\"canUseRestricted\": \"")
                .append(canUseRestricted)
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
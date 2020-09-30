package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The notification contact info.
*/
public class ContactInfoType {

    private Long contactId;

    /**
    * The contact ID.
    */
    public long getContactId() {
        return this.contactId.longValue();
    }

    public boolean hasContactId() {
        return this.contactId != null;
    }

    private String contactType;

    /**
    * The contact type. The following values are available: 'email'.
    */
    public String getContactType() {
        return this.contactType;
    }

    public boolean hasContactType() {
        return this.contactType != null;
    }

    private String contactData;

    /**
    * The contact data (i.g. email).
    */
    public String getContactData() {
        return this.contactData;
    }

    public boolean hasContactData() {
        return this.contactData != null;
    }

    private Boolean isPersistent;

    /**
    * The persistent flag.
    */
    public boolean getIsPersistent() {
        return this.isPersistent.booleanValue();
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    private String description;

    /**
    * The contact description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private Long nextVerificationAfterSec;

    /**
    * The verification code sending timeout is seconds.
    */
    public long getNextVerificationAfterSec() {
        return this.nextVerificationAfterSec.longValue();
    }

    public boolean hasNextVerificationAfterSec() {
        return this.nextVerificationAfterSec != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date verified;

    /**
    * The activation time in the UTC timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getVerified() {
        return this.verified;
    }

    public boolean hasVerified() {
        return this.verified != null;
    }

    private String[] notificationGroup;

    /**
    * The attached notification group list. The following groups are
    * available: 'news', 'tariff_changing', 'account', 'development'.
    */
    public String[] getNotificationGroup() {
        return this.notificationGroup;
    }

    public boolean hasNotificationGroup() {
        return this.notificationGroup != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The creation time in the UTC timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The contact editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

}
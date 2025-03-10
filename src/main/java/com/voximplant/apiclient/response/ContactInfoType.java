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
* The notification contact info.
*/
public class ContactInfoType implements Alignable {

    private Long contactId;

    /**
    * The contact ID
    */
    public Long getContactId() {
        return this.contactId;
    }

    public boolean hasContactId() {
        return this.contactId != null;
    }

    private String contactType;

    /**
    * The contact type. The following values are available: 'email'
    */
    public String getContactType() {
        return this.contactType;
    }

    public boolean hasContactType() {
        return this.contactType != null;
    }

    private String contactData;

    /**
    * The contact data (i.g. email)
    */
    public String getContactData() {
        return this.contactData;
    }

    public boolean hasContactData() {
        return this.contactData != null;
    }

    private Boolean isPersistent;

    /**
    * Whether the contact is persistent
    */
    public Boolean getIsPersistent() {
        return this.isPersistent;
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    private String description;

    /**
    * The contact description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private Long nextVerificationAfterSec;

    /**
    * The verification code sending timeout is seconds
    */
    public Long getNextVerificationAfterSec() {
        return this.nextVerificationAfterSec;
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
    * available: 'news', 'tariff_changing', 'account', 'development'
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (contactId != null) {
            sb.append(aligned)
                .append("\"contactId\": \"")
                .append(contactId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (contactType != null) {
            sb.append(aligned)
                .append("\"contactType\": \"")
                .append(contactType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (contactData != null) {
            sb.append(aligned)
                .append("\"contactData\": \"")
                .append(contactData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isPersistent != null) {
            sb.append(aligned)
                .append("\"isPersistent\": \"")
                .append(isPersistent)
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
        if (nextVerificationAfterSec != null) {
            sb.append(aligned)
                .append("\"nextVerificationAfterSec\": \"")
                .append(nextVerificationAfterSec)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verified != null) {
            sb.append(aligned)
                .append("\"verified\": \"")
                .append(verified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (notificationGroup != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(notificationGroup, alignment + 1))
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
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
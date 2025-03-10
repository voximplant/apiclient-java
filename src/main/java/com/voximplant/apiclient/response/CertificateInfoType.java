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
* The [ExpiredCertificateCallback] and [ExpiringCertificateCallback]
* callbacks details.
*/
public class CertificateInfoType implements Alignable {

    private Long pushCredentialId;

    /**
    * The push credential id
    */
    public Long getPushCredentialId() {
        return this.pushCredentialId;
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    private String certFileName;

    /**
    * The push certificate file name
    */
    public String getCertFileName() {
        return this.certFileName;
    }

    public boolean hasCertFileName() {
        return this.certFileName != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date expirationDate;

    /**
    * The push certificate expiration date in YYYY-MM-DD format
    */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
    }

    private String[] applications;

    /**
    * Array of application names
    */
    public String[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
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
        if (pushCredentialId != null) {
            sb.append(aligned)
                .append("\"pushCredentialId\": \"")
                .append(pushCredentialId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (certFileName != null) {
            sb.append(aligned)
                .append("\"certFileName\": \"")
                .append(certFileName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expirationDate != null) {
            sb.append(aligned)
                .append("\"expirationDate\": \"")
                .append(expirationDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applications != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(applications, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
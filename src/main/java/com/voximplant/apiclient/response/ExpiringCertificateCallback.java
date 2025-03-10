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
* Received for the accounts whose Apple VOIP certificates expire in 14
* or fewer days. Received as part of the [AccountCallback] structure.
*/
public class ExpiringCertificateCallback implements Alignable {

    private CertificateInfoType[] certificates;

    /**
    * The expiring certificates info
    */
    public CertificateInfoType[] getCertificates() {
        return this.certificates;
    }

    public boolean hasCertificates() {
        return this.certificates != null;
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
        if (certificates != null) {
            sb.append(aligned)
                .append("\"CertificateInfoType\": ")
                .append(StringHelper.arrayToString(certificates, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
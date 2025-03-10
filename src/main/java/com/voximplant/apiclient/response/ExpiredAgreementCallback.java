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
* Received for the accounts for which the confirmation documents
* waiting period has already expired or expires today. Received as part
* of the [AccountCallback] structure.
*/
public class ExpiredAgreementCallback implements Alignable {

    private Long[] documentIds;

    /**
    * The list of the expired agreements IDs
    */
    public Long[] getDocumentIds() {
        return this.documentIds;
    }

    public boolean hasDocumentIds() {
        return this.documentIds != null;
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
        if (documentIds != null) {
            sb.append(aligned)
                .append("\"number\": ")
                .append(StringHelper.arrayToString(documentIds, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
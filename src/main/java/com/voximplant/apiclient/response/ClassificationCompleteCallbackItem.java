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
* The specific account callback details.
*/
public class ClassificationCompleteCallbackItem implements Alignable {

    private Long recordId;

    /**
    * The record ID.
    */
    public Long getRecordId() {
        return this.recordId;
    }

    public boolean hasRecordId() {
        return this.recordId != null;
    }

    private ClassificationUnit[] classificationInfo;

    /**
    * Array with the classification results.
    */
    public ClassificationUnit[] getClassificationInfo() {
        return this.classificationInfo;
    }

    public boolean hasClassificationInfo() {
        return this.classificationInfo != null;
    }

    private BigDecimal classificationCost;

    /**
    * The cost of classification.
    */
    public BigDecimal getClassificationCost() {
        return this.classificationCost;
    }

    public boolean hasClassificationCost() {
        return this.classificationCost != null;
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
        if (recordId != null) {
            sb.append(aligned)
                .append("\"recordId\": \"")
                .append(recordId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (classificationInfo != null) {
            sb.append(aligned)
                .append("\"ClassificationUnit\": ")
                .append(StringHelper.arrayToString(classificationInfo, alignment + 1))
                .append(System.lineSeparator());
        }
        if (classificationCost != null) {
            sb.append(aligned)
                .append("\"classificationCost\": \"")
                .append(classificationCost)
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
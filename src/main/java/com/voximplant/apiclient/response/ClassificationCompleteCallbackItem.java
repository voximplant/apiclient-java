package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details.
*/
public class ClassificationCompleteCallbackItem {

    private Long recordId;

    /**
    * The record ID.
    */
    public long getRecordId() {
        return this.recordId.longValue();
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

}
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

public class GetAvailableRegulationsResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Boolean result;

    /**
    * If result equals 1: 1) the user has at least one regulation address
    * which is appropriate for verification or 2) the verification is not
    * required. If result equals 0, the regulations address needs to be
    * created
    */
    public Boolean getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private RegulationAddress[] availableAddress;

    /**
    * The available RegulationAddress records
    */
    public RegulationAddress[] getAvailableAddress() {
        return this.availableAddress;
    }

    public boolean hasAvailableAddress() {
        return this.availableAddress != null;
    }

    private Long countInProgress;

    /**
    * The count of RegulationAddress in progress status
    */
    public Long getCountInProgress() {
        return this.countInProgress;
    }

    public boolean hasCountInProgress() {
        return this.countInProgress != null;
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
        if (result != null) {
            sb.append(aligned)
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (availableAddress != null) {
            sb.append(aligned)
                .append("\"RegulationAddress\": ")
                .append(StringHelper.arrayToString(availableAddress, alignment + 1))
                .append(System.lineSeparator());
        }
        if (countInProgress != null) {
            sb.append(aligned)
                .append("\"countInProgress\": \"")
                .append(countInProgress)
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
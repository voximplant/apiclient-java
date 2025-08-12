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
* Person or company who takes the verification.
*/
public class AccountVerificationsTypeCredentials implements Alignable {

    private Object individual;

    /**
    * Details of a person who takes the verification
    */
    public Object getIndividual() {
        return this.individual;
    }

    public boolean hasIndividual() {
        return this.individual != null;
    }

    private Object legalEntity;

    /**
    * Company details for a legal entity
    */
    public Object getLegalEntity() {
        return this.legalEntity;
    }

    public boolean hasLegalEntity() {
        return this.legalEntity != null;
    }

    private Object entrepreneur;

    /**
    * Company details for a individual entrepreneur
    */
    public Object getEntrepreneur() {
        return this.entrepreneur;
    }

    public boolean hasEntrepreneur() {
        return this.entrepreneur != null;
    }

    private String legalStatus;

    /**
    * Subscriber type. Possible values are: INDIVIDUAL, LEGAL_ENTITY,
    * ENTREPRENEUR
    */
    public String getLegalStatus() {
        return this.legalStatus;
    }

    public boolean hasLegalStatus() {
        return this.legalStatus != null;
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
        if (individual != null) {
            sb.append(aligned)
                .append("\"individual\": \"")
                .append(individual)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (legalEntity != null) {
            sb.append(aligned)
                .append("\"legalEntity\": \"")
                .append(legalEntity)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (entrepreneur != null) {
            sb.append(aligned)
                .append("\"entrepreneur\": \"")
                .append(entrepreneur)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (legalStatus != null) {
            sb.append(aligned)
                .append("\"legalStatus\": \"")
                .append(legalStatus)
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
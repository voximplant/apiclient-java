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
* The [GetActiveMGP] function result.
*/
public class MGPInfo implements Alignable {

    private Long mgpId;

    /**
    * The MGP ID
    */
    public Long getMgpId() {
        return this.mgpId;
    }

    public boolean hasMgpId() {
        return this.mgpId != null;
    }

    private Long mgpTemplateId;

    /**
    * The MGP template ID
    */
    public Long getMgpTemplateId() {
        return this.mgpTemplateId;
    }

    public boolean hasMgpTemplateId() {
        return this.mgpTemplateId != null;
    }

    private Long mgpTemplatePrice;

    /**
    * The MGP template price
    */
    public Long getMgpTemplatePrice() {
        return this.mgpTemplatePrice;
    }

    public boolean hasMgpTemplatePrice() {
        return this.mgpTemplatePrice != null;
    }

    private String mgpTemplateCurrency;

    /**
    * The MGP template currency
    */
    public String getMgpTemplateCurrency() {
        return this.mgpTemplateCurrency;
    }

    public boolean hasMgpTemplateCurrency() {
        return this.mgpTemplateCurrency != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date mgpActivated;

    /**
    * The MGP activation date
    */
    public Date getMgpActivated() {
        return this.mgpActivated;
    }

    public boolean hasMgpActivated() {
        return this.mgpActivated != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date mgpDeactivated;

    /**
    * The MGP deactivation date
    */
    public Date getMgpDeactivated() {
        return this.mgpDeactivated;
    }

    public boolean hasMgpDeactivated() {
        return this.mgpDeactivated != null;
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
        if (mgpId != null) {
            sb.append(aligned)
                .append("\"mgpId\": \"")
                .append(mgpId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mgpTemplateId != null) {
            sb.append(aligned)
                .append("\"mgpTemplateId\": \"")
                .append(mgpTemplateId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mgpTemplatePrice != null) {
            sb.append(aligned)
                .append("\"mgpTemplatePrice\": \"")
                .append(mgpTemplatePrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mgpTemplateCurrency != null) {
            sb.append(aligned)
                .append("\"mgpTemplateCurrency\": \"")
                .append(mgpTemplateCurrency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mgpActivated != null) {
            sb.append(aligned)
                .append("\"mgpActivated\": \"")
                .append(mgpActivated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mgpDeactivated != null) {
            sb.append(aligned)
                .append("\"mgpDeactivated\": \"")
                .append(mgpDeactivated)
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
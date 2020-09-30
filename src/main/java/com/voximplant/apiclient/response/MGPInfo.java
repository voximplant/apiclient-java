package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetActiveMGP] function result.
*/
public class MGPInfo {

    private Long mgpId;

    /**
    * The MGP ID.
    */
    public long getMgpId() {
        return this.mgpId.longValue();
    }

    public boolean hasMgpId() {
        return this.mgpId != null;
    }

    private Long mgpTemplateId;

    /**
    * The MGP template ID.
    */
    public long getMgpTemplateId() {
        return this.mgpTemplateId.longValue();
    }

    public boolean hasMgpTemplateId() {
        return this.mgpTemplateId != null;
    }

    private Long mgpTemplatePrice;

    /**
    * The MGP template price.
    */
    public long getMgpTemplatePrice() {
        return this.mgpTemplatePrice.longValue();
    }

    public boolean hasMgpTemplatePrice() {
        return this.mgpTemplatePrice != null;
    }

    private String mgpTemplateCurrency;

    /**
    * The MGP template currency.
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
    * The MGP activation date.
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
    * The MGP deactivation date.
    */
    public Date getMgpDeactivated() {
        return this.mgpDeactivated;
    }

    public boolean hasMgpDeactivated() {
        return this.mgpDeactivated != null;
    }

}
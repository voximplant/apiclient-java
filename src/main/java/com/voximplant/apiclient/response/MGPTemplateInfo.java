package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetMGPTemplateList] function result.
*/
public class MGPTemplateInfo {

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

    private String mgpTemplateName;

    /**
    * The MGP template name.
    */
    public String getMgpTemplateName() {
        return this.mgpTemplateName;
    }

    public boolean hasMgpTemplateName() {
        return this.mgpTemplateName != null;
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

}
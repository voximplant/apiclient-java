package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class ReorderRulesRequest {
    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID list separated by the ';' symbol.
    */
    public ReorderRulesRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

}
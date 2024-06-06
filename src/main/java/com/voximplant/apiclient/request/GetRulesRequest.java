package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetRulesRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID
    */
    public GetRulesRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public GetRulesRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID to filter
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID to filter
    */
    public GetRulesRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name part to filter
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name part to filter
    */
    public GetRulesRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Boolean videoConference;

    @RequestField(name="video_conference")
    /**
    * Whether it is a video conference to filter
    */
    public Boolean getVideoConference() {
        return this.videoConference;
    }

    public boolean hasVideoConference() {
        return this.videoConference != null;
    }

    /**
    * Whether it is a video conference to filter
    */
    public GetRulesRequest setVideoConference(boolean d) {
        this.videoConference = Boolean.valueOf(d);
        return this;
    }

    private String attachedKeyId;

    @RequestField(name="attached_key_id")
    /**
    * The service account ID bound to the rule. Read more in the
    * [guide](/docs/guides/voxengine/management-api)
    */
    public String getAttachedKeyId() {
        return this.attachedKeyId;
    }

    public boolean hasAttachedKeyId() {
        return this.attachedKeyId != null;
    }

    /**
    * The service account ID bound to the rule. Read more in the
    * [guide](/docs/guides/voxengine/management-api)
    */
    public GetRulesRequest setAttachedKeyId(String d) {
        this.attachedKeyId = d;
        return this;
    }

    private String template;

    @RequestField(name="template")
    /**
    * Search for template matching
    */
    public String getTemplate() {
        return this.template;
    }

    public boolean hasTemplate() {
        return this.template != null;
    }

    /**
    * Search for template matching
    */
    public GetRulesRequest setTemplate(String d) {
        this.template = d;
        return this;
    }

    private Boolean withScenarios;

    @RequestField(name="with_scenarios")
    /**
    * Whether to get bound scenarios info
    */
    public Boolean getWithScenarios() {
        return this.withScenarios;
    }

    public boolean hasWithScenarios() {
        return this.withScenarios != null;
    }

    /**
    * Whether to get bound scenarios info
    */
    public GetRulesRequest setWithScenarios(boolean d) {
        this.withScenarios = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetRulesRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetRulesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (videoConference != null) {
            sb.append(aligned)
                .append("\"videoConference\": \"")
                .append(videoConference)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (attachedKeyId != null) {
            sb.append(aligned)
                .append("\"attachedKeyId\": \"")
                .append(attachedKeyId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (template != null) {
            sb.append(aligned)
                .append("\"template\": \"")
                .append(template)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withScenarios != null) {
            sb.append(aligned)
                .append("\"withScenarios\": \"")
                .append(withScenarios)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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
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

public class BindSkillRequest {
    private MultiArgument<Long> skillId;

    @RequestField(name="skill_id")
    /**
    * The skill ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getSkillId() {
        return this.skillId;
    }

    public boolean hasSkillId() {
        return this.skillId != null;
    }

    /**
    * The skill ID list separated by the ';' symbol or the 'all' value.
    */
    public BindSkillRequest setSkillId(MultiArgument<Long> d) {
        this.skillId = d;
        return this;
    }

    private MultiArgument<String> skillName;

    @RequestField(name="skill_name")
    /**
    * The skill name list separated by the ';' symbol. Can be used instead
    * of <b>skill_id</b>.
    */
    public MultiArgument<String> getSkillName() {
        return this.skillName;
    }

    public boolean hasSkillName() {
        return this.skillName != null;
    }

    /**
    * The skill name list separated by the ';' symbol. Can be used instead
    * of <b>skill_id</b>.
    */
    public BindSkillRequest setSkillName(MultiArgument<String> d) {
        this.skillName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol or the 'all' value.
    */
    public BindSkillRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by the ';' symbol. <b>user_name</b> can
    * be used instead of <b>user_id</b>.
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by the ';' symbol. <b>user_name</b> can
    * be used instead of <b>user_id</b>.
    */
    public BindSkillRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list separated by the ';' symbol or the 'all' value.
    */
    public BindSkillRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

    private MultiArgument<String> acdQueueName;

    @RequestField(name="acd_queue_name")
    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    * The ACD queue name list separated by the ';' symbol.
    */
    public MultiArgument<String> getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    * The ACD queue name list separated by the ';' symbol.
    */
    public BindSkillRequest setAcdQueueName(MultiArgument<String> d) {
        this.acdQueueName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified.
    */
    public BindSkillRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public BindSkillRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Bind or unbind?
    */
    public boolean getBind() {
        return this.bind.booleanValue();
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Bind or unbind?
    */
    public BindSkillRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}
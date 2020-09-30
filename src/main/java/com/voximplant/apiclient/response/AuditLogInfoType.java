package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAuditLog] function result item.
*/
public class AuditLogInfoType {

    private Long auditLogId;

    /**
    * The  ID.
    */
    public long getAuditLogId() {
        return this.auditLogId.longValue();
    }

    public boolean hasAuditLogId() {
        return this.auditLogId != null;
    }

    private Long accountId;

    /**
    * The account ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date requested;

    /**
    * The action time in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getRequested() {
        return this.requested;
    }

    public boolean hasRequested() {
        return this.requested != null;
    }

    private String ip;

    /**
    * The initiator IP address.
    */
    public String getIp() {
        return this.ip;
    }

    public boolean hasIp() {
        return this.ip != null;
    }

    private String cmdName;

    /**
    * The called function.
    */
    public String getCmdName() {
        return this.cmdName;
    }

    public boolean hasCmdName() {
        return this.cmdName != null;
    }

    private Map<String, Object> cmdArgs;

    /**
    * The arguments of the called function (they may be masked or resolved).
    */
    public Map<String, Object> getCmdArgs() {
        return this.cmdArgs;
    }

    public boolean hasCmdArgs() {
        return this.cmdArgs != null;
    }

    private Map<String, Object> cmdResult;

    /**
    * The modified values.
    */
    public Map<String, Object> getCmdResult() {
        return this.cmdResult;
    }

    public boolean hasCmdResult() {
        return this.cmdResult != null;
    }

}
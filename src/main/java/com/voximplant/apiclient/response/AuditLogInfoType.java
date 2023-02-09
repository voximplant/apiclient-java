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
* The [GetAuditLog] function result item.
*/
public class AuditLogInfoType implements Alignable {

    private Long auditLogId;

    /**
    * The  ID
    */
    public Long getAuditLogId() {
        return this.auditLogId;
    }

    public boolean hasAuditLogId() {
        return this.auditLogId != null;
    }

    private Long accountId;

    /**
    * The account ID
    */
    public Long getAccountId() {
        return this.accountId;
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
    * The initiator IP address
    */
    public String getIp() {
        return this.ip;
    }

    public boolean hasIp() {
        return this.ip != null;
    }

    private String cmdName;

    /**
    * The called function
    */
    public String getCmdName() {
        return this.cmdName;
    }

    public boolean hasCmdName() {
        return this.cmdName != null;
    }

    private Map<String, Object> cmdArgs;

    /**
    * The arguments of the called function (they may be masked or resolved)
    */
    public Map<String, Object> getCmdArgs() {
        return this.cmdArgs;
    }

    public boolean hasCmdArgs() {
        return this.cmdArgs != null;
    }

    private Map<String, Object> cmdResult;

    /**
    * The modified values
    */
    public Map<String, Object> getCmdResult() {
        return this.cmdResult;
    }

    public boolean hasCmdResult() {
        return this.cmdResult != null;
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
        if (auditLogId != null) {
            sb.append(aligned)
                .append("\"auditLogId\": \"")
                .append(auditLogId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (requested != null) {
            sb.append(aligned)
                .append("\"requested\": \"")
                .append(requested)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ip != null) {
            sb.append(aligned)
                .append("\"ip\": \"")
                .append(ip)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cmdName != null) {
            sb.append(aligned)
                .append("\"cmdName\": \"")
                .append(cmdName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cmdArgs != null) {
            sb.append(aligned)
                .append("\"cmdArgs\": \"")
                .append(cmdArgs)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cmdResult != null) {
            sb.append(aligned)
                .append("\"cmdResult\": \"")
                .append(cmdResult)
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
package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class CreateCallListRequest implements Alignable {
    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID. It is specified in the <a
    * href='//manage.voximplant.com/applications'>Applications</a> section
    * of the Control Panel
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID. It is specified in the <a
    * href='//manage.voximplant.com/applications'>Applications</a> section
    * of the Control Panel
    */
    public CreateCallListRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private Long priority;

    @RequestField(name="priority")
    /**
    * Call list priority. The value is in the range of [0 ... 2^31] where
    * zero is the highest priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    /**
    * Call list priority. The value is in the range of [0 ... 2^31] where
    * zero is the highest priority
    */
    public CreateCallListRequest setPriority(long d) {
        this.priority = Long.valueOf(d);
        return this;
    }

    private Long maxSimultaneous;

    @RequestField(name="max_simultaneous")
    /**
    * Number of simultaneously processed tasks
    */
    public Long getMaxSimultaneous() {
        return this.maxSimultaneous;
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    /**
    * Number of simultaneously processed tasks
    */
    public CreateCallListRequest setMaxSimultaneous(long d) {
        this.maxSimultaneous = Long.valueOf(d);
        return this;
    }

    private Long numAttempts;

    @RequestField(name="num_attempts")
    /**
    * Number of attempts. Minimum is <b>1</b>, maximum is <b>5</b>
    */
    public Long getNumAttempts() {
        return this.numAttempts;
    }

    public boolean hasNumAttempts() {
        return this.numAttempts != null;
    }

    /**
    * Number of attempts. Minimum is <b>1</b>, maximum is <b>5</b>
    */
    public CreateCallListRequest setNumAttempts(long d) {
        this.numAttempts = Long.valueOf(d);
        return this;
    }

    private String name;

    @RequestField(name="name")
    /**
    * File name, up to 255 characters and cannot contain the '/' and '\'
    * symbols
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    /**
    * File name, up to 255 characters and cannot contain the '/' and '\'
    * symbols
    */
    public CreateCallListRequest setName(String d) {
        this.name = d;
        return this;
    }

    private InputStream fileContent;

    @RequestField(name="file_content")
    /**
    * Send as "body" part of the HTTP request or as multiform. The sending
    * "file_content" via URL is at its own risk because the network devices
    * tend to drop HTTP requests with large headers
    */
    public InputStream getFileContent() {
        return this.fileContent;
    }

    public boolean hasFileContent() {
        return this.fileContent != null;
    }

    /**
    * Send as "body" part of the HTTP request or as multiform. The sending
    * "file_content" via URL is at its own risk because the network devices
    * tend to drop HTTP requests with large headers
    */
    public CreateCallListRequest setFileContent(InputStream d) {
        this.fileContent = d;
        return this;
    }

    private Long intervalSeconds;

    @RequestField(name="interval_seconds")
    /**
    * Interval between call attempts in seconds. The default is 0
    */
    public Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    /**
    * Interval between call attempts in seconds. The default is 0
    */
    public CreateCallListRequest setIntervalSeconds(long d) {
        this.intervalSeconds = Long.valueOf(d);
        return this;
    }

    private String encoding;

    @RequestField(name="encoding")
    /**
    * Encoding file. The default is UTF-8
    */
    public String getEncoding() {
        return this.encoding;
    }

    public boolean hasEncoding() {
        return this.encoding != null;
    }

    /**
    * Encoding file. The default is UTF-8
    */
    public CreateCallListRequest setEncoding(String d) {
        this.encoding = d;
        return this;
    }

    private String delimiter;

    @RequestField(name="delimiter")
    /**
    * Separator values. The default is ';'
    */
    public String getDelimiter() {
        return this.delimiter;
    }

    public boolean hasDelimiter() {
        return this.delimiter != null;
    }

    /**
    * Separator values. The default is ';'
    */
    public CreateCallListRequest setDelimiter(String d) {
        this.delimiter = d;
        return this;
    }

    private String escape;

    @RequestField(name="escape")
    /**
    * Escape character for parsing csv
    */
    public String getEscape() {
        return this.escape;
    }

    public boolean hasEscape() {
        return this.escape != null;
    }

    /**
    * Escape character for parsing csv
    */
    public CreateCallListRequest setEscape(String d) {
        this.escape = d;
        return this;
    }

    private String referenceIp;

    @RequestField(name="reference_ip")
    /**
    * Specifies the IP from the geolocation of the call list subscribers.
    * It allows selecting the nearest server for serving subscribers
    */
    public String getReferenceIp() {
        return this.referenceIp;
    }

    public boolean hasReferenceIp() {
        return this.referenceIp != null;
    }

    /**
    * Specifies the IP from the geolocation of the call list subscribers.
    * It allows selecting the nearest server for serving subscribers
    */
    public CreateCallListRequest setReferenceIp(String d) {
        this.referenceIp = d;
        return this;
    }

    private String serverLocation;

    @RequestField(name="server_location")
    /**
    * Specifies the location of the server where the scenario needs to be
    * executed. Has higher priority than `reference_ip`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public String getServerLocation() {
        return this.serverLocation;
    }

    public boolean hasServerLocation() {
        return this.serverLocation != null;
    }

    /**
    * Specifies the location of the server where the scenario needs to be
    * executed. Has higher priority than `reference_ip`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public CreateCallListRequest setServerLocation(String d) {
        this.serverLocation = d;
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
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxSimultaneous != null) {
            sb.append(aligned)
                .append("\"maxSimultaneous\": \"")
                .append(maxSimultaneous)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (numAttempts != null) {
            sb.append(aligned)
                .append("\"numAttempts\": \"")
                .append(numAttempts)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (name != null) {
            sb.append(aligned)
                .append("\"name\": \"")
                .append(name)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fileContent != null) {
        }
        if (intervalSeconds != null) {
            sb.append(aligned)
                .append("\"intervalSeconds\": \"")
                .append(intervalSeconds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (encoding != null) {
            sb.append(aligned)
                .append("\"encoding\": \"")
                .append(encoding)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (delimiter != null) {
            sb.append(aligned)
                .append("\"delimiter\": \"")
                .append(delimiter)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (escape != null) {
            sb.append(aligned)
                .append("\"escape\": \"")
                .append(escape)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (referenceIp != null) {
            sb.append(aligned)
                .append("\"referenceIp\": \"")
                .append(referenceIp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serverLocation != null) {
            sb.append(aligned)
                .append("\"serverLocation\": \"")
                .append(serverLocation)
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
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

public class EditCallListRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * Call list ID. If the ID is non existing, the 251 error returns
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list ID. If the ID is non existing, the 251 error returns
    */
    public EditCallListRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private Long intervalSeconds;

    @RequestField(name="interval_seconds")
    /**
    * Minimum interval between call attempts. Cannot be a negative value
    */
    public Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    /**
    * Minimum interval between call attempts. Cannot be a negative value
    */
    public EditCallListRequest setIntervalSeconds(long d) {
        this.intervalSeconds = Long.valueOf(d);
        return this;
    }

    private Long numAttempts;

    @RequestField(name="num_attempts")
    /**
    * Maximum call attempt number. Cannot be less than 1
    */
    public Long getNumAttempts() {
        return this.numAttempts;
    }

    public boolean hasNumAttempts() {
        return this.numAttempts != null;
    }

    /**
    * Maximum call attempt number. Cannot be less than 1
    */
    public EditCallListRequest setNumAttempts(long d) {
        this.numAttempts = Long.valueOf(d);
        return this;
    }

    private Long maxSimultaneous;

    @RequestField(name="max_simultaneous")
    /**
    * Maximum simultaneous call attempts for this call list. Cannot be less
    * than 1
    */
    public Long getMaxSimultaneous() {
        return this.maxSimultaneous;
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    /**
    * Maximum simultaneous call attempts for this call list. Cannot be less
    * than 1
    */
    public EditCallListRequest setMaxSimultaneous(long d) {
        this.maxSimultaneous = Long.valueOf(d);
        return this;
    }

    private String ipAddress;

    @RequestField(name="ip_address")
    /**
    * IP address in the `Inet4Address` format
    */
    public String getIpAddress() {
        return this.ipAddress;
    }

    public boolean hasIpAddress() {
        return this.ipAddress != null;
    }

    /**
    * IP address in the `Inet4Address` format
    */
    public EditCallListRequest setIpAddress(String d) {
        this.ipAddress = d;
        return this;
    }

    private String name;

    @RequestField(name="name")
    /**
    * Call list name. Cannot be bigger than 255 characters, cannot contain
    * slash symbol
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    /**
    * Call list name. Cannot be bigger than 255 characters, cannot contain
    * slash symbol
    */
    public EditCallListRequest setName(String d) {
        this.name = d;
        return this;
    }

    private Long priority;

    @RequestField(name="priority")
    /**
    * Call list's priority among other call list. The lower the value, the
    * higher is the call list's priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    /**
    * Call list's priority among other call list. The lower the value, the
    * higher is the call list's priority
    */
    public EditCallListRequest setPriority(long d) {
        this.priority = Long.valueOf(d);
        return this;
    }

    private String startAt;

    @RequestField(name="start_at")
    /**
    * Time when the call list should start in the `yyyy-MM-dd HH:mm:ss`
    * format
    */
    public String getStartAt() {
        return this.startAt;
    }

    public boolean hasStartAt() {
        return this.startAt != null;
    }

    /**
    * Time when the call list should start in the `yyyy-MM-dd HH:mm:ss`
    * format
    */
    public EditCallListRequest setStartAt(String d) {
        this.startAt = d;
        return this;
    }

    private String serverLocation;

    @RequestField(name="server_location")
    /**
    * Location of the server processing the call list. If the ID is non
    * existing, the 496 error returns: The 'server_location' parameter is
    * invalid.
    */
    public String getServerLocation() {
        return this.serverLocation;
    }

    public boolean hasServerLocation() {
        return this.serverLocation != null;
    }

    /**
    * Location of the server processing the call list. If the ID is non
    * existing, the 496 error returns: The 'server_location' parameter is
    * invalid.
    */
    public EditCallListRequest setServerLocation(String d) {
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
        if (listId != null) {
            sb.append(aligned)
                .append("\"listId\": \"")
                .append(listId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (intervalSeconds != null) {
            sb.append(aligned)
                .append("\"intervalSeconds\": \"")
                .append(intervalSeconds)
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
        if (maxSimultaneous != null) {
            sb.append(aligned)
                .append("\"maxSimultaneous\": \"")
                .append(maxSimultaneous)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ipAddress != null) {
            sb.append(aligned)
                .append("\"ipAddress\": \"")
                .append(ipAddress)
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
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (startAt != null) {
            sb.append(aligned)
                .append("\"startAt\": \"")
                .append(startAt)
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
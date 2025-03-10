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

public class AddSipWhiteListItemRequest implements Alignable {
    private String sipWhitelistNetwork;

    @RequestField(name="sip_whitelist_network")
    /**
    * The network address in format A.B.C.D/L or A.B.C.D/a.b.c.d (example
    * 192.168.1.5/16)
    */
    public String getSipWhitelistNetwork() {
        return this.sipWhitelistNetwork;
    }

    public boolean hasSipWhitelistNetwork() {
        return this.sipWhitelistNetwork != null;
    }

    /**
    * The network address in format A.B.C.D/L or A.B.C.D/a.b.c.d (example
    * 192.168.1.5/16)
    */
    public AddSipWhiteListItemRequest setSipWhitelistNetwork(String d) {
        this.sipWhitelistNetwork = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The network address description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The network address description
    */
    public AddSipWhiteListItemRequest setDescription(String d) {
        this.description = d;
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
        if (sipWhitelistNetwork != null) {
            sb.append(aligned)
                .append("\"sipWhitelistNetwork\": \"")
                .append(sipWhitelistNetwork)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
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
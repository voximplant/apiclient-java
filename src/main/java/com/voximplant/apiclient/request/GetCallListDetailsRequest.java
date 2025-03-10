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

public class GetCallListDetailsRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * The list ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list ID
    */
    public GetCallListDetailsRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum number of entries in the result
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum number of entries in the result
    */
    public GetCallListDetailsRequest setCount(long d) {
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
    public GetCallListDetailsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: **json**, **csv**,
    * **xls**. The default value is **csv**
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: **json**, **csv**,
    * **xls**. The default value is **csv**
    */
    public GetCallListDetailsRequest setOutput(String d) {
        this.output = d;
        return this;
    }

    private String encoding;

    @RequestField(name="encoding")
    /**
    * Encoding of the output file. Default UTF-8
    */
    public String getEncoding() {
        return this.encoding;
    }

    public boolean hasEncoding() {
        return this.encoding != null;
    }

    /**
    * Encoding of the output file. Default UTF-8
    */
    public GetCallListDetailsRequest setEncoding(String d) {
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
    public GetCallListDetailsRequest setDelimiter(String d) {
        this.delimiter = d;
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
        if (output != null) {
            sb.append(aligned)
                .append("\"output\": \"")
                .append(output)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}
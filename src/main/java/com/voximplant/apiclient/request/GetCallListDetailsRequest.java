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

public class GetCallListDetailsRequest {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * The list ID.
    */
    public long getListId() {
        return this.listId.longValue();
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list ID.
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
    public long getCount() {
        return this.count.longValue();
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
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetCallListDetailsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * Output format (CSV/JSON/XLS). Default CSV
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * Output format (CSV/JSON/XLS). Default CSV
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

}
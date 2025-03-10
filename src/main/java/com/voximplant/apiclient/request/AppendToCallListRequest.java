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

public class AppendToCallListRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * The call list ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The call list ID
    */
    public AppendToCallListRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private String listName;

    @RequestField(name="list_name")
    /**
    * The unique name of the call list. Can be used instead of
    * <b>list_id</b>
    */
    public String getListName() {
        return this.listName;
    }

    public boolean hasListName() {
        return this.listName != null;
    }

    /**
    * The unique name of the call list. Can be used instead of
    * <b>list_id</b>
    */
    public AppendToCallListRequest setListName(String d) {
        this.listName = d;
        return this;
    }

    private InputStream fileContent;

    @RequestField(name="file_content")
    /**
    * Send as request body or multiform
    */
    public InputStream getFileContent() {
        return this.fileContent;
    }

    public boolean hasFileContent() {
        return this.fileContent != null;
    }

    /**
    * Send as request body or multiform
    */
    public AppendToCallListRequest setFileContent(InputStream d) {
        this.fileContent = d;
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
    public AppendToCallListRequest setEncoding(String d) {
        this.encoding = d;
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
    public AppendToCallListRequest setEscape(String d) {
        this.escape = d;
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
    public AppendToCallListRequest setDelimiter(String d) {
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
        if (listName != null) {
            sb.append(aligned)
                .append("\"listName\": \"")
                .append(listName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fileContent != null) {
        }
        if (encoding != null) {
            sb.append(aligned)
                .append("\"encoding\": \"")
                .append(encoding)
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
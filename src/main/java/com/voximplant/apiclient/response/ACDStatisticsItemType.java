package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* Individual statistics item in the [ACDOperatorStatisticsType],
* [ACDQueueStatisticsType], and [ACDOperatorStatusStatisticsDetail]
* records.
*/
public class ACDStatisticsItemType implements Alignable {

    private Long min;

    /**
    * Minimum value over the aggregated interval, in seconds
    */
    public Long getMin() {
        return this.min;
    }

    public boolean hasMin() {
        return this.min != null;
    }

    private Long avg;

    /**
    * Average value over the aggregated interval, in seconds
    */
    public Long getAvg() {
        return this.avg;
    }

    public boolean hasAvg() {
        return this.avg != null;
    }

    private Long max;

    /**
    * Maximum value over the aggregated interval, in seconds
    */
    public Long getMax() {
        return this.max;
    }

    public boolean hasMax() {
        return this.max != null;
    }

    private Long count;

    /**
    * Samples count over the aggregated interval
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long sum;

    /**
    * Sum of all samples over the aggregated interval, in seconds
    */
    public Long getSum() {
        return this.sum;
    }

    public boolean hasSum() {
        return this.sum != null;
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
        if (min != null) {
            sb.append(aligned)
                .append("\"min\": \"")
                .append(min)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (avg != null) {
            sb.append(aligned)
                .append("\"avg\": \"")
                .append(avg)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (max != null) {
            sb.append(aligned)
                .append("\"max\": \"")
                .append(max)
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
        if (sum != null) {
            sb.append(aligned)
                .append("\"sum\": \"")
                .append(sum)
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
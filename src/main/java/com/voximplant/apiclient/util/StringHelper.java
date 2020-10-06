package com.voximplant.apiclient.util;

import java.util.Arrays;

public class StringHelper {
    public static String arrayToString(Object[] objects, int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder().append('[');
        if (objects == null || objects.length == 0) return sb.append(']').append(',').toString();

        for (Object object : objects) {
            if (object != null) {
                sb.append(System.lineSeparator());
                if (object instanceof Alignable) {
                    Alignable alignable = (Alignable) object;
                    sb.append(alignable.toString(alignment + 1));
                } else {
                    sb.append(object);
                }
            }
        }

        return sb.append(System.lineSeparator())
                .append(preAligned)
                .append(']')
                .append(',')
                .toString();
    }
}

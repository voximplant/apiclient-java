package com.voximplant.apiclient.util;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiArgument<T> {
    private MultiArgument(Collection<? extends T> values) {
        this.values = new LinkedList<T>(values);
    }

    private MultiArgument(T value) {
        this.values = Collections.singletonList(value);
    }

    private MultiArgument(boolean any) {
        this.any = any;
    }

    public static <T> MultiArgument <T> forSingleValue(T v) {
        return new MultiArgument<T>(v);
    }

    public static <T> MultiArgument <T> forMultipleValues(Collection<? extends T> v) {
        return new MultiArgument<T>(v);
    }


    public static <T> MultiArgument <T> forAllValues() {
        return new MultiArgument<T>(true);
    }

    public String toString() {
        if (this.any) {
            return "all";
        }
        if (this.values == null)
            return "";
        return this.values.stream().map(Object::toString).collect(Collectors.joining(";"));
    }

    boolean hasValue() {
        return this.any || (this.values != null && this.values.size() > 0);
    }

    List<T> values;
    boolean any;
}

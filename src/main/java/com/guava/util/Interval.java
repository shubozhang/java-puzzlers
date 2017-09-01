package com.guava.util;

/**
 * Created by shubo.zhang on 9/23/2016.
 */
public class Interval {

    public int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

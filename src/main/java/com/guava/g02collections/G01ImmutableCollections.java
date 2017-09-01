package com.guava.g02collections;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.guava.util.Interval;

import java.util.HashSet;
import java.util.Set;

/*
* Immutable collections, for defensive programming, constant collections, and improved efficiency.
*
* 1. Immutable objects have many advantages, including:
*1)Safe for use by untrusted libraries.
*2)Thread-safe: can be used by many threads with no risk of race conditions.
*3)Doesn't need to support mutation, and can make time and space savings with that assumption.
* All immutable collection implementations are more memory-efficient than their mutable siblings (analysis)
*4)Can be used as a constant, with the expectation that it will remain fixed
* */
public class G01ImmutableCollections {

    //1. constant collection
    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    ImmutableSet<Interval> intervals;

    //2. defensive copy! (only shallow copy)
    G01ImmutableCollections(Set<Interval> intervals) {
        this.intervals = ImmutableSet.copyOf(intervals);
    }

    public static void main(String[] args) {
        testDefensiveCopy();
        createImmutableSet();
    }


    public static void testDefensiveCopy() {
        Interval interval = new Interval(0,10);
        Interval interval1 = new Interval(10,20);
        Interval interval2 = new Interval(20,30);
        Interval interval3 = new Interval(30,40);

        Set<Interval> intervals = new HashSet<>();
        intervals.add(interval);
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);

        G01ImmutableCollections instance = new G01ImmutableCollections(intervals);
        intervals.remove(interval2);
        System.out.println(intervals.size());
        System.out.println(instance.intervals.size());
    }

    public static void createImmutableSet() {
        //order is preserved from construction time
        System.out.println(ImmutableSet.of("a", "b", "c","b","a").toString());
        System.out.println(ImmutableMap.of("a", 1, "b", 2).toString());
        System.out.println(ImmutableSet.of("a", "b", "c","b","a").asList().get(2));
    }

}

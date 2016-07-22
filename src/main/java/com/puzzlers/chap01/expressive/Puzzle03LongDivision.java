package com.puzzlers.chap01.expressive;

/**
 * When working with large numbers, watch out for overflow
 */
public class Puzzle03LongDivision {

    public static void main(String[] args) {
        test();
        test1();
    }

    // MICROS_PER_DAY calculation fits the long but not int.
    private static void test(){
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }

    private static void test1(){
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}

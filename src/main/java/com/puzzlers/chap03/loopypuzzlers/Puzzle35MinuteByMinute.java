package com.puzzlers.chap03.loopypuzzlers;

/*
* 1. Never use spacing to express grouping; use parentheses.
* 2. Replace all magic numbers with appropriately named constants
* */
public class Puzzle35MinuteByMinute {

    private static final int MS_PER_HOUR = 60 * 60 * 1000;
    private static final int MS_PER_MINUTE = 60 * 1000;

    public static void main(String[] args) {
        test1();

        test2();
    }



    /*
    * Key: The remainder and multiplication operators have the same precedence
    * */
    private static void test1() {
        int minutes = 0;
        for (int ms = 0; ms < 60*60*1000; ms++) {
            if (ms % 60*1000 == 0) {
                minutes++;
            }
        }

        System.out.println(minutes);
    }
    private static void test2() {
        int minutes = 0;
        for (int ms = 0; ms < 60*60*1000; ms++) {
            if (ms % (60*1000) == 0) {
                minutes++;
            }
        }
        System.out.println(minutes);
    }

}

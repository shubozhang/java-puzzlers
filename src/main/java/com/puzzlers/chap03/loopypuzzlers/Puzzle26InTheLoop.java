package com.puzzlers.chap03.loopypuzzlers;

/**
 * Lesson: all int variables are less than or equal to Integer.MAX_VALUE:
 * int x = Integer.MAX_VALUE + 1 => x == Integer.MIN_VALUE
 *
 * Whenever you use an integral type, be aware of the boundary conditions
 */
public class Puzzle26InTheLoop {

    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;
    public static void main(String[] args) {
       // test1();

        test2();
    }


    //Wrong:  Run forever
    private static void test1() {
        int count = 0;
        for (int i = START; i <= END; i++) {
            count++;
        }
        System.out.println(count);
    }

    // COrrect
    private static void test2() {
        int count = 0;
        for (long i = START; i <= END; i++) {
            count++;
        }
        System.out.println(count);
    }
}

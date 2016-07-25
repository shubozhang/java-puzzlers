package com.puzzlers.chap03.loopypuzzlers;

/**
 * 1. NaN is not equal to any floating-point value, including itself
 * 2. Any floating-point operation evaluates to NaN if one or more of its operands are NaN.
 * 3. once it generates NaN, a computation is damaged, and no further computation can
 * repair the damage.
 */
public class Puzzle29BrideOfLooper {

    public static void main(String[] args) {
        infiniteLoop();

        test1();
    }

    private static void infiniteLoop() {
        double i = 0.0 / 0.0;
        // or double i = Double.NaN;

        while(i != i) {}
    }

    // Strange consequences: it prints out false
    private static void test1() {
        double i = 0.0 / 0.0;
        System.out.println(i - i == 0);
    }
}

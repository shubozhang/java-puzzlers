package com.puzzlers.chap01.expressive;

/**
 * Determine whether an integer is an odd number
 *
 * Java reminder operator: (a / b) * b + (a % b) == a
 */
public class Puzzle01Oddity {

    public static void main(String[] args) {
        System.out.println(isOdd1(3));
        System.out.println(isOdd1(-3));

        System.out.println(isOdd2(3));
        System.out.println(isOdd2(-3));

        System.out.println(isOdd3(3));
        System.out.println(isOdd3(-3));
    }

    // Wrong: -3 % 2 == -1 not 1
    private static boolean isOdd1(int i) {
        return i % 2 == 1;
    }

    // Correct
    private static boolean isOdd2(int i) {
        return i % 2 != 0;
    }

    // faster version
    private static boolean isOdd3(int i) {
        return (i & 1) != 0;
    }
}

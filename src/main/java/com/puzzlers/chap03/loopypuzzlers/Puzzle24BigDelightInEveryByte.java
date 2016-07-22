package com.puzzlers.chap03.loopypuzzlers;

/**
 * Mixed-type comparisons are always confusing because the system is forced to promote one operand
 * to match the type of the other.
 *
 * To summarize: Avoid mixed-type comparisons, because they are inherently confusing (Puzzle 5).
 * To help achieve this goal, use declared constants in place of “magic numbers.”
 * You already knew that this was a good idea; it documents the meanings of constants, centralizes
 * their definitions, and eliminates duplicate definitions.
 * Now you know that it also forces you to give each constant a type appropriate for its use,
 * eliminating one source of mixed-type comparisons.
 */
public class Puzzle24BigDelightInEveryByte {
    private static final byte TARGET = (byte)0x90;

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }


    // print out nothing: byte is singed type with 8 bits
    private static void test1() {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.println("Joy!");
        }
    }

    private static void test2() {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == (byte)0x90)
                System.out.println("Joy!");
        }
    }

    private static void test3() {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
            if (b == TARGET)
                System.out.print("Joy!");
    }
}

package com.puzzlers.chap03.loopypuzzlers;

/**
 * Shift operators:
 *
 * left int: shift operators use only the five low-order bits(0,31) of their right operand as the shift distance
 * left long: shift operators use only the six low-order bits(0,63) of their right operand as the shift distance
 *
 *
 * In summary, shift distances are calculated mod 32 or, if the left operand is a
 * long, mod 64. It is therefore impossible to shift away an entire value by using any
 * shift operator or distance. Also, it is impossible to perform a left shift with a right-shift
 * operator or vice-versa. Use a constant shift distance if possible, and exercise
 * care if the shift distance can’t be made constant.
 */
public class Puzzle27ShiftyI {

    public static void main(String[] args) {
        //test1();

        test2();
    }

    // Endless loop: (-1 << 32) is equal to -1 rather than 0
    private static void test1() {
        int i = 0;
        while (-1 << i != 0)
            i++;
        System.out.println(i);
    }

    // Shift distances should, if possible, be constants.
    private static void test2() {
        int distance = 0;
        for (int val = -1; val != 0; val <<= 1)
            distance++;
        System.out.println(distance);
    }
}

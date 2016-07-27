package com.puzzlers.chap03.loopypuzzlers;

/**
 * In two's-complement arithmetic:
 * Integer.MIN_VALUE is its own negation
 *
 * In summary, Java uses two’s-complement arithmetic, which is asymmetric.
 * The signed integral types (int, long, byte, and short) each have one more negative
 * value than positive, which is always the minimum value representable in the
 * type. Negating Integer.MIN_VALUE doesn’t change its value, and the same holds
 * true for Long.MIN_VALUE. Negating Short.MIN_VALUE and casting the resulting
 * int value back to a short returns the original value (Short.MIN_VALUE).
 */
public class Puzzle33LooperMeetsTheWolfman {

    public static void main(String[] args) {
        infiniteLoop();
    }

    private static void infiniteLoop() {

        Integer i = Integer.MIN_VALUE;
        while (i == -i && i != 0) {}
    }
}

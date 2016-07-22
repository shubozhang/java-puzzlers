package com.puzzlers.chap01.expressive;

/**
 * It is generally best to avoid mixed-type computations
 *
 * Negative decimal constants are clearly identifiable by the presence of a minus sign
 *
 * Hex and octal literals are negative if their high-order bit is set
 */
public class Puzzle05Hex {

    public static void main(String[] args) {
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));

        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}

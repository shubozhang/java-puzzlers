package com.puzzlers.chap09.advancedpuzzlers;

/**
 * In two cases, however, inserting a seemingly innocuous
 * pair of parentheses can make a legal Java program illegal. This strange state of
 * affairs stems from the asymmetry of the two’s-complement binary numbers, discussed
 * in Puzzle 33 and Puzzle 64.
 *
 * The largest decimal literal of type int is
 * 2147483648. Decimal literals from 0 to 2147483647 may appear anywhere an int
 * literal may appear, but the literal 2147483648 may appear only as the operand of
 * the unary negation operator [JLS 3.10.1].
 */
public class Puzzle86PoisonParenLitter {

    public static void main(String[] args) {

        // correct case
        int i = -2147483648;
        long j = -9223372036854775808L;

        //wrong case
        //int i = -(2147483648);
        //long j = -(9223372036854775808L);
    }
}

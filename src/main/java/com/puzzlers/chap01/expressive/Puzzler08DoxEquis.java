package com.puzzlers.chap01.expressive;

/**
 * It is generally best to use the same type for the second and third operands in conditional expressions.
 *
 * 1. 2nd and 3rd operands have the same type, then that the return type.
 * 2. if one of the operands is of type T where T is byte, short, or char and the other operand is a CONSTANT expression of type
 *    int whose value is representable in type T, then the return type is T
 * 3. Otherwise, return type is the promoted type of 2nd and 3rd operands.
 */
public class Puzzler08DoxEquis {

    public static void main(String[] args) {
        char x = 'X';
        int i = 0;

        System.out.println(true ? x : 0);
        System.out.println(false ? i : x);
    }
}

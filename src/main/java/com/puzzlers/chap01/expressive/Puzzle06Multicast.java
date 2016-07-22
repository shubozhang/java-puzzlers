package com.puzzlers.chap01.expressive;

/**
 * Sign extension is performed if the type of the original value is signed;
 * zero extension if it is a char, regardless of the type to which it is being converted.
 *
 * Decimal 10: 1010  => compliment 0101 => sum 1111 => sum + 1 = 10000 = 0
 * So compliment + 1 is the negative binary of a positive number
 */
public class Puzzle06Multicast {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(-0));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(-10));


        System.out.println((byte)-1);
        System.out.println((char)(byte)-1);
        System.out.println((int)(char)(byte)-1);
    }
}

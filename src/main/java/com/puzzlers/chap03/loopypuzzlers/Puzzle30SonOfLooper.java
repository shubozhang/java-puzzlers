package com.puzzlers.chap03.loopypuzzlers;

/**
 * For String, + operator is overloaded, it performs not addition but string concatenation.
 *
 * In summary, operator overloading can be very misleading
 */
public class Puzzle30SonOfLooper {

    public static void main(String[] args) {
        infiniteLoop();
    }

    //There is no NaN equivalent for the integral types.
    // Infinite loop
    private static void infiniteLoop() {

        String i = "Buy a book";

        while(i != i + 0) {}
    }
}

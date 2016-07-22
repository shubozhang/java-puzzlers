package com.puzzlers.chap02.character;

/**
 * 1. Avoid Unicode escapes except where they are truly necessary
 */
public class Puzzle16LinePrinter {

    public static void main(String[] args) {
        // Note: \\u000A is Unicode representation of linefeed (LF)
        char c = 0x000A;
        System.out.println(c);
    }
}



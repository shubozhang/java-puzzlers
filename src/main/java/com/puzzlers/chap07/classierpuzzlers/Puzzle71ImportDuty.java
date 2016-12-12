package com.puzzlers.chap07.classierpuzzlers;

import java.util.Arrays;

/**
 * 1. members that are naturally in scope take precedence over static imports.
 *
 * 2. Use the static import facility sparingly and only when there is a compelling need.
 */
public class Puzzle71ImportDuty {

    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5);
    }
    static void printArgs(Object... args) {

        // error
        //System.out.println(toString(args));

        System.out.println(Arrays.toString(args));
    }
}

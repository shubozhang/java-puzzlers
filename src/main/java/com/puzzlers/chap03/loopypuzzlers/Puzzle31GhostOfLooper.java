package com.puzzlers.chap03.loopypuzzlers;

/**
 * Narrowing primitive conversions can lose information about the magnitude or precision of
 * numeric values
 *
 * In summary, do not use compound assignment operators on short, byte,
 * or char variables.
 */
public class Puzzle31GhostOfLooper {

    public static void main(String[] args) {

        ghostLoop();
    }

    // Infinite loop
    private static void ghostLoop() {

        short i = -1;
        while (i != 0) {
            i >>>= 1;
        }
    }
}

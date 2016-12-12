package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. If you want to guarantee the prize in the Jeopardy class even while preserving
 *    the ability to subclass it, use a final method instead of a final field
 */
public class Jeopardy2 {

    private static final String PRIZE = "$64,000";

    public static final String prize() {
        return PRIZE;
    }
}

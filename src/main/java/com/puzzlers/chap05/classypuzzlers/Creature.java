package com.puzzlers.chap05.classypuzzlers;

/**
 * Created by K26511 on 12/6/2016.
 */
public class Creature {
    // thread un-safe
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }


    public static long numCreated() {
        return numCreated;
    }
}

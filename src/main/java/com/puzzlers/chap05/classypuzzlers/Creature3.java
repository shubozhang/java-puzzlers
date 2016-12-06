package com.puzzlers.chap05.classypuzzlers;

/**
 * Created by K26511 on 12/6/2016.
 */
public class Creature3 {

    private static long numCreated;

    public Creature3() {
        synchronized (Creature.class) {
            numCreated++;
        }
    }
    public static synchronized long numCreated() {
        return numCreated;
    }
}

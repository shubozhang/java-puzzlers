package com.puzzlers.chap05.classypuzzlers;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by K26511 on 12/6/2016.
 */
public class Creature2 {
    private static AtomicLong numCreated = new AtomicLong();

    public Creature2() {
        numCreated.incrementAndGet();
    }
    public static long numCreated() {
        return numCreated.get();
    }
}

package com.puzzlers.chap07.classierpuzzlers;

import java.util.Random;

/**
 * Upgrade to the latest release of the Java platform
 */
public enum Puzzle75HeadsOrTails {

    HEADS, TAILS;
    public String toString() {
        return name().toLowerCase();
    }

    private static Random rnd = new Random();
    public static Puzzle75HeadsOrTails flip() {
        return rnd.nextBoolean() ? HEADS : TAILS;
    }
    public static void main(String[] args) {
        System.out.println(flip());
    }
}

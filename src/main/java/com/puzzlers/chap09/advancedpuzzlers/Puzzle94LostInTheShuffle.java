package com.puzzlers.chap09.advancedpuzzlers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
* 1. Whenever the libraries provide a method that does what you need, use it
*
* 2. Fact: Java random number generator can only be used for causal card game
*
* The random number generator, java.util.Random, takes a 64-bit seed, and
the sequence of numbers it generates is fully determined by that seed. There are
52! permutations of a 52-card deck, but only 264 seeds. What fraction of the permutations
does that cover? Would you believe 2.3 × 10􀀐47 percent? That is a polite
way of saying “practically none.” If you use java.security.SecureRandom in
place of java.util.Random, you get a 160-bit seed, but that buys you surprisingly
little: The shuffle method still fails to return some permutations for arrays with
more than 40 elements (because 40! > 2160). For a 52-element array, you still get
only 1.8 × 10􀀐18 percent of the possible permutations.
* */
public class Puzzle94LostInTheShuffle {
    private static Random rnd = new Random();

    // Wrong: won't do shuffle work
    public static void myShuffle(Object[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, rnd.nextInt(a.length));
    }
    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


    // 1. Shuffle method provided by library
    public static void shuffle(Object[] a) {
        Collections.shuffle(Arrays.asList(a));
    }

    // 2. Fix your method
    public static void myShuffle2(Object[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, i + rnd.nextInt(a.length - i));
    }

}

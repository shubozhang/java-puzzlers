package com.puzzlers.chap02.character;

import java.util.Random;

/**
 * Use familiar idioms and APIs whenever possible.
 * If you must use unfamiliar APIs, read the documentation carefully.
 *
 *
 * First, be careful of fencepost errors.
 * Second, remember to put a break after each case in switch statements.
 * Third, use common idioms and APIs, and consult the documentation when you stray from the well-worn path.
 * Fourth, a char is not a String but is more like an int.
 * Finally, watch out for sneaky puzzlers.
 */
public class Puzzle23NoPainNoGain {

    private static Random rnd = new Random();
    private static String randomElement(String[] a) {
        return a[rnd.nextInt(a.length)];
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    // Wrong: 3 bugs. new StringBuffer(char) changed to new StringBuffer(77), which is create a new StringBuffer with space 77
    private static void test1() {
        StringBuffer word;
        switch(rnd.nextInt(2)) { // bug 1, only return 0,1
            case 1: word = new StringBuffer('P'); // bug 2, not break
            case 2: word = new StringBuffer('G'); // bug 3, new StringBuffer(char) does not exist. So convert char to int.
            default: word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }

    //Correct
    private static void test2() {
        StringBuffer word;
        switch(rnd.nextInt(3)) {
            case 1: word = new StringBuffer("P"); break;
            case 2: word = new StringBuffer("G"); break;
            default: word = new StringBuffer("M");
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }

    // Elegant way
    private static void test3() {
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
    }

    // Better way
    private static void test4() {
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(randomElement(a));
    }
}

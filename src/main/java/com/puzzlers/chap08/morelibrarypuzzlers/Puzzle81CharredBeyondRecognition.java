package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * 1. Use familiar idioms whenever possible; if you must stray from familiar APIs,
 *    be sure to consult the documentation
 *
 * 2. write(int) is the only output method that does not flush a PrintStream on which automatic flushing is enabled.
 */
public class Puzzle81CharredBeyondRecognition {

    public static void main (String[] args) {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++) {
            System.out.write(greeting.charAt(i));

            System.out.println(greeting.charAt(i));
        }
    }
}

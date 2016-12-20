package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * 1. you must drain the output stream of a child process in
 *    order to ensure its termination; the same goes for the error stream, which can
 *    be even more troublesome because you can’t predict when a process will dump
 *    lots of output to it.
 */
public class Puzzle82BeerBlast {

    static final String COMMAND = "java BeerBlast slave";


    public static void main(String[] args) throws Exception {
        if (args.length == 1 && args[0].equals("slave")) {
            for (int i = 99; i > 0; i--) {
                System.out.println(i + " bottles of beer on the wall");
                System.out.println(i + " bottles of beer");
                System.out.println("You take one down, pass it around,");
                System.out.println((i-1) + " bottles of beer on the wall");
                System.out.println();
            }
        } else {

            // Master
            Process process = Runtime.getRuntime().exec(COMMAND);
            int exitValue = process.waitFor();
            System.out.println("exit value = " + exitValue);
        }
    }
}

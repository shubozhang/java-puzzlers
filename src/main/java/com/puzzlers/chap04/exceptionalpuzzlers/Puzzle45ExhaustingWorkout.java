package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * It does demonstrate that
 * exponential algorithms are impractical for all but the smallest inputs, and it shows
 * that you can write an exponential algorithm without even trying.
 */
public class Puzzle45ExhaustingWorkout {

    public static void main(String[] args) {

        workHard02();

        workHard();
        System.out.println("It’s nap time.");
    }

    // StackOverFlow error
    private static void workHard02() {
        workHard02();
    }


    // this is not an infinite loop, but it will take almost infinite time to terminate.
    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }
}

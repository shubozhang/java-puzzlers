package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * 1. Calling Thread.interrupted always clears the interrupted status of the current thread.
 *
 * 2. Don’t use Thread.interrupted unless you want to clear the interrupted status of the current thread.
 *
 * 3. If you just want to query it, use isInterrupted instead.
 */
public class Puzzle84RudelyInterrupted {


    public static void main(String[] args) {
        interrupted1();

        interrupted2();
    }
    public static void interrupted1() {
        Thread.currentThread().interrupt();
        if (Thread.interrupted()) {
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }
    }


    public static void interrupted2() {
        Thread.currentThread().interrupt();
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Interrupted: " + Thread.currentThread().isInterrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.currentThread().isInterrupted());
        }
    }
}

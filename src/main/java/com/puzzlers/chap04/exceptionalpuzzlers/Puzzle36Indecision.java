package com.puzzlers.chap04.exceptionalpuzzlers;


/*
* 1. In a try-finally statement, the finally block is always
* executed when control leaves the try block
*
* 2. Never exit a finally block with a return, break,
* continue, or throw, and never allow a checked exception to propagate out of
* a finally block.
* */
public class Puzzle36Indecision {

    public static void main(String[] args) {
        System.out.println(decision());
    }
    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}

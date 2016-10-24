package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * Created by Shubo on 10/23/2016.
 */
public class Puzzle39HelloGoodbye {

    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            System.exit(0);
        } finally {
            System.out.println("Goodbye world");
        }
    }
}

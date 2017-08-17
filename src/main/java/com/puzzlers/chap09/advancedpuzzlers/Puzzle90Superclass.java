package com.puzzlers.chap09.advancedpuzzlers;

public class Puzzle90Superclass {

    public Puzzle90Superclass() {}

    class Inner1 extends Puzzle90Superclass {
        Inner1() {
            super(); // invokes Outer() constructor
        }
    }
    class Inner2 extends Inner1 {
        Inner2() {
            super(); // invokes Inner1() constructor
        }
    }

    public static void main(String[] args) {
        Puzzle90Superclass p = new Puzzle90Superclass();

    }
}

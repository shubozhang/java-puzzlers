package com.puzzlers.chap09.advancedpuzzlers;


/*
* Whenever you write a member class, ask yourself, Does this class really need
an enclosing instance? If the answer is no, make it static.

it is rarely appropriate to extend an inner
class; if you must, think long and hard about the enclosing instance.
* */
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

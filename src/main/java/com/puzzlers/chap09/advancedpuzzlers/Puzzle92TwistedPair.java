package com.puzzlers.chap09.advancedpuzzlers;


/*
* 1. Within a top-level type—in this case, Twisted—all the local, inner, nested, and anonymous
classes can access one another’s members without any restrictions

2. private members are never inherited

3. The anonymous class inside "reproduce" is both an inner class of Twisted and extends it. This alone is sufficient
to make the program unreadable.

4. If you can’t tell what a program does by looking at it, it probably doesn’t do what you want.
* */

public class Puzzle92TwistedPair {
    private final String name;

    Puzzle92TwistedPair(String name) {
        this.name = name;
    }

    private String name() {
        return name;
    }

    private void reproduce() {
        new Puzzle92TwistedPair("reproduce") {
            void printName() {
                System.out.println(name());
            }
        }.printName();
    }
    public static void main(String[] args) {
        new Puzzle92TwistedPair("main").reproduce();
    }
}

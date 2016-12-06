package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. A qualifying expression for a static method invocation is evaluated, but its value is
 *    ignored. There is no requirement that the value be non-null.
 *
 * 2. this puzzle is exactly the same as that of Puzzle 48: Qualify static method invocations with a type,
 *    or don’t qualify them at all.
 */
public class Puzzle54NullAndVoid {

    public static void greet() {
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        ((Puzzle54NullAndVoid) null).greet();
    }
}

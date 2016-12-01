package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. there is no dynamic dispatch on static methods
 *
 * 2. To avoid confusion, do not hide static methods
 */
public class Puzzle48AllIGetIsStatic {
    public static void main(String args[]) {
        Puzzle48Dog woofer = new Puzzle48Dog();
        Puzzle48Dog nipper = new Puzzle48Basenji();
        woofer.bark();
        nipper.bark();
    }

}

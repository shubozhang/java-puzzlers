package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. When a variable and a type have the same name and both are in
 *    scope, the variable name takes precedence
 *
 * 2. To avoid conflict between constant names and class names, treat acronyms as
 *    ordinary words in class names
 */
public class Puzzle68ShadesOfGray {
    public static void main(String[] args) {
        System.out.println(X.Y.Z);
    }
}

class X {
    static class Y {
        static String Z = "Black";
    }

    static C Y = new C();
}

class C {
    String Z = "White";
}

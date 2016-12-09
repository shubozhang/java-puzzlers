package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. obey the standard naming conventions to avoid conflicts between
 * different namespaces (and because your program will be illegible if you violate
 * these conventions).
 * Also, avoid variable names that conflict with common top level
 * package names, and use MixedCase for class names even if they are acronyms.
 */
public class Puzzle68ShadesOfGray2 {
    public static void main(String[] args) {
        System.out.println(Ex.Why.z);

        System.out.println(Ex.y.z);
    }
}

class Ex {
    static class Why {
        static String z = "Black";
    }

    static See y = new See();
}

class See {
    String z = "White";
}

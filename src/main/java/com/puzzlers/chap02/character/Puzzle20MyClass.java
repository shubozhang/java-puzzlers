package com.puzzlers.chap02.character;

import java.util.regex.Pattern;

/**
 * String.replaceAll takes a regular expression as its first parameter, not a literal sequence of characters.
 */
public class Puzzle20MyClass {

    public static void main(String[] args) {
        System.out.println(Puzzle20MyClass.class.getName());


        System.out.println(Puzzle20MyClass.class.getName().replaceAll(".", "/") + ".class");

        System.out.println(Puzzle20MyClass.class.getName().replaceAll("\\.", "/") + ".class");

        System.out.println(Puzzle20MyClass.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
    }
}

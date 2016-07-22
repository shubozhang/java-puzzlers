package com.puzzlers.chap02.character;

import java.io.File;
import java.util.regex.Matcher;

/**
 * This program works on UNIX, but not on Windows
 *
 * Be careful when using unfamiliar library methods
 * regular expressions are tricky: Problems tend to show up at run time rather than compile time.
 */
public class Puzzle21MyClass2 {

    public static void main(String[] args) {
        //Error
        //System.out.println(Puzzle21MyClass2.class.getName().replaceAll("\\.", File.separator) + ".class");

        System.out.println(Puzzle21MyClass2.class.getName()
                .replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");

        // Better way
        System.out.println(Puzzle21MyClass2.class.getName().
                replace(".", File.separator) + ".class");
    }
}

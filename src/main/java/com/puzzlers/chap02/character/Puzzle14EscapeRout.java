package com.puzzlers.chap02.character;

/**
 * 1. Java provides no special treatment for Unicode escapes within string literals.
 * 2. prefer escape sequences to Unicode escapes in string and character literals.
 * 3. Do not use Unicode escapes to represent ASCII characters.
 */
public class Puzzle14EscapeRout {

    public static void main(String[] args) {
        // \u0022 is the Unicode escape for double quote (")
        System.out.println("a\u0022.length() + \u0022b".length());

        // Equivalent
        System.out.println("a".length() + "b".length());


        // Correct
        System.out.println("a\".length() + \"b".length());
    }
}

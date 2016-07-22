package com.puzzlers.chap02.character;


/*
* string conversion:
* If the reference is null, it is converted to the string "null".
* Otherwise, the conversion is performed as if by an invocation of the toString method of the referenced
* object with no arguments; but if the result of invoking the toString
* method is null, then the string "null" is used instead
* */
public class Puzzle12ABC {

    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        // Equivalent
        System.out.println(letters + " easy as " + numbers);
        System.out.println(letters + " easy as " + numbers.toString());

        // Equivalent
        System.out.println(letters + " easy as " + 123);
        System.out.println(letters + " easy as " + new Integer(123).toString());

        // To fix the issue
        System.out.println(letters + " easy as " + String.valueOf(numbers));
    }
}

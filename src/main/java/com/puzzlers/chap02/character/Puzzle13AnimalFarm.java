package com.puzzlers.chap02.character;

/**
 * 1. == tests whether two object references are identical, not two objects are equal.
 * 2. string1.equals(string2) is used to test whether two strings' content are equal.
 * 3. compile-time constants of type String are interned:
 * If initialized with constant expressions of type String that designate the same character
 * sequence are represented by identical object references.
 * 4. The + operator, whether used for addition or string concatenation, binds more tightly than the == operator.
 * 5. When using the string concatenation operator, always parenthesize nontrivial operands.
 */
public class Puzzle13AnimalFarm {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        // Equivalent statements. That's why they print out only false, no "Animals are equal".
        System.out.println("Animals are equal: " + pig == dog);
        System.out.println(("Animals are equal: " + pig) == dog);


        //Result is correct, but arguably, the program is still broken.
        // Your code should rarely, if ever, depend on the interning of string constants.
        System.out.println("Animals are equal: " + (pig == dog));

        // Correct
        System.out.println("Animals are equal: " + pig.equals(dog));
    }
}

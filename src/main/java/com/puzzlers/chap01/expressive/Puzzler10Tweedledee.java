package com.puzzlers.chap01.expressive;

/**
 * x += i   vs x = x + i
 * Scenario: x += i illegal, x = x + i legal
 *
 * Compound assignment requires both operands to be primitives or boxed primitives, with one exception:
 * allow right hand to be any type if the left hand side parameter type is String
 *
 * Simple assignment operator is much less picky when its left-hand side is object reference type,
 * the right-hand side is allowed as long as it is assignment compatible with the variable on the left.
 */
public class Puzzler10Tweedledee {

    public static void main(String[] args) {

        test1();

        test2();
    }

    private static void test1() {
        Object x = "Buy";
        String s = "Effective Java";

        x = x + s;
        System.out.println(x);
    }

    private static void test2() {
        Object x = "Buy";
        String s = "Effective Java";

        // x += s; won't compile
        System.out.println(x);
    }

}

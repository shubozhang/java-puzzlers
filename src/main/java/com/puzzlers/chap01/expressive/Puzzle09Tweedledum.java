package com.puzzlers.chap01.expressive;

/**
 * x += i   vs x = x + i
 * Scenario: x += i legal, x = x + i illegal
 *
 * = is a simple assignment operator
 * += is a compound assignment operator
 *
 * In java, E1 op= E2  ==> E1 = (T)((E1) op (E2)), where T is the type E1, except that E1 is evaluated only once.
 * This means that compound assignment expressions automatically cast the result of
 * the computation they perform to the type of the variable on their left-hand side.
 *
 * Consequences:
 * 1) += compound assignment always compile the code, and may return a wrong result (silent narrowing primitive conversion)
 * 2) = assignment won't compile if there is type error.
 * so use compound assignment with cautious.
 *
 */
public class Puzzle09Tweedledum {

    public static void main(String[] args) {

        withEffect();

        withoutEffect();
    }



    private static void withEffect() {
        short s = 1;
        int i = 123456;
        s += i; // Contains a hidden cast, int to short, possible lose of precision
        System.out.println(s);

        // s = s + i; won't compile
    }

    private static void withoutEffect() {
        short s = 1;
        int i = 123456;
        i += s; // Contains a hidden cast too, but no lose of precision
        System.out.println(i);

        i = i + s; // no error
    }
}

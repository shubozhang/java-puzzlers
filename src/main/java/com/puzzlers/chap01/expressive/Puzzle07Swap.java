package com.puzzlers.chap01.expressive;

/**
 * Do not assign to the same variable more than once in a single expression.
 *
 * In Java, operands of operators are evaluated from left to right
 */
public class Puzzle07Swap {

    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;

        x ^= y ^= x ^= y;

        System.out.println("x = " + x + " ; " + " y = " + y);

        actuallyDo();

        test();
    }

    // Actual behavior of x^=y^=x^=y
    private static void actuallyDo() {
        int x = 1984;
        int y = 2001;
        int tmp1 = x;
        int tmp2 = y;
        int tmp3 = x ^ y;
        x = tmp3;
        y = tmp2 ^ tmp3;
        x = tmp1 ^ y;

        System.out.println("x = " + x + " ; " + " y = " + y);
    }

    //Correct, but don't ever do it
    private static void test() {
        int x = 1984;
        int y = 2001;

        y = (x ^= (y ^=x))^y;

        System.out.println("x = " + x + " ; " + " y = " + y);
    }
}

package com.puzzlers.chap03.loopypuzzlers;

/**
 * 1. infinity + 1 == infinity
 *
 * 2. The distance between adjacent floating-point values is called an ulp, which is
 * an acronym for unit in the last place.
 *
 * In summary, it is possible to represent infinity as a double or a float. Most
 * people find this somewhat surprising the first time they hear of it, perhaps because
 * you can’t represent infinity by using any of the integral types. Second, adding a
 * small floating-point value to a large one will not change the large value. This
 * too may be counterintuitive, as it isn’t true for the real numbers. It is worth
 * remembering that binary floating-point arithmetic is only an approximation to
 * real arithmetic.
 */
public class Puzzle28Looper {

    public static void main(String[] args) {

        infiniteForLoop();

        infiniteWhileLoop();
    }

    private static void infiniteForLoop() {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
        }
    }

    // infinity + 1 == infinity
    private static void infiniteWhileLoop() {
        double i = 1.0 / 0.0; // i is infinity
        // or double i = Double.POSITIVE_INFINITY;
        // or any sufficiently large floating-point value
        // double i = 1.0e40;
        while(i == i + 1) {}
    }
}

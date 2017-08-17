package com.puzzlers.chap09.advancedpuzzlers;

/**
 * Beware of lossy widening primitive conversions to float and double.
 *
 * 1. Reflexive: x ~ x for all x. In other words, every value is related to itself.
 * 2. Transitive: if x ~ y and y ~ z, then x ~ z. In other words, if one value is related
 * to a second and the second is related to a third, the first value is related to the third.
 * 3. Symmetric: if x ~ y, then y ~ x. In other words, if one value is related to a second,
 * the second value is related to the first.
 *
 *
 * 1. == operator is NOT reflexive, because the expression (Double.NaN == Double.NaN) evaluates to false
 *
 * 2. == operator follows symmetry: (x == y) implies that (y == x) for all values x and y
 *
 * 3. == operator is NOT transitive over the primitive values, because the == operator
 * first performs binary numeric promotion [JLS 5.6.2]. This may result in a widening
 * primitive conversion on one of the two values
 */
public class Puzzle87StrainedRelations {

    public static void main(String[] args) throws Exception {
        long x = Long.MAX_VALUE;
        double y = (double) Long.MAX_VALUE;
        long z = Long.MAX_VALUE - 1;

        System.out.print ((x == y) + " "); // Imprecise!
        System.out.print ((y == z) + " "); // Imprecise!
        System.out.println(x == z); // Precise
    }
}

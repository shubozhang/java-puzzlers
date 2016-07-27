package com.puzzlers.chap03.loopypuzzlers;

/**
 * 1. numerical comparison operators (<, <=, >, and >=) required both of their operands to be of
 * a primitive numeric type (byte, char, short, int, long, float, or double).
 *
 * 2. equality operators (== and !=) perform reference identity comparison rather than
 * value comparison when applied to object references.
 *
 * In summary, there is a fundamental difference in the way numerical comparison
 * operators and equality operators behave when both operands are of
 * boxed numeric types: Numerical comparison operators perform value comparisons,
 * while equality operators perform reference identity comparisons.
 */
public class Puzzle32CurseOfLooper {

    public static void main(String[] args) {
        infiniteLoop();

        referenceComparison();

        valueComparison();
    }

    private static void infiniteLoop() {
        // these declarations are also true
        /*double i = Double.NaN;
        double j = Double.NaN;*/

        Integer i = new Integer(0);
        Integer j = new Integer(0);

        while (i <= j && j <= i && i != j) {

        }
    }

    // The following program was always guaranteed to print false
    private static void referenceComparison() {
        System.out.println(new Integer(0) == new Integer(0));
    }

    /*
    * The equality operators do perform numerical comparison when only one of their two operands is
    * of a boxed numeric type and the other is of a primitive type.
    * */
    private static void valueComparison() {
        System.out.println(new Integer(0) == 0);
    }
}

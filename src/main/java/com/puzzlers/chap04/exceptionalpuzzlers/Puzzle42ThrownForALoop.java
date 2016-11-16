package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * Do not use exceptions for
 * loop control; use exceptions only for exceptional conditions
 */
public class Puzzle42ThrownForALoop {

    public static void main(String[] args) {
        thrownLoop1();

        thrownLoop2();
    }

    private static void thrownLoop1() {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
                { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int successCount = 0;
        try {
            int i = 0;
            while (true) {
                if (thirdElementIsThree1(tests[i++]))
                    successCount++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
         // No more tests to process
        }
        System.out.println(successCount);
    }


    private static boolean thirdElementIsThree1(int[] a) {
        return a.length >= 3 & a[2] == 3;
    }

    private static void thrownLoop2() {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
                { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int successCount = 0;
        try {
            int i = 0;
            for (int[] test : tests){
                if (thirdElementIsThree2(test)) {
                    successCount++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // No more tests to process
        }
        System.out.println(successCount);
    }


    /*
    * & logical operator always evaluates both of its operands
    * && conditional operator does not evaluate its right operand if its left operand evaluates to false
    *
    * above rule also applies to | and ||
    * */
    private static boolean thirdElementIsThree2(int[] a) {
        return a.length >= 3 && a[2] == 3;
    }
}

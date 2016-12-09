package com.puzzlers.chap06.librarypuzzlers;

/**
 * 1. Math.abs(): If the argument is equal to the value of Integer.MIN_VALUE, the result is that same value,
 * which is negative. Math.abs is not guaranteed to return a non-negative result
 *
 * 2. Briefly, there is no int value that represents the negation of Integer.MIN_VALUE and no long
 * value that represents the negation of Long.MIN_VALUE
 */
public class Puzzle64TheModSquad {

    public static void main(String[] args) {
        test01();

        test02();
    }

    /*
    * Exception
    * */
    private static void test01() {
        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];
// Iterate over all ints (Idiom from Puzzle 26)
        int i = Integer.MIN_VALUE;
        do {
            histogram[(Math.abs(i) % MODULUS)]++;
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++) {
            System.out.print(histogram[j] + " ");
        }
    }

    /*
    * Correct
    * */
    private static void test02() {
        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];
// Iterate over all ints (Idiom from Puzzle 26)
        int i = Integer.MIN_VALUE;
        do {
            histogram[mod(i, MODULUS)]++;
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++) {
            System.out.print(histogram[j] + " ");
        }
    }
    private static int mod(int i, int modulus) {
        int result = i % modulus;
        return result < 0 ? result + modulus : result;
    }
}

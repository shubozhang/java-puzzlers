package com.puzzlers.chap03.loopypuzzlers;

/**
 * Puzzle 7: Do not assign to the same variable more than once in a single expression.
 */
public class Puzzle25InclementIncrement {

    public static void main(String[] args) {
        test1();
    }

    // Equivalent
    //int tmp = j;
    //j = j + 1;
    //j = tmp;
    private static void test1() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);
    }
}



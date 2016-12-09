package com.puzzlers.chap06.librarypuzzlers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 1. fixed-width integer is not big enough to hold the difference of two arbitrary integers of the same width.
 *
 * 2. Do not use a subtraction-based comparator unless you are sure that the difference between values
 * will never be greater than Integer.MAX_VALUE
 */
public class Puzzle65AStrangeSagaOfASuspiciousSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        Comparator<Integer> cmp = new Comparator<Integer>() {

            /*
            * Wrong
            * */
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }

            /*
            * correct
            * */
            /*public int compare(Integer i1, Integer i2) {
                return (i2 < i1 ? -1 : (i2 > i1 ? 0 : 1));
            }*/
        };
        Arrays.sort(arr, cmp);

        /*
        * Or
        * */
        //Arrays.sort(arr, Collections.reverseOrder()),
        System.out.println(order(arr));
    }
    enum Order { ASCENDING, DESCENDING, CONSTANT, UNORDERED };
    static Order order(Integer[] a) {
        boolean ascending = false;
        boolean descending = false;
        for (int i = 1; i < a.length; i++) {
            ascending |= (a[i] > a[i-1]);
            descending |= (a[i] < a[i-1]);
        }
        if (ascending && !descending)
            return Order.ASCENDING;
        if (descending && !ascending)
            return Order.DESCENDING;
        if (!ascending)
            return Order.CONSTANT; // All elements equal
        return Order.UNORDERED; // Array is not sorted
    }
}

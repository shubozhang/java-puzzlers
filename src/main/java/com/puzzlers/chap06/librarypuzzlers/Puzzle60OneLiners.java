package com.puzzlers.chap06.librarypuzzlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 1. Knowing what’s in the libraries can save you lots of time and effort and can enhance the speed and quality of
 * your programs.
 */
public class Puzzle60OneLiners {

    static <E> List<E> withoutDuplicates(List<E> original) {
        return new ArrayList<E>(new LinkedHashSet<E>(original));
    }

    static String[] parse(String string) {
        return string.split(",\\s*");
    }

    static  void printArray(String[][][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }

    static boolean hasMoreBitsSet(int i, int j) {
        return (Integer.bitCount(i) > Integer.bitCount(j));
    }
}

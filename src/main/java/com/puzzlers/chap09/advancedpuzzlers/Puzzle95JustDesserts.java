package com.puzzlers.chap09.advancedpuzzlers;

import java.util.Arrays;
import java.util.Comparator;


/*
* Don’t code like my brother
* */
public class Puzzle95JustDesserts {

    public static void main(String[] args) {
        applePie();

        bananaBread();

        chocolateCake();
    }

    private static void applePie() {
        int count = 0;
        for (int i = 0; i < 100; i++); {
            count++;
        }
        System.out.println("applePie: " + count);
    }

    private static void bananaBread() {
        Integer[] array = { 3, 1, 4, 1, 5, 9 };
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i1 < i2 ? -1 : (i2 > i1 ? 1 : 0);
            }
        });
        System.out.println("bananaBread: " + Arrays.toString(array));
    }

    private static void chocolateCake() {
        System.out.println(true?false:true == true?false:true);
    }
}

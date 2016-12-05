package com.puzzlers.chap05.classypuzzlers;

/**
 * Created by k26511 on 12/5/2016.
 */
public class Cache2 {

    private static final int sum = computeSum();
    private static int computeSum() {
        int result = 0;
        for (int i = 0; i < 100; i++)
            result += i;
        return result;
    }
    public static int getSum() {
        return sum;
    }
}

package com.puzzlers.chap03.loopypuzzlers;

/**
 * Created by shubo.zhang on 7/22/2016.
 */
public class Puzzle27ShiftyI {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        int i = 0;
        while (-1 << i != 0)
            i++;
        System.out.println(i);
    }
}

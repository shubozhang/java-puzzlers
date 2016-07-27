package com.puzzlers.chap03.loopypuzzlers;

/**
 * Created by shubo.zhang on 7/27/2016.
 */
public class Puzzle34DownForTheCount {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        test();
    }

    private static void test() {
        final int START = 2000000000;
        int count = 0;
        float ff = START;
        System.out.println(ff == ff + 50);
        for (float f = START; f < START + 50; f++){
            count++;
            System.out.println(f);
        }
        System.out.println(count);
    }
}

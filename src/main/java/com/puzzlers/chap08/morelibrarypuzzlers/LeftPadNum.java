package com.puzzlers.chap08.morelibrarypuzzlers;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by k26511 on 12/20/2016.
 */
public class LeftPadNum {

    private static String TEN = "0000000000";

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        List<String> nums = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int num1 = random.nextInt(99998) + 1;
            int num2 = random.nextInt(98) + 1;
            String num = String.valueOf(num1) + String.valueOf(num2);
            nums.add(num);
        }

        Instant start = Instant.now();
        for (String num : nums) {
            leftPadNum2(num);
        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() + " ms");
    }

    public static String leftPadNum(String num) {
        int len = num.length();
        String temp = "0000000000";
        if (len > 10 || len ==0) {
            return temp;
        } else {
            return temp.substring(0, 10 - len) + num;
        }
    }

    public static String leftPadNum2(String num) {
        int len = num.length();
        StringBuilder sb = new StringBuilder("0000000000");
        if (len > 10 || len ==0) {
            return sb.toString();
        } else {
            return sb.substring(0, 10 - len) + num;
        }
    }

    public static String leftPadNum3(String num) {
        int len = num.length();
        if (len > 10 || len ==0) {
            return TEN;
        } else {
            return TEN.substring(0, 10 - len) + num;
        }
    }

    public static String leftPadNum4(String num) {
        return String.format("%010d", Integer.parseInt(num));
    }
}


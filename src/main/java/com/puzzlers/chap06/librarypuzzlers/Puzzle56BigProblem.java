package com.puzzlers.chap06.librarypuzzlers;

import java.math.BigInteger;

/**
 * 1. BigInteger / Integer instances are immutable
 *
 * 2. So String, BigDecimal, and the wrapper types: Integer, Long, Short,
 * Byte, Character, Boolean, Float, and Double.
 */
public class Puzzle56BigProblem {

    public static void main(String[] args) {
        test01();

        test02();
    }

    private static void test01() {

        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand  = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);
    }

    private static void test02(){
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total = total.add(fiveThousand);
        total = total.add(fiftyThousand);
        total = total.add(fiveHundredThousand);
        System.out.println(total);
    }
}

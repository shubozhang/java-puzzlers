package com.puzzlers.chap01.expressive;


import java.math.BigDecimal;

/*
* Avoid float and double where exact answers are required; for monetary calculations, use int, long, or BigDecimal
* */
public class Puzzle02Change {

    public static void main(String[] args) {
        System.out.println(2.0 - 1.93); // result is not exact 0.1

        //poor solution
        System.out.printf("%.2f%n", 2.00 - 1.90);

        // solution 1
        System.out.println((200 - 190) + " cents");

        // solution 2
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.93")));
    }
}

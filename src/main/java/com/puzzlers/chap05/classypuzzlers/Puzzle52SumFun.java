package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. Use either eager initialization or lazy initialization, never both.
 *
 * 2. Think about class initialization order, especially when it is nontrivial
 */
public class Puzzle52SumFun {

    public static void main(String[] args) {
        System.out.println(Cache.getSum());
    }
}

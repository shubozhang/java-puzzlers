package com.puzzlers.chap07.classierpuzzlers;

/**
 * Created by K26511 on 12/13/2016.
 */
public class Puzzle74IdentityCrisis {

    // try to print out false without overridding equals()
    public static void main(String[] args) {

        test();

        test1();

        test2();
    }

    private static void test() {
        Enigma e = new Enigma();
        System.out.println(e.equals(e));
    }

    private static void test1() {
        Enigma1 e = new Enigma1();
        System.out.println(e.equals(e));
    }

    private static void test2() {
        Enigma2 e = new Enigma2();
        System.out.println(e.equals(e));
    }

}

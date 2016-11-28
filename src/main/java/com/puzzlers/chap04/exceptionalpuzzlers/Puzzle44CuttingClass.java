package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * do not depend on catching NoClassDefFoundError. The language
 * specification carefully describes when class initialization occurs
 * [JLS 12.4.1], but class loading is far less predictable. More generally, it is rarely
 * appropriate to catch Error or its subclasses. These exceptions are reserved for
 * failures from which recovery is not feasible.
 */
public class Puzzle44CuttingClass {

    public static void main(String[] args) {
        test01();

        test02();

        test03();
    }


    /*
    * throws an uncaught NoClassDefFoundError
    * */
    private static void test01() {

        try {
            Puzzle44Helper m = new Puzzle44Helper();
        } catch (java.lang.NoClassDefFoundError ex) {
            System.out.println("Got it!");
        }
    }


    /*
    * prints Got it!
    * */
    private static void test02() {
        Puzzle44Helper m;
        try {
            m = new Puzzle44Helper();
        } catch (java.lang.NoClassDefFoundError ex) {
            System.out.println("Got it!");
        }
    }


    /*
    * Best implementation
    * */

    private static void test03() {
        try {
            Object m = Class.forName("Puzzle44Helper").newInstance();
        } catch (ClassNotFoundException ex) {
            System.err.println("Got it!");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

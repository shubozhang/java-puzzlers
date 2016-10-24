package com.puzzlers.chap04.exceptionalpuzzlers;

import java.io.IOException;

/**
 * The first program illustrates the basic requirement that catch
 * clauses for checked exceptions are permitted only when the corresponding try
 * clause can throw the exception in question.
 *
 * The second program illustrates a corner case where this requirement does not apply.
 *
 * The third program illustrates the interaction of multiple inherited throws clauses,
 * which reduces rather than increases the number of exceptions that a method is permitted to throw.
 *
 * The behaviors illustrated by this puzzle don’t generally cause subtle bugs, but they can
 * be a bit surprising the first time you see them.
 */
public class Puzzle37ExceptionallyArcane {

    public static void main(String[] args) {
        arcane1();
        arcane2();
    }

    /*
    * it is a compile-time error for a catch clause to catch a checked exception type E if
    * the corresponding try clause can’t throw an exception of some subtype of E
    * */
    private static void arcane1() {
        /*try {
            System.out.println("Hello world");
        } catch (IOException e) {
            System.out.println("I’ve never seen println fail!");
        }*/
    }


    /*
    * catch clauses that catch Exception or Throwable are legal regardless of the contents of the
    * corresponding try clause
    * */
    private static void arcane2() {
        try {
                // If you have nothing nice to say, say nothing
        } catch (Exception e) {
            System.out.println("This can’t happen");
        }
    }



    /*
    * The set of checked exceptions that a method can throw is the intersection of
    * the sets of checked exceptions that it is declared to throw in all applicable
    * types, not the union
    * */
    interface Type1 {
        void f() throws CloneNotSupportedException;
    }
    interface Type2 {
        void f() throws InterruptedException;
    }
    interface Type3 extends Type1, Type2 {
    }

    public class Arcane3 implements Type3 {
        public void f() {
            System.out.println("Hello world");
        }
        public void test() {
            Type3 t3 = new Arcane3();
            t3.f();
        }
    }
}

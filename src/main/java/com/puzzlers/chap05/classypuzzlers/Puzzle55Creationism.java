package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. The syntax of the language does not allow a local variable declaration statement as the statement
 *    repeated by a for, while, or do loop
 *
 * 2. A local variable declaration can appear only as a statement directly within a block.
 *
 * 3. When using a variable to count instance creations, use a long rather than an int, to prevent overflow.
 *
 * 4. Finally, if you are going to create instances in multiple threads,
 * either synchronize access to the instance counter or use an AtomicLong.
 */
public class Puzzle55Creationism {
    public static void main(String[] args) {
        //test01();
        test02();
        test03();
    }

//
    /*private static void test01() {
        for (int i = 0; i < 100; i++)
        // error: A local variable declaration can appear only as a statement directly within a block.
            Creature creature = new Creature();
        System.out.println(Creature.numCreated());
    }*/

    private static void test02() {
        for (int i = 0; i < 100; i++) {
            Creature creature = new Creature();
        }
        System.out.println(Creature.numCreated());
    }

    private static void test03() {
        for (int i = 0; i < 100; i++)
            new Creature();
        System.out.println(Creature.numCreated());
    }
}

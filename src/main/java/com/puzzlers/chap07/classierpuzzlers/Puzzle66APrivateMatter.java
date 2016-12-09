package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. The access modifier of an overriding method must provide at least as much access as that of the overridden method
 *
 * 2. avoid hiding: A class that hides a field with one whose accessibility is more restrictive than
 * that of the hidden field, as in our original program, violates the principle of subsumption.
 */
public class Puzzle66APrivateMatter {

    public static void main(String[] args) {

        //Error
        //System.out.println(new Derived().className);

        System.out.println(((Base) new Derived()).className);


        // Better way: encapsulation
        System.out.println(new Derived().getClassName());
    }
}

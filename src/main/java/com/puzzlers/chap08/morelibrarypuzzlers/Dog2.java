package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * Created by k26511 on 12/28/2016.
 */
public class Dog2 extends Exception {
    public static final Dog2 INSTANCE = new Dog2();
    private Dog2() { }
    public String toString() {
        return "Woof";
    }

    /*
    * turns the hidden constructor into a hidden static factory that returns the one true Dog
    * */
    private Object readResolve() {
        //Accept no substitutes!
        return INSTANCE;
    }
}
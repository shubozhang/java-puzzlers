package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * Created by k26511 on 12/28/2016.
 */
public class Dog extends Exception {
    public static final Dog INSTANCE = new Dog();
    private Dog() { }
    public String toString() {
        return "Woof";
    }
}
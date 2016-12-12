package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. Avoid reusing the names of platform classes, and never reuse class
 *  names from java.lang, because these names are automatically imported everywhere.
 */

/*
* Won't run. String[] is the defined type, not java.lang.String. So compiler cannot find main method(java.lang.String[] args)
* */
public class Puzzle67AllStrungOut {
    /*public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}
class String {
    private final java.lang.String s;
    public String(java.lang.String s) {
        this.s = s;
    }
    public java.lang.String toString() {
        return s;
    }*/
}

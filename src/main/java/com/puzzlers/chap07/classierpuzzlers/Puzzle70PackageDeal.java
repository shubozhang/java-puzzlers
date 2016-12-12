package com.puzzlers.chap07.classierpuzzlers;

import com.puzzlers.chap06.librarypuzzlers.CodeTalk;

/**
 * 1. package-private methods cannot be directly overridden outside
 * the package in which they’re declared
 */
public class Puzzle70PackageDeal {

    private static class ClickIt extends CodeTalk {
        protected void printMessage() {
            System.out.println("Hack");
        }
    }
    public static void main(String[] args) {
        ClickIt clickit = new ClickIt();
        clickit.doIt();
    }

}

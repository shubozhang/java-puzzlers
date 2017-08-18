package com.puzzlers.chap09.advancedpuzzlers;


import com.puzzlers.util.Puzzle93Wrods;

/*
* 1. References to constant fields are resolved at compile time to the constant values they denote.
* 2. A constant variable is any primitive or string variable that is initialized
with a constant expression. Surprisingly, null is not a constant expression.
* Note: null is not a compile-time constant expression
* */
public class Puzzle93ClassWarfare {

    public static void main(String[] args) {
        System.out.println(Puzzle93Wrods.FIRST + " " +
                Puzzle93Wrods.SECOND + " " +
                Puzzle93Wrods.THIRD);
    }
}

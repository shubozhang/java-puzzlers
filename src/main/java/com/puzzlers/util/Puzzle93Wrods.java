package com.puzzlers.util;



/*
* 1. References to constant fields are resolved at compile time to the constant values they denote.
* 2. A constant variable is any primitive or string variable that is initialized
with a constant expression. Surprisingly, null is not a constant expression.
* Note: null is not a compile-time constant expression
* */
public class Puzzle93Wrods {

    private Puzzle93Wrods() { }; // Uninstantiable

    // 1. Puzzle93ClassWarfare will print out: the null set
    public static final String FIRST = "the";
    public static final String SECOND = null;
    public static final String THIRD = "set";

    // 2. if lib class Puzzle93Wrods is modified as the following and re-complied, but Puzzle93ClassWarfare didn't re-compile
    // the output will be: the chemistry set. Because null is not a compile-time constant expression.

    //public static final String FIRST = "physics";
    //public static final String SECOND = "chemistry";
    //public static final String THIRD = "biology";

    // 3. Best way to solve this issue: turn a constant expression into a nonconstant by passing it
    //to a method that simply returns its input parameter.

    //public static final String FIRST = ident("the");
    //public static final String SECOND = ident(null);
    //public static final String THIRD = ident("set");
    //private static String ident(String s) {
    //    return s;
    //}
}

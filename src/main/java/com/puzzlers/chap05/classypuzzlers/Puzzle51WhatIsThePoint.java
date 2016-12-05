package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. it is possible to observe the value of a final instance field before its value has been assigned.
 *
 * 2. Circular class initialization is a necessary evil, but circular
 *    instance initialization can and should always be avoided.
 *
 *  3. never call overridable methods from constructors, either directly or indirectly
 *
 *  4. you must never call an overridable method from a constructor
 * under any circumstances. The resulting circularities in instance initialization can
 * be fatal. The solution to this problem is lazy initialization
 */
public class Puzzle51WhatIsThePoint {

    public static void main(String[] args) {

        //[4,2]:null
        System.out.println(new ColorPoint(4, 2, "purple"));
    }
}

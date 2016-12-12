package com.puzzlers.chap07.classierpuzzlers;

/**
 * 1. the final modifier means something completely different on methods and fields
 *
 * 2. On a method, final means that the method may not be overridden (for instance methods) or hidden (for static methods)
 *
 * 3. On a field, final means the field may not be assigned more than once
 *
 * 4. avoid reusing names for unrelated variables or unrelated concepts.
 * Using distinct names for unrelated concepts helps readers and programmers
 * to keep the concepts separate
 */
public class Puzzle72FinalJeopardy  extends Jeopardy{
    public static final String PRIZE = "2 cents";

    public static void main(String[] args) {
        System.out.println(Puzzle72FinalJeopardy.PRIZE);
    }
}

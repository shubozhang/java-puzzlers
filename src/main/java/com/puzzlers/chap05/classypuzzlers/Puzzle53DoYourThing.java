package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. alternate constructor invocation
 *
 * 2. The Private Constructor Capture idiom illustrated by the solution to this puzzle
 * is a useful pattern to add to your bag of tricks. We’ve seen some genuinely
 * ugly code that could have been avoided with this pattern.
 */
public class Puzzle53DoYourThing extends Thing{
    private final int arg;

    public Puzzle53DoYourThing() {
        this(SomeOtherClass.func());
    }
    private Puzzle53DoYourThing(int i) {
        super(i);
        arg = i;
    }

    /*public Puzzle53DoYourThing() {
        //can’t reference arg before supertype constructor has been called
        //super(arg = SomeClass.fun());
    }*/
}

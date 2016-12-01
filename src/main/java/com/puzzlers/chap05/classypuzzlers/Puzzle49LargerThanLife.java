package com.puzzlers.chap05.classypuzzlers;

import java.util.Calendar;

/**
 * 1. Final fields are constants only if the initializing expression is a constant expression
 *
 * 2. it is possible to observe a final static field before it
 *  is initialized, when it still contains the default value for its type
 *
 *  3. Be careful of class initialization cycles. The simplest ones
 * involve only a single class, but they can also involve multiple classes. It isn’t
 * always wrong to have class initialization cycles, but they may result in constructor
 * invocation before static fields are initialized. Static fields, even final static fields,
 * may be observed with their default value before they are initialized.
 */
public class Puzzle49LargerThanLife {

    /*
    * First, static fields are set to their default values, so INSTANCE is set to null, and CURRENT_YEAR is set to 0
    *
    * Second, static field initializers are executed in order of appearance. When INSTANCE is initialized, CURRENT_YEAR
    * is still 0. So INSTANCE is -1930
    *
    * */
    public static final Puzzle49LargerThanLife INSTANCE = new Puzzle49LargerThanLife();
    private final int beltSize;
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private Puzzle49LargerThanLife() {
        beltSize = CURRENT_YEAR - 1930;
    }
    public int beltSize() {
        return beltSize;
    }
    public static void main(String[] args) {
        System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
    }
}

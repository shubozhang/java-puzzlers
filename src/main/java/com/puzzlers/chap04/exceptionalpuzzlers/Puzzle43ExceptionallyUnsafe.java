package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * Java’s exception checking is not enforced by the virtual
 * machine. It is a compile-time facility designed to make it easier to write correct
 * programs, but it can be circumvented at run time. To reduce your exposure, do not
 * ignore compiler warnings.
 */
public class Puzzle43ExceptionallyUnsafe {

    private static Throwable t;
    private Puzzle43ExceptionallyUnsafe() throws Throwable {
        throw t;
    }
    public static synchronized void sneakyThrow(Throwable t) {
        Puzzle43ExceptionallyUnsafe.t = t;
        try {
            Puzzle43ExceptionallyUnsafe.class.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException();
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException();
        } finally {
            Puzzle43ExceptionallyUnsafe.t = null; // Avoid memory leak
        }
    }
}

package com.puzzlers.chap04.exceptionalpuzzlers;

/**
 * instance initializers run before constructor bodies. Any exceptions
 * thrown by instance initializers propagate to constructors.
 *
 * If initializers throw checked exceptions, constructors must be declared to throw them too, but this
 * should be avoided, because it is confusing.
 *
 * Finally, beware of infinite recursion when designing classes whose instances
 * contain other instances of the same class.
 */
public class Puzzle40ReluctantConstructor {

    private Puzzle40ReluctantConstructor internalInstance = new Puzzle40ReluctantConstructor();

    public Puzzle40ReluctantConstructor() throws Exception {
        throw new Exception("I’m not coming out");
    }
    public static void main(String[] args) {
        try {
            Puzzle40ReluctantConstructor b = new Puzzle40ReluctantConstructor();
            System.out.println("Surprise!");
        } catch (Exception ex) {
            System.out.println("I told you so");
        }
    }
}

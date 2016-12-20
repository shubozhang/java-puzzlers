package com.puzzlers.chap08.morelibrarypuzzlers;

import java.lang.reflect.Constructor;

/**
 * 1.Java automatically provides a default public constructor that takes no parameters,
 * this applies only when you invoke the constructor normally: nonreflectively.
 *
 * 2. Unless you have a compelling need for an enclosing instance, prefer static member
 *    classes over nonstatic
 *
 * 3. Because of the complexity of the mapping from Java programs to class files,
 *    avoid using reflection to instantiate inner classes.
 */
public class Puzzle80FurtherReflection {

    // error
    /*private void greetWorld() throws Exception {
        System.out.println(Inner2.class.newInstance());
    }*/

    private void greetWorld() throws Exception {
        System.out.println(Inner2.class.newInstance());
    }

    private void greetWorld2() throws Exception {
        Constructor c = Inner.class.getConstructor(Puzzle80FurtherReflection.class);
        System.out.println(c.newInstance(Puzzle80FurtherReflection.this));
    }

    public class Inner {
        public String toString() {
            return "Hello world";
        }
    }

    public static class Inner2 {
        public String toString() {
            return "Hello world";
        }
    }

    public static void main(String[] args) throws Exception {
        new Puzzle80FurtherReflection().greetWorld();

        new Puzzle80FurtherReflection().greetWorld2();
    }

}

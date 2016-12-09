package com.puzzlers.chap06.librarypuzzlers;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. The HashSet class uses the equals(Object) method to test elements for equality, not equals(Person person)
 *
 * 2. Don’t overload a method when you want to override.
 * To avoid unintentional overloading, mechanically copy the declaration
 * of each superclass method that you want to override, or better yet, let your IDE
 * do it for you. Besides protecting you against unintentional overloading, this protects
 * you against misspelling method names. If you are using release 5.0 or a later
 * release, apply the @Override annotation to each method declaration that is
 * intended to override a superclass method:
 *
 * With this annotation, the program will not compile unless the annotated method
 * overrides a superclass method.
 */
public class Puzzle58MakingAHashOfIt {
    private final String first, last;

    public Puzzle58MakingAHashOfIt(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public static void main(String[] args) {
        Set<Puzzle58MakingAHashOfIt> s = new HashSet<Puzzle58MakingAHashOfIt>();
        s.add(new Puzzle58MakingAHashOfIt("Mickey", "Mouse"));
        System.out.println(s.contains(new Puzzle58MakingAHashOfIt("Mickey", "Mouse")));
    }

     /*
     * wrong equals method: this method intends to override the equals
     * method but mistakenly overloaded it
     * */
    public boolean equals(Puzzle58MakingAHashOfIt n) {
        return n.first.equals(first) && n.last.equals(last);
    }
    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + last.hashCode();
        return result;
    }

    /*
    * Correct equals method
    * */

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puzzle58MakingAHashOfIt that = (Puzzle58MakingAHashOfIt) o;

        if (!first.equals(that.first)) return false;
        return last.equals(that.last);

    }*/
}

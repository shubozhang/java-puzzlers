package com.puzzlers.util;

 final public class Puzzle91Sub extends Puzzle91Super{

     private int id;
     public Puzzle91Sub(int id) {
         this.id = id;
         set.add(this); // Establish invariant
     }
     public void checkInvariant() {
         if (!set.contains(this))
             throw new AssertionError("invariant violated");
     }
     public int hashCode() {
         return id;
     }
     public boolean equals(Object o) {
         return (o instanceof Puzzle91Sub) && (id == ((Puzzle91Sub)o).id);
     }
}

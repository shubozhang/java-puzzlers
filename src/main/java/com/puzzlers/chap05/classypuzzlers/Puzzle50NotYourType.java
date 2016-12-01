package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. the instanceof operator is defined to return false when its left operand is null.
 *
 * 2. the instanceof operator requires that if both operands are class types, one must be a subtype of the other
 *
 * 3. cast operator: if both types in a cast operation are class types, one must
 * be a subtype of the other
 */
public class Puzzle50NotYourType {

    public static void main(String[] args) {
        String s = null;
        System.out.println(s instanceof String);

        //System.out.println(new Puzzle50NotYourType() instanceof String);

        Puzzle50NotYourType t3 = (Puzzle50NotYourType) new Object();
    }
}

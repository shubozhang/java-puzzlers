package com.puzzlers.chap06.librarypuzzlers;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * 1. IdentityHashMap says, “this class implements the Map interface with a hash
 * table, using reference-equality in place of [value]-equality when comparing keys”
 *
 * 2. string constants are interned. In other words, string constants
 * that are equal will also be identical. programs should rarely,
 * if ever, depend on this behavior for their correct operation.
 *
 * 3. Don’t use IdentityHashMap unless you need its identity-based semantics; it is not a general-purpose Map implementation.
 * These semantics are useful for implementing topology-preserving object graph transformations,
 * such as serialization or deep-copying.
 * */
public class Puzzle62TheNameGame {

    public static void main(String args[]) {
        Map<String, String> m =
                new IdentityHashMap<String, String>();
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
        System.out.println(m.size());
    }
}

package com.puzzlers.chap07.classierpuzzlers;

/**
 * If two overloadings of the same method can be applied to
 * some parameters, they should have identical behavior. In this case,
 * e.equals(e) and e.equals((Object)e) return different results.
 */
public class Enigma1 {

    // This is overload, not override
    public boolean equals(Enigma1 enigma1) {
        return false;
    }
}

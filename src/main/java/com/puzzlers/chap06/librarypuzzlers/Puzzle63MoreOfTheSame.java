package com.puzzlers.chap06.librarypuzzlers;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Don’t accidentally turn a constructor declaration into a method declaration by adding a return type.
 *
 * 2. obey the standard naming conventions, which dictate that method names begin with lowercase letters,
 * whereas class names begin with uppercase letters.
 */
public class Puzzle63MoreOfTheSame {

    private Map<String,String> m = new HashMap<String,String>();
    public void Puzzle63MoreOfTheSame() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }
    public int size() {
        return m.size();
    }
    public static void main(String args[]) {
        Puzzle63MoreOfTheSame puzzle63MoreOfTheSame = new Puzzle63MoreOfTheSame();
        System.out.println(puzzle63MoreOfTheSame.size());
    }
}

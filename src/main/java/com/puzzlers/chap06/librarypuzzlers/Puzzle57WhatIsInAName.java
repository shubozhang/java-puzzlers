package com.puzzlers.chap06.librarypuzzlers;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. You must override hashCode whenever you override equals
 */
public class Puzzle57WhatIsInAName {

    private final String first, last;

    public Puzzle57WhatIsInAName(String first, String last) {
        this.first = first;
        this.last = last;
    }
  /*  public boolean equals(Object o) {
        if (!(o instanceof Puzzle57WhatIsInAName))
            return false;
        Puzzle57WhatIsInAName n = (Puzzle57WhatIsInAName)o;
        return n.first.equals(first) && n.last.equals(last);
    }*/
    public static void main(String[] args) {
        Set<Puzzle57WhatIsInAName> s = new HashSet<Puzzle57WhatIsInAName>();
        s.add(new Puzzle57WhatIsInAName("Mickey", "Mouse"));
        System.out.println(s.contains(new Puzzle57WhatIsInAName("Mickey", "Mouse")));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puzzle57WhatIsInAName that = (Puzzle57WhatIsInAName) o;

        if (!first.equals(that.first)) return false;
        return last.equals(that.last);

    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + last.hashCode();
        return result;
    }
}

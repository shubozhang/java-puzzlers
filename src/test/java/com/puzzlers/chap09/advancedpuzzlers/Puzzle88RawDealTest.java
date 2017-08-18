package com.puzzlers.chap09.advancedpuzzlers;

import com.puzzlers.chap09.advancedpuzzlers.Puzzle88RawDeal;
import org.junit.Test;

public class Puzzle88RawDealTest {

    // Wrong way
    @Test
    public void rawDeal() {
        // raw type declaration, not type safe
        Puzzle88RawDeal p = new Puzzle88RawDeal<Object>(23, "skidoo");
        System.out.println(p.first() + " " + p.second());

        //1.  Compilation error
/*        for (String s : p.stringList()) {
            System.out.print(s + " ");
        }*/


        // 2. Don’t do this too; it doesn’t really fix the problem!
        // You lose all the benefits of generics, and the program wouldn’t even
        // compile if the loop invoked any String methods on s.
        /*for (Object s : p.stringList()) {
            System.out.print(s + " ");
        }*/
    }


    // Correct way
    @Test
    public void rawDeal2() {
        /*
        * If the parameterized type List<Object> is used,
        * the compiler knows that the list is allowed to contain elements of all types, so it is
        * safe to let you insert any object.
        * */
        Puzzle88RawDeal<Object> p = new Puzzle88RawDeal(23, "skidoo");
        System.out.println(p.first() + " " + p.second());

        for (String s : p.stringList()) {
            System.out.print(s + " ");
        }
    }

}
package com.puzzlers.chap10.misc;

/*

Example 1:
interface A {
    default void hi() { System.out.println("A"); }
}

interface B {
    default void hi() { System.out.println("B"); }
}

class AB implements A, B { // won't compile
}

new AB().hi(); // won't compile.

* // compile error
* // since Misc02InterfaceA and B have default method

Example 2:
interface D extends A { }
interface E extends A { }
interface F extends A {
    default void hi() { System.out.println("F"); }
}

class DE implement D, E { }
new DE().hi(); // prints A

class DEF implement D, E, F { }
new DEF().hi(); // prints F as it is closer in the heirarchy than A.
* */

import com.puzzlers.util.Misc02InterfaceA;
import com.puzzlers.util.Misc02InterfaceB;
import com.puzzlers.util.Misc02InterfaceC;
import com.puzzlers.util.Misc02InterfaceD;

public class Misc02MultiInterfaceCD implements Misc02InterfaceC, Misc02InterfaceD{


    public static void main(String[] args) {

        new Misc02MultiInterfaceCD().print(); // output: A
    }
}

package com.puzzlers.chap10.misc01multiinterface;

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

import com.puzzlers.util.Misc01InterfaceC;
import com.puzzlers.util.Misc01InterfaceD;

public class MultiInterfaceCD implements Misc01InterfaceC, Misc01InterfaceD {


    public static void main(String[] args) {

        new MultiInterfaceCD().print(); // output: A
    }
}

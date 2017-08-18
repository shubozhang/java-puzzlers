package com.puzzlers.chap10.misc;

import com.puzzlers.util.Misc01InterfaceA;
import com.puzzlers.util.Misc01InterfaceB;

/*
* "It is possible for a class to inherit multiple methods with override-equivalent signatures."
*
* Misc01InterfaceA, B have no default method.
* */
public class Misc01MultiInterface implements Misc01InterfaceA, Misc01InterfaceB{

    @Override
    public void present() {
        System.out.println("testing");
    }

    public static void main(String[] args) {
        new Misc01MultiInterface().present();
    }
}

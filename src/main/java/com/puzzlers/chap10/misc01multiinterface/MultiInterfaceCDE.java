package com.puzzlers.chap10.misc01multiinterface;

import com.puzzlers.util.Misc01InterfaceC;
import com.puzzlers.util.Misc01InterfaceD;
import com.puzzlers.util.Misc01InterfaceE;

public class MultiInterfaceCDE implements Misc01InterfaceC, Misc01InterfaceD, Misc01InterfaceE {

    public static void main(String[] args) {
        new MultiInterfaceCDE().print(); // output: E  as it is closer in the heirarchy than A.
    }
}

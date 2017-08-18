package com.puzzlers.chap10.misc;

import com.puzzlers.util.Misc02InterfaceC;
import com.puzzlers.util.Misc02InterfaceD;
import com.puzzlers.util.Misc02InterfaceE;

public class Misc02MultiInterfaceCDE implements Misc02InterfaceC, Misc02InterfaceD, Misc02InterfaceE {

    public static void main(String[] args) {
        new Misc02MultiInterfaceCDE().print(); // output: E  as it is closer in the heirarchy than A.
    }
}

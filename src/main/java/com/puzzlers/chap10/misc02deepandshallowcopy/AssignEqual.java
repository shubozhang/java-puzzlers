package com.puzzlers.chap10.misc02deepandshallowcopy;

import com.puzzlers.util.Misc02Dog;

/**
 * 1. if "=" is used, that means two variables reference to the same object.
 *
 * 2. This is not a copy operation because if val a does any modification, val b has the update automatically.
 */
public class AssignEqual {

    public static void main(String[] args) {
        Misc02Dog dog1 = new Misc02Dog("Melon");
        Misc02Dog dog2 = dog1;

        dog1.setName("Berry");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}

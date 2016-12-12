package com.puzzlers.chap07.classierpuzzlers;

/**
 * Created by K26511 on 12/12/2016.
 */
public class Puzzle69FadeToBlack {

    static class Xy extends X.Y { }

    public static void main(String[] args) {

        // way 1
        System.out.println(((X.Y)null).Z);

        // way 2
        System.out.println(Xy.Z);
    }


    // way 3
    /*public static <T extends X.Y> void main(String[] args) {
        System.out.println(T.Z);
    }*/
}

package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * Created by k26511 on 12/14/2016.
 */
public class Puzzle76PingPong2 {
    public static synchronized void main(String[] a) {
        Thread t = new Thread() {
            public void run() { pong(); }
        };
        t.start();
        System.out.print("Ping");
    }
    static synchronized void pong() {
        System.out.print("Pong");
    }
}

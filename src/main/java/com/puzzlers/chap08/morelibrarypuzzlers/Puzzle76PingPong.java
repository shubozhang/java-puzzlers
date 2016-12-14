package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * 1. Be careful not to invoke a thread’s run method when you mean to invoke its start method.
 *
 * 2. As discussed in Puzzle 47, composition is generally preferable to inheritance.
 */
public class Puzzle76PingPong {

    public static synchronized void main(String[] a) {
        Thread t = new Thread() {
            public void run() { pong(); }
        };
        t.run();
        System.out.print("Ping");
    }
    static synchronized void pong() {
        System.out.print("Pong");
    }
}

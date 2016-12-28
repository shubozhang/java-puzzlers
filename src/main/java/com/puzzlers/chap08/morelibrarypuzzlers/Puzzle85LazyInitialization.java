package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * When a thread is about to access a member of a class, the thread checks to see if the class has been initialized.
 * 1. The class is not yet initialized.
 * 2. The class is being initialized by the current thread: a recursive request for initialization.
 * 3. The class is being initialized by some thread other than the current thread.
 * 4. The class is already initialized.
 *
 *
 * keep class initialization as simple as possible.
 *
 * Waiting for a background thread during class initialization is
 * likely to result in deadlock. Keep class initialization sequences as simple as possible.
 * Automatic class initialization is known to be a very difficult language design problem
 */
public class Puzzle85LazyInitialization {
    private static boolean initialized = false;
    static {
        Thread t = new Thread(new Runnable() {
            public void run() {
                initialized = true;
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(initialized);
    }
}

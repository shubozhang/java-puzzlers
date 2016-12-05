package com.puzzlers.chap05.classypuzzlers;


public class Point2 {
    protected final int x, y;
    private String name; // Lazily initialized
    Point2(int x, int y) {
        this.x = x;
        this.y = y;
// name initialization removed
    }
    protected String makeName() {
        return "[" + x + "," + y + "]";
    }
    // Lazily computes and caches name on first use
    public final synchronized String toString() {
        if (name == null)
            name = makeName();
        return name;
    }
}

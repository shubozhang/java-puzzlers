package com.puzzlers.chap05.classypuzzlers;


public class Point {

    private final int x, y;
    private final String name; // Cached at construction time
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName(); // Invoke ColorPoint.makeName()
    }
    protected String makeName() {
        return "[" + x + "," + y + "]";
    }
    public final String toString() {
        return name;
    }
}

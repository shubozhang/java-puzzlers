package com.puzzlers.chap05.classypuzzlers;

/**
 * Created by k26511 on 12/5/2016.
 */
public class ColorPoint extends Point {

    private final String color;
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    protected String makeName() {
        return super.makeName() + ":" + color;
    }
}

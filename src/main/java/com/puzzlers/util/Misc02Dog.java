package com.puzzlers.util;

/**
 * Created by Shubo on 8/21/2017.
 */
public class Misc02Dog {
    private String name;

    public Misc02Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Misc02Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

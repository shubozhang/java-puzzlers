package com.puzzlers.chap08.morelibrarypuzzlers;

/**
 * 1. avoid shadowing
 *
 * 2. beware of unintentional shadowing, and learn to recognize compiler
 *    errors that indicate its presence.
 */
public class Puzzle79DogLife {

    public final String name;
    public final String food;
    public final String sound;

    public Puzzle79DogLife(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }
    public void eat() {
        System.out.println(name + ": Mmmmm, " + food);
    }
    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }

    public void sleep() {
        System.out.println(name + ": Zzzzzzz...");
    }

    //Compile error
    public void live() {
        new Thread() {
            public void run() {
                while (true) {
                    eat();
                    play();
                    //Compile error
                    //sleep();
                }
            }
        }.start();
    }

    //Correct
    public void live2() {
        new Thread() {
            public void run() {
                while (true) {
                    eat();
                    play();
                    //correct
                    Puzzle79DogLife.this.sleep();
                }
            }
        }.start();
    }

    // Correct:
    /*
    * use the Thread(Runnable) constructor instead of extending Puzzle 80: Further Reflection 195
    * Thread. If you do this, the problem goes away because the anonymous class does not inherit Thread.sleep.
    * */
    public void live3() {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    eat();
                    play();
                    sleep();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new Puzzle79DogLife("Fido", "beef", "Woof").live();
    }


}

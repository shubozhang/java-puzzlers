package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. Static fields are shared by their declaring class and any subclasses.
 *
 * 2. If you need a separate copy of a field for each subclass, you must declare
 * a separate static field in each subclass.
 *
 * 3. If you need a separate copy for each instance, declare a non-static field in the base class.
 *
 * 4. Also, favor composition over inheritance unless the derived class really is a kind of the base class.
 */
public class Puzzle47DogMyCats {

    public static void main(String[] args) {
        test01();

        test02();
    }


    private static void test01() {
        Puzzle47Dog[] dogs = { new Puzzle47Dog(), new Puzzle47Dog() };
        for (int i = 0; i < dogs.length; i++)
            dogs[i].woof();
        Puzzle47Cat[] cats = { new Puzzle47Cat(), new Puzzle47Cat(), new Puzzle47Cat() };
        for (int i = 0; i < cats.length; i++)
            cats[i].meow();
        System.out.print(Puzzle47Dog.getCount() + " woofs and ");
        System.out.println(Puzzle47Cat.getCount() + " meows");
    }

    private static void test02() {
        Puzzle47Dog02[] dogs = { new Puzzle47Dog02(), new Puzzle47Dog02() };
        for (int i = 0; i < dogs.length; i++)
            dogs[i].woof();
        Puzzle47Cat02[] cats = { new Puzzle47Cat02(), new Puzzle47Cat02(), new Puzzle47Cat02() };
        for (int i = 0; i < cats.length; i++)
            cats[i].meow();
        System.out.print(Puzzle47Dog02.woofCount() + " woofs and ");
        System.out.println(Puzzle47Cat02.meowCount() + " meows");
    }
}

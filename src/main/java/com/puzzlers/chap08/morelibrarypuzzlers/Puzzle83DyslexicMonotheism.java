package com.puzzlers.chap08.morelibrarypuzzlers;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
* 1. The problem is that Dog extends Exception and Exception implements java.io.Serializable. This means that
* Dog is serializable, and deserialization constitutes a hidden constructor. If you
* serialize Dog.INSTANCE and deserialize the resulting byte sequence, you will end up with another Dog
*
* 2. A singleton class that implements Serializable must have a readResolve method that returns its sole instance.
*
* 3. it is possible to implement Serializable unintentionally, by extending a class that implements
* Serializable or by implementing an interface that extends Serializable.
* */
public class Puzzle83DyslexicMonotheism {

    public static void main(String[] args) {

        copyDog();

        copyDog2();
    }

    private static void copyDog() {
        Dog newDog = (Dog) deepCopy(Dog.INSTANCE);
        System.out.println(newDog == Dog.INSTANCE);
        System.out.println(newDog);
    }

    private static void copyDog2() {
        Dog2 newDog = (Dog2) deepCopy(Dog2.INSTANCE);
        System.out.println(newDog == Dog2.INSTANCE);
        System.out.println(newDog);
    }
    // This method is very slow and generally a bad idea!
    public static Object deepCopy(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bin).readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
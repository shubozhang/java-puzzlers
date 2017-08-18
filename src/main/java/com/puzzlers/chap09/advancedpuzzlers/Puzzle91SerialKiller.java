package com.puzzlers.chap09.advancedpuzzlers;

import com.puzzlers.util.Puzzle91Sub;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
* If a HashSet, Hashtable, or HashMap will be serialized, ensure that its contents
do not refer back to it, directly or indirectly.


In readObject or readResolve methods, avoid invoking methods directly or indirectly on
objects currently being deserialized.

In summary, the Java serialization system is fragile. In order to serialize many
classes correctly and efficiently, you must write readObject or readResolve
methods [EJ Items 55–57]. This puzzle demonstrates that you must write these
methods carefully in order to avoid corruption of deserialized instances. The
readObject methods of HashSet, HashMap, and Hashtable are susceptible to corruption.
* */
public class Puzzle91SerialKiller {

    public static void main(String[] args) {
        Puzzle91Sub puzzle91Sub = new Puzzle91Sub(666);
        puzzle91Sub.checkInvariant();

        // will throw exception
        Puzzle91Sub copy = (Puzzle91Sub) deepCopy(puzzle91Sub);
        copy.checkInvariant();
    }

    // Copies its argument via serialization (See Puzzle 83)
    static public Object deepCopy(Object obj) {
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

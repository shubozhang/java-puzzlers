package com.guava.g02collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashMap;
import java.util.Map;

public class G02NewCollection {


    public static void main(String[] args) {
        testJavaImplementation();
        testMultiset();
    }

    private static void testJavaImplementation() {
        System.out.println("testing java");
        char[] letters = { 'A', 'B', 'C', 'A', 'C' };
        Map<Character, Integer> nameToCount = new HashMap<Character, Integer>();
        for (Character letter : letters) {
            Integer count = nameToCount.get(letter);
            if (count == null) {
                nameToCount.put(letter, 1);
            } else {
                nameToCount.put(letter, count + 1);
            }
        }

        System.out.println(nameToCount.get('A'));
        System.out.println(nameToCount.get('B'));
        System.out.println(nameToCount.get('C'));
    }

    private static void testMultiset() {
        System.out.println("testing multiset");
        char[] letters = { 'A', 'B', 'C', 'A', 'C' };
        Multiset multiset = HashMultiset.create();
        for (Character letter : letters) {
            multiset.add(letter);
        }

        System.out.println(multiset.count('A'));
        System.out.println(multiset.count('B'));
        System.out.println(multiset.count('C'));
        System.out.println(multiset.elementSet());
        System.out.println(multiset.size());
        System.out.println(multiset.setCount("A",4));
        multiset.add("A");
        multiset.add("A");
        System.out.println(multiset.count('A'));
        System.out.println(multiset.size());
    }
}

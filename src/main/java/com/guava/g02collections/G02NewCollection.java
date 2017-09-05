package com.guava.g02collections;

import com.google.common.collect.*;
import com.guava.util.BA;
import com.guava.util.Dev;
import com.guava.util.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G02NewCollection {


    public static void main(String[] args) {
        testJavaImplementation();
        testMultiset();
        testMultimap();
    }

    private static void testJavaImplementation() {
        System.out.println("testing in java: counting letters");
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
        System.out.println(multiset.setCount('A',4));
        multiset.add('A');
        multiset.add('A');
        System.out.println(multiset.count('A'));
        System.out.println(multiset.size());
    }

    //A Multimap is a general way to associate keys with arbitrarily many values.
    private static void testMultimap() {
        ListMultimap<String,Employee> multimap = LinkedListMultimap.create();
        Dev dev1 = new Dev(100,"A B");
        Dev dev2 = new Dev(101,"C D");

        BA ba1 = new BA(1000,"AA BB");
        BA ba2 = new BA(1001,"CC DD");

        // add the same key with different employee
        multimap.put("Dev",dev1);
        multimap.put("Dev",dev2);
        multimap.put("BA", ba1);
        multimap.put("BA", ba2);

        // add duplicate entries
        multimap.put("Dev",dev1);
        multimap.put("Dev",dev2);

        // add null key
        multimap.put(null,dev1);


        multimap.get("Dev").stream().forEach(System.out::println);
        multimap.get("BA").stream().forEach(System.out::println);
        multimap.get(null).stream().forEach(System.out::println);
    }
    /*
    * A BiMap<K, V> is a Map<K, V> that
    * 1) allows you to view the "inverse" BiMap<V, K> with inverse()
    * 2) ensures that values are unique, making values() a Set
    * */
    private static void testBimap() {

    }
}

package com.puzzlers.chap08.morelibrarypuzzlers;

import com.puzzlers.util.Puzzle78Api;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. The problem isn’t the access level of the method; it’s the access level of the
 *    type from which the method is selected
 *
 * 2. You cannot legally access a member of a nonpublic type from another package
 *
 * 3. Although common, the idiom object.getClass().getMethod("methodName") is broken
 *    and should not be used.
 *
 *
 * 4. It is commonly used in Service Provider Frameworks. This pattern does not solve every
 * problem that demands reflective access, but if it solves your problem, by all means use it.
 *
 *
 * 5. In summary, it is illegal to access a member of a nonpublic type in a different
 *    package, even if the member is also declared public in a public type. This is true
 *    whether the member is accessed normally or reflectively. The problem is likely to
 *    manifest itself only in reflective access.
 */
public class Puzzle78ReflectionInfection {

    public static void main(String[] args) throws Exception {
        test01();

        test02();

        test03();
    }

    // IllegalAccessException
    private static void test01() throws Exception{
        Set<String> s = new HashSet<String>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod("hasNext");
        System.out.println(m.invoke(it));
    }


    private static void test02() throws Exception{
        Set<String> s = new HashSet<String>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = Iterator.class.getMethod("hasNext");
        System.out.println(m.invoke(it));
    }


    /*
    * The problem is that the hashCode method is invoked with a qualifying
    * type that is inaccessible to the client. The qualifying type of the method invocation
    * is library.Api.PackagePrivate, which is a nonpublic class in a different
    * package.
    * */
    private static void test03() {
        // Compile error:
        //System.out.println(Puzzle78Api.member.hashCode());

        // Correct
        System.out.println(((Object) Puzzle78Api.member).hashCode());
    }
}

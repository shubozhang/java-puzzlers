package com.guava.g01basicutilities;

import com.google.common.base.Optional;

/**
 * It forces you to actively think about the absent case if you want your program to compile at all,
 * since you have to actively unwrap the Optional and address that case.
 */
public class G01Optional {
    public static void main(String[] args) {
        test01();

        test02();
    }

    private static void test01() {
        Optional<Integer> optVal = Optional.of(5);
        System.out.println(optVal.isPresent());
        System.out.println(optVal.get());
        System.out.println(optVal.orNull());

    }

    private static void test02() {
        String name = "name";
        java.util.Optional op = java.util.Optional.ofNullable(name);
        System.out.println(op.isPresent());
        System.out.println(op.orElse("default"));
    }
}

package com.puzzlers.chap02.character;

/**
 * The + operator performs string concatenation if and only if at least one of its operands is of type String;
 * Otherwise, the type of each of the operands of the + operator must be a type that is convertible
 * (§5.1.8)to a primitive numeric type, or a compile-time error occurs.
 */
public class Puzzler11LastLaugh {

    public static void main(String[] args) {

        System.out.println("H" + "a");
        System.out.println('H' + 'a'); // char will be converted to int (a primitive numeric type)

        test1();
        test2();
        test3();
    }

    //This works, but it's ugly
    private static void test1() {
        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);
    }

    private static void test2() {
        System.out.println("" + 'H' + 'a');
        System.out.printf("%c%c\n", 'H', 'a');
    }

    private static void test3() {
        System.out.println("2 + 2 = " + 2 + 2);
    }
}

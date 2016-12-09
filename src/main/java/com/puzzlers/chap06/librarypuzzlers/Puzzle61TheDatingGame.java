package com.puzzlers.chap06.librarypuzzlers;

import java.util.Calendar;
import java.util.Date;

/**
 * 1. Date instances were mutable before JDK 8
 * 2. Date represents January as 0, and Calendar perpetuates this mistake
 * 3. Date.getDay returns the day of the week represented by the Date instance, not the day of the month
 */
public class Puzzle61TheDatingGame {

    public static void main(String[] args) {
        test01();
        test02();
    }

    private static void test01() {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 12, 31); // Year, Month, Day
        System.out.print(cal.get(Calendar.YEAR) + " ");
        Date d = cal.getTime();
        System.out.println(d.getDay());
    }

    private static void test02() {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, Calendar.DECEMBER, 31);
        System.out.print(cal.get(Calendar.YEAR) + " ");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}

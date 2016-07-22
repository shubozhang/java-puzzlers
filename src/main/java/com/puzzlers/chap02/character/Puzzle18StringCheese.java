package com.puzzlers.chap02.character;

import java.io.UnsupportedEncodingException;

/**
 * every time you translate a byte sequence to a String, you are using a charset,
 * whether you specify it explicitly or not.
 */
public class Puzzle18StringCheese {

    public static void main(String[] args) {
        byte[] bytes = new byte[256];
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = null;
        String str1 = null;
        try {
            str = new String(bytes);
            str1 = new String(bytes, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for(int i = 0, n = str.length(); i < n; i++) {
            System.out.print((int)str.charAt(i) + " ");
        }

        System.out.println("==============================");
        for(int i = 0, n = str1.length(); i < n; i++) {
            System.out.print((int)str1.charAt(i) + " ");
        }
    }
}

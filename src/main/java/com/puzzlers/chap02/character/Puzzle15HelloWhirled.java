package com.puzzlers.chap02.character;


/*
* 1. Unicode escapes must be well formed, even if they appear in comments.
* 2. In summary, ensure that the characters \\u do not occur outside the
* context of a valid Unicode escape, even in comments. Be particularly wary of this problem in machine-generated code.
*/
public class Puzzle15HelloWhirled {

    public static void main(String[] args) {
        System.out.print("Hell");
        System.out.println("o world");
    }
}

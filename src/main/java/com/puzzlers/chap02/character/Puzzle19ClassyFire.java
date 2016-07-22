package com.puzzlers.chap02.character;

/**
 * The best way to comment out a section of code is to use a sequence of single-line comments.
 *
 * In summary, a block comment does not reliably comment out a section of code.
 */
public class Puzzle19ClassyFire {

    public static void main(String[] args) {
        System.out.println(
                classify('n') + classify('+') + classify('2'));
    }
    static String classify(char ch) {
        if ("0123456789".indexOf(ch) >= 0)
            return "NUMERAL ";
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
            return "LETTER ";
// (Operators not supported yet)
//if ("+-*/&|!=".indexOf(ch) >= 0)
  //      return "OPERATOR ";
   //     */
        return "UNKNOWN ";
    }
}

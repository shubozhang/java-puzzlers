package com.puzzlers.chap09.advancedpuzzlers;

/**
 * An inner class of a generic class has access to the type parameters of its
 outer class.
 */
public class Puzzle89GenericDrugs<E> {

    private MyNode head = null;

    private class MyNode {
        E value;
        MyNode next;
        // MyNode constructor links the MyNode as a new head
        MyNode(E value) {
            this.value = value;
            this.next = head;
            head = this;
        }
    }
    public void add(E e) {
        new MyNode(e);
// Link MyNode as new head
    }
    public void dump() {
        for (MyNode n = head; n != null; n = n.next)
            System.out.print(n.value + " ");
    }
    public static void main(String[] args) {
        Puzzle89GenericDrugs<String> list = new Puzzle89GenericDrugs<String>();
        list.add("world");
        list.add("Hello");
        list.dump();
    }
}

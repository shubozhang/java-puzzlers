package com.puzzlers.chap09.advancedpuzzlers;

/**
 * An inner class of a generic class has access to the type parameters of its
 outer class.
 */
public class Puzzle89GenericDrugs<E> {

    private Node<E> head = null;
    private class Node<E> {
        E value;
        Node<E> next;
        // Node constructor links the node as a new head
        Node(E value) {
            this.value = value;
            this.next = head;
            head = this;
        }
    }
    public void add(E e) {
        new Node<E>(e);
// Link node as new head
    }
    public void dump() {
        for (Node<E> n = head; n != null; n = n.next)
            System.out.print(n.value + " ");
    }
    public static void main(String[] args) {
        Puzzle89GenericDrugs<String> list = new Puzzle89GenericDrugs<String>();
        list.add("world");
        list.add("Hello");
        list.dump();
    }
}

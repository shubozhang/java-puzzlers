package com.puzzlers.chap09.advancedpuzzlers;


/*
*
* inner classes of generic classes have access to the enclosing
class’s type parameters, which can be confusing. The misunderstanding illustrated
in this puzzle is common among programmers first learning generics. It isn’t necessarily
wrong to have an inner class in a generic class, but the need for this is
rare, and you should consider refactoring your code to avoid it. When you have
one generic class nested inside another, give their type parameters different
names, even if the nested class is static.
* */
public class Puzzle89GenericDrugs2<E> {

    private Node<E> head = null;

    private static class Node<T> {
        T value; Node<T> next;
        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(E e) {
        head = new Node<E>(e, head);
    }
    public void dump() {
        for (Node<E> n = head; n != null; n = n.next)
            System.out.print(n.value + " ");
    }

}

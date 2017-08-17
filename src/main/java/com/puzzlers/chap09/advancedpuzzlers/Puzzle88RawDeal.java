package com.puzzlers.chap09.advancedpuzzlers;

import java.util.Arrays;
import java.util.List;

/**
 * 1. A raw type is simply the name of a generic class or interface without any type parameters.
 * For example, List<E> is a generic interface, List<String> is a parameterized type, and List is a raw type.
 *
 * 2. The raw type List is not the same as the parameterized type List<Object>. If the raw type is used, the compiler has no
 idea whether there are any restrictions on the type of elements permitted by the
 list, but it lets you insert elements of any type. This is not typesafe: If you insert an
 object of the wrong type, you may get a ClassCastException at any point in the
 future execution of the program. If the parameterized type List<Object> is used,
 the compiler knows that the list is allowed to contain elements of all types, so it is
 safe to let you insert any object.
 *
 * 3. A raw type is like its parameterized counterpart, but all its instance members
 * are replaced by their erased counterparts
 *
 *
 * 4. List<?> is a special kind of parameterized type known as a wildcard type. Like the raw type List, the
 *   compiler does not know what type of element is permitted, but because List<?> is
 *   a parameterized type, the language requires stronger type-checking. To avoid the
 *   possibility of a ClassCastException, the compiler won’t let you insert any element
 *   except null into a list of type List<?>.
 */
public class Puzzle88RawDeal<T> {
    private final T first;
    private final T second;

    public Puzzle88RawDeal(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T first() {
        return first;
    }
    public T second() {
        return second;
    }

    //The compiler interprets the program as if this method returned the raw type List.
    public List<String> stringList() {
        return Arrays.asList(String.valueOf(first), String.valueOf(second));
    }

}
package com.puzzlers.chap05.classypuzzlers;

/**
 * 1. Java’s overload resolution process operates in two phases. The first phase
 * selects all the methods or constructors that are accessible and applicable. The second
 * phase selects the most specific of the methods or constructors selected in the
 * first phase. One method or constructor is less specific than another if it can accept
 * any parameters passed to the other
 *
 * 2. To force the compiler to select a specific overloading,
 * cast actual parameters to the declared types of the formal parameters.
 *
 * 3. overload resolution can be confusing. Avoid overloading where possible.
 *
 * 4. If you must overload, ensure that all overloadings accept mutually incompatible
 * parameter types, so that no two are applicable at the same time.
 *
 * 5. Or, Consider static factory methods instead of constructors
 */
public class Puzzle46ConfusingConstructor {

    private Puzzle46ConfusingConstructor(Object o) {
        System.out.println("Object");
    }
    private Puzzle46ConfusingConstructor(double[] dArray) {
        System.out.println("double array");
    }
    public static void main(String[] args) {
        new Puzzle46ConfusingConstructor(null);

        new Puzzle46ConfusingConstructor((Object)null);
    }
}



/*
public class Services {
    private Services() {
    }
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException(
                    "No provider registered with name: " + name);
        return p.newService();
    }
}*/

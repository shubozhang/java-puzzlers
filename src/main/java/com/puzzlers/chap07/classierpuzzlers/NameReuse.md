

Overriding
An instance method overrides all accessible instance methods with the same signature
in superclasses [JLS 8.4.8.1], enabling dynamic dispatch; in other words,
the VM chooses which overriding to invoke based on an instance’s run-time type
[JLS 15.12.4.4]. Overriding is fundamental to object-oriented programming and is
the only form of name reuse that is not generally discouraged:

```
class Base {
public void f() { }
}
class Derived extends Base {
public void f() { } // overrrides Base.f()
}
```

Hiding
A field, static method, or member type hides all accessible fields, static methods, or
member types, respectively, with the same name (or, for methods, signature) in
supertypes. Hiding a member prevents it from being inherited [JLS 8.3, 8.4.8.2, 8.5]:

```
class Base {
public static void f() { }
}
class Derived extends Base {
public static void f() { } // hides Base.f()
}
```



Overloading
Methods in a class overload one another if they have the same name and different
signatures. The overloaded method designated by an invocation is selected at
compile time [JLS 8.4.9, 15.12.2]:
```
class CircuitBreaker {
public void f(int i) { } // int overloading
public void f(String s) { } // String overloading
}
```



Shadowing
A variable, method, or type shadows all variables, methods, or types, respectively,
with the same name in a textually enclosing scope. If an entity is shadowed, you
cannot refer to it by its simple name; depending on the entity, you cannot refer to
it at all [JLS 6.3.1]:

```
class WhoKnows {
static String sentence = "I don’t know.";
public static void main(String[] args) {
String sentence = "I know!"; // shadows static field
System.out.println(sentence); // prints local variable
}
}
```



Obscuring
A variable obscures a type with the same name if both are in scope: If the name is
used where variables and types are permitted, it refers to the variable. Similarly, a
variable or a type can obscure a package. Obscuring is the only kind of name reuse
where the two names are in different namespaces: variables, packages, methods,
or types. If a type or a package is obscured, you cannot refer to it by its simple
name except in a context where the syntax allows only a name from its
namespace. Adhering to the naming conventions largely eliminates obscuring
[JLS 6.3.2, 6.5]:

```
public class Obscure {
static String System; // Obscures type java.lang.System
public static void main(String[] args) {
// Next line won’t compile: System refers to static field
System.out.println("hello, obscure world!");
}
}
```
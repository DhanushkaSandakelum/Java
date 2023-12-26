## Generics

Generics in Java provide a way to create classes, interfaces, and methods that operate on objects of various types while providing compile-time type safety. They allow you to define classes with placeholder types that are specified when the class is instantiated. This helps in creating more flexible and reusable code by writing classes and methods that can work with any data type.

The main advantages of using generics in Java include:

1. **Type Safety:** Generics enable you to catch type errors at compile time rather than at runtime. This helps in identifying and fixing issues before the code is executed.

2. **Code Reusability:** With generics, you can create classes and methods that can work with a variety of data types without sacrificing type safety. This promotes code reusability.

3. **Reduced Code Duplication:** Generics allow you to write more generic code that works for multiple types, reducing the need for duplicated code for different types.

### Type Parameters in Generics

In Java generics, `T` is a type parameter. It is a placeholder for the actual data type that will be specified when a generic class, method, or interface is used or instantiated. The letter T is commonly used as a convention, though any valid Java identifier can be used as a type parameter.

For example, in the context of a generic class like the following:

```java
public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```
# Interface Segregate Principle (ISP)


The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it does not use. In other words, it suggests that a class should only be required to implement the methods that are relevant to its behavior and not be burdened with unnecessary methods.

Let's consider an example involving a simple set of interfaces related to a document management system:

```java
// Separate interfaces to adhere to ISP

// EditableDocument.java
interface EditableDocument {
    void create();

    void edit();

    void save();
}

// Scanner.java
interface Scanner {
    void scan();
}

// Printer.java
interface Printer {
    void print();
}

// Photocopier.java
interface Photocopier {
    void photocopy();
}

// AllInOneMachine.java
class AllInOneMachine implements EditableDocument, Scanner, Printer, Photocopier {
    // Implement only the interfaces needed
    // The class is not forced to implement unnecessary methods
    // ...
}

```


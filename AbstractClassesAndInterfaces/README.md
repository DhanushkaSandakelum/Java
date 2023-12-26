# Abstract Classes & Interfaces
Interfaces and abstract classes are both mechanisms in Java for achieving abstraction and defining contracts, but they have some key differences. Here are the main distinctions between interfaces and abstract classes:

## Abstract Classes
- Abstract classes can have both abstract (methods without a body) and concrete (methods with a body) members.
- Abstract classes can have instance variables (fields).
- Abstract classes can have constructors.
- A class can extend only one abstract class.

## Interfaces
- Interfaces can only have abstract methods (methods without a body) and constants (public static final fields).
- Starting from Java 8, interfaces can have default and static methods (with a body).
- All interface members are implicitly public, and fields are implicitly public, static, and final.
- A class can implement multiple interfaces.

## Key Points
### Multiple Inheritance:
1. A class can extend only one abstract class, but it can implement multiple interfaces.
2. This allows for a form of multiple inheritance through interfaces, where a class can inherit the method signatures from multiple sources.

### Constructor Inheritance:
1. Abstract classes can have constructors, and when a concrete subclass is created, it must call the constructor of the abstract class using the super keyword.
2. Interfaces, on the other hand, cannot have constructors.

## Usage
- Use **abstract classes** when you have a common base class and want to provide some common functionality among its subclasses.
- Use **interfaces** when you want to define a contract that multiple unrelated classes can implement.

## Implementation
- **Abstract classes** are typically used for `"is-a"` relationships, where a subclass is a specific type of the superclass.
- **Interfaces** are used for `"has-a"` relationships or to define common behavior that can be implemented by unrelated classes.
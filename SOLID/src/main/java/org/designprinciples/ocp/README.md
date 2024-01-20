# Open/Closed Principle


The Open/Closed Principle (OCP) states that software entities (such as classes, modules, functions) should be open for extension but closed for modification. In other words, you should be able to extend the behavior of a module without modifying its source code.

Here's a simple Java example to illustrate the Open/Closed Principle using a shape drawing scenario:

```java
// Shape.java
interface Shape {
    void draw();
}

// Circle.java
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Square.java
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// ShapeDrawer.java
class ShapeDrawer {
    // This method is open for extension (can support new shapes)
    // but closed for modification (no need to change this class when adding new shapes)
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// Main.java (or any other class where you want to use these functionalities)
public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        // Drawing a circle without modifying ShapeDrawer
        shapeDrawer.drawShape(new Circle());

        // Drawing a square without modifying ShapeDrawer
        shapeDrawer.drawShape(new Square());

        // Adding a new shape (Triangle) without modifying ShapeDrawer
        class Triangle implements Shape {
            @Override
            public void draw() {
                System.out.println("Drawing a triangle");
            }
        }

        shapeDrawer.drawShape(new Triangle());
    }
}

```

In this example:

- The `Shape` interface represents the common behavior for different shapes.
- The `Circle` and `Square` classes implement the `Shape` interface, each providing its own implementation of the `draw` method.
- The `ShapeDrawer` class has a `drawShape` method that takes any object implementing the `Shape` interface and draws it. This class is open for extension because you can add new shapes without modifying its code.

By adhering to the Open/Closed Principle, you can introduce new shapes (like the `Triangle` class in this case) without modifying existing code. This makes the system more maintainable and extensible.
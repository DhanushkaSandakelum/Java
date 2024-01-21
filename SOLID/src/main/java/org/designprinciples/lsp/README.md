The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. In other words, if a class is a subclass of another class, it should be able to be used interchangeably with its superclass without altering the program's behavior.

Here's a Java example to illustrate the Liskov Substitution Principle using a geometric shape scenario:

```java
// Shape.java
class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }
}

// Square.java
class Square extends Shape {
    public Square(int side) {
        super(side, side);
    }
}

// AreaCalculator.java
class AreaCalculator {
    public static int calculateArea(Shape shape) {
        return shape.getArea();
    }
}

// Main.java (or any other class where you want to use these functionalities)
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(7);

        // Calculate areas without knowing the specific shapes
        int rectangleArea = AreaCalculator.calculateArea(rectangle);
        int squareArea = AreaCalculator.calculateArea(square);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
    }
}

```

In this example:

- The `Shape` class is a base class representing a generic geometric shape with width and height.
- The `Rectangle` and `Square` classes are subclasses of `Shape`, representing specific shapes.
- The `AreaCalculator` class has a method `calculateArea` that takes a `Shape` parameter and calculates the area of the shape.

Even though `Square` is a subclass of `Shape`, it can be substituted for `Shape` in the `calculateArea` method without affecting the correctness of the program. This adheres to the Liskov Substitution Principle, allowing subclasses to be used interchangeably with their base class.
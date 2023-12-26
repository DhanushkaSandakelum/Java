import objects.Cylinder;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Using Shape interface methods
        System.out.println("\n--- Interfaces ---");
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\n--- Abstract Classes ---");
        Cylinder cylinder = new Cylinder(8.0, 6.0);
        cylinder.displayInfo();
    }
}
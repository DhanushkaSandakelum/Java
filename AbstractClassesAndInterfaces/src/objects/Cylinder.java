package objects;

import shapes.Circle;
import shapes.Rectangle;

public class Cylinder extends Object{
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        super();
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        Circle circle = new Circle(this.radius);

        return circle.calculateArea() * height;
    }

    @Override
    public double calculateObjectArea() {
        Circle circle = new Circle(this.radius);
        Rectangle rectangle = new Rectangle(circle.calculatePerimeter(), this.height);

        return circle.calculateArea() + rectangle.calculateArea();
    }
}

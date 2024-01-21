package org.designprinciples.lsp.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(7);

        // Calculate the area without knowing the specific shape
        int recArea = AreaCalculator.calculateArea(rectangle);
        int squArea = AreaCalculator.calculateArea(square);

        System.out.println("Rectangle Area: " + recArea);
        System.out.println("Square Area: " + squArea);
    }
}

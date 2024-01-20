package org.designprinciples.ocp.shapes;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        shapeDrawer.drawShape(new Square());
        shapeDrawer.drawShape(new Circle());
    }
}

package org.designprinciples.ocp.shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

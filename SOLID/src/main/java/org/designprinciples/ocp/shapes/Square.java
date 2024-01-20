package org.designprinciples.ocp.shapes;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

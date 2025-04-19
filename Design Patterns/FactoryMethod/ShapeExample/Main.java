package FactoryMethod.ShapeExample;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory;

        shapeFactory = new CircleFactory();
        Shape circle = shapeFactory.createShape();
        circle.draw();

        shapeFactory = new RectangleFactory();
        Shape rectangle = shapeFactory.createShape();
        rectangle.draw();

        shapeFactory = new TriangleFactory();
        Shape triangle = shapeFactory.createShape();
        triangle.draw();
    }
}

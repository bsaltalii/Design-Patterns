package FactoryMethod.ShapeExample;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle drawn.");
    }
}

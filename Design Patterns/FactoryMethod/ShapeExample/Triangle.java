package FactoryMethod.ShapeExample;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Triangle drawn.");
    }
}

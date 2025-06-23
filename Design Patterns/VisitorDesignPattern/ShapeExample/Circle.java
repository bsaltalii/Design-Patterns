package VisitorDesignPattern.ShapeExample;

public class Circle implements Shape{
    double radius = 5.0;
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

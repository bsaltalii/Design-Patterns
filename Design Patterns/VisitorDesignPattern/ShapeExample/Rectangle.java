package VisitorDesignPattern.ShapeExample;

public class Rectangle implements Shape {
    double width = 10.0;
    double height = 4.0;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

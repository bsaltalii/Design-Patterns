package VisitorDesignPattern.ShapeExample;

public interface Shape {
    void accept(ShapeVisitor visitor);
}

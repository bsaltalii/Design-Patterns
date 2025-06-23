package VisitorDesignPattern.ShapeExample;

public class DrawingVisitor implements ShapeVisitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing circle with radius : " + circle.radius);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing rectangle width : " + rectangle.width + " height : "+rectangle.height);
    }
}

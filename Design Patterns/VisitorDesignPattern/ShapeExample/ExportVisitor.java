package VisitorDesignPattern.ShapeExample;

public class ExportVisitor implements ShapeVisitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("Exporting circle : <circle r=\"" + circle.radius + "\" />");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Exporting rectangle: <rect w=\"" + rectangle.width + "\" h=\"" + rectangle.height + "\" />");
    }
}

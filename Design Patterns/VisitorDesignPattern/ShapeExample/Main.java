package VisitorDesignPattern.ShapeExample;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeVisitor drawVisitor = new DrawingVisitor();
        ShapeVisitor exportVisitor = new ExportVisitor();

        System.out.println("----Drawing----");
        circle.accept(drawVisitor);
        rectangle.accept(drawVisitor);

        System.out.println("\n----Exporting----");
        circle.accept(exportVisitor);
        rectangle.accept(exportVisitor);
    }
}

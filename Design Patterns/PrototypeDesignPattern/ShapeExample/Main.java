package PrototypeDesignPattern.ShapeExample;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"Red");
        System.out.println(circle);
        Shape circle1 = circle.clone();
        System.out.println("Cloned circle : ");
        System.out.println(circle1);

        Rectangle rectangle = new Rectangle(3,4,"Blue");
        System.out.println(rectangle);
        Shape rectangle1 = rectangle.clone();
        System.out.println("Cloned rectangle : ");
        System.out.println(rectangle1);
    }
}

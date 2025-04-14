package LiskovSubstitutionPrinciple;

//public class Shape {
//    public void setWidth(double width){}
//    public void setHeight(double height){}
//    public double area(){ return 0; }
//
//    public static void main(String[] args) {
//        Shape shape = new Square();
//        shape.setWidth(5);
//        shape.setHeight(10);
//
//        System.out.println("Area: " + shape.area()); // Expected 50 but this would return 100 due to the violation.
//    }
//}
//
//class Rectangle extends Shape{
//    private double height;
//    private double width;
//
//    @Override
//    public void setWidth(double width){
//        this.width=width;
//    }
//    @Override
//    public void setHeight(double height){
//        this.height=height;
//    }
//    @Override
//    public double area(){
//        return width*height;
//    }
//}
//
//
//class Square extends Rectangle {
//    @Override
//    public void setWidth(double width) {
//        this.width = width;
//        this.height = width;
//    }
//
//    @Override
//    public void setHeight(double height) {
//        this.height = height;
//        this.width = height;
//    }
//}

class Rectangle implements Shape{
    private double height;
    private double width;
    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double area() {
        return height*width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
}

class Square implements Shape{
    private double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public double area() {
        return side*side;
    }
}

class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape square = new Square(5);

        System.out.println("Rectangle area : " + rectangle.area());
        System.out.println("Square area : " + square.area());
    }
}

//What we did:
//Instead of forcing the Square class to inherit from Rectangle,
// we separated the Rectangle and Square into distinct classes,
// both implementing the Shape interface.
//Now, Square does not inherit from Rectangle,
//which means each class handles its own behavior properly and independently.
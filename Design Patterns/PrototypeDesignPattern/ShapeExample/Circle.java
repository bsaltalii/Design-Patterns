package PrototypeDesignPattern.ShapeExample;

public class Circle implements Shape{
    int radius;
    String color;
    public Circle(int radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(Circle circle){
        this.radius = circle.radius;
        this.color = circle.color;
    }
    @Override
    public Shape clone() {
        return (this);
    }
    @Override
    public String toString(){
        return "Radius : " + radius + " Color : "+ color;
    }
}

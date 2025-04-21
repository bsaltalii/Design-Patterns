package PrototypeDesignPattern.ShapeExample;

public class Rectangle implements Shape{
    int width;
    int height;
    String color;

    public Rectangle(int width,int height,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public Rectangle(Rectangle rectangle){
        this.width=rectangle.width;
        this.height= rectangle.height;
        this.color= rectangle.color;
    }

    @Override
    public Shape clone() {
        return (this);
    }

    @Override
    public String toString(){
        return "Width : " + width + " Height : "+ height + " Color : "+ color;
    }
}

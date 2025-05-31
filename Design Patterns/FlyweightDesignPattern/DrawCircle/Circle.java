package FlyweightDesignPattern.DrawCircle;

public class Circle implements Shape{
    private final String color;

    public Circle(String color){
        this.color=color;
    }

    public void draw(int x,int y){
        System.out.println("Draw " + color + " circle at (" + x + ","+ y + ")");
    }
}

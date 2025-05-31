package FlyweightDesignPattern.DrawCircle;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Red","Green"};

        for (String color : colors){
            Shape circle = ShapeFactory.getCircle(color);
            int x = (int)(Math.random()*100);
            int y = (int)(Math.random()*100);
            circle.draw(x,y);
        }
    }
}

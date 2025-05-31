package FlyweightDesignPattern.DrawCircle;

import java.util.*;

public class ShapeFactory {
    private static final Map<String ,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        if (!circleMap.containsKey(color)){
            circleMap.put(color,new Circle(color));
            System.out.println("Creating new " + color + " circle");
        }
        return circleMap.get(color);
    }
}

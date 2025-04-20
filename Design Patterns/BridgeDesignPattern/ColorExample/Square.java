package BridgeDesignPattern.ColorExample;

import BridgeDesignPattern.ColorExample.Color;
import BridgeDesignPattern.ColorExample.Shape;

public class Square extends Shape {
    public Square(Color color){
        super(color);
    }
    @Override
    void draw() {
        System.out.print("Drawing Square with color : ");
        color.applyColor();
    }
}

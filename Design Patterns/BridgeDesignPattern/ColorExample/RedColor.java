package BridgeDesignPattern.ColorExample;

import BridgeDesignPattern.ColorExample.Color;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color.");
    }
}

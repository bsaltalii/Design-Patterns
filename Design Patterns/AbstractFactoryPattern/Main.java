package AbstractFactoryPattern;

import AbstractFactoryPattern.Button.Button;
import AbstractFactoryPattern.Checkbox.Checkbox;
import AbstractFactoryPattern.Factories.GUIFactory;
import AbstractFactoryPattern.Factories.MacOSFactory;
import AbstractFactoryPattern.Factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        factory = new MacOSFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}

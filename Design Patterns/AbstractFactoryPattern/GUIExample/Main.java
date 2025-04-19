package AbstractFactoryPattern.GUIExample;

import AbstractFactoryPattern.GUIExample.Button.Button;
import AbstractFactoryPattern.GUIExample.Checkbox.Checkbox;
import AbstractFactoryPattern.GUIExample.Factories.GUIFactory;
import AbstractFactoryPattern.GUIExample.Factories.MacOSFactory;
import AbstractFactoryPattern.GUIExample.Factories.WindowsFactory;

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

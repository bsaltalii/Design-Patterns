package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Button.Button;
import AbstractFactoryPattern.Button.MacOSButton;
import AbstractFactoryPattern.Checkbox.Checkbox;
import AbstractFactoryPattern.Checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

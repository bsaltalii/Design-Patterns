package AbstractFactoryPattern.GUIExample.Factories;

import AbstractFactoryPattern.GUIExample.Button.Button;
import AbstractFactoryPattern.GUIExample.Button.MacOSButton;
import AbstractFactoryPattern.GUIExample.Checkbox.Checkbox;
import AbstractFactoryPattern.GUIExample.Checkbox.MacOSCheckbox;

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

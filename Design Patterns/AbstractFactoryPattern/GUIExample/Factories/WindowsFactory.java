package AbstractFactoryPattern.GUIExample.Factories;

import AbstractFactoryPattern.GUIExample.Button.Button;
import AbstractFactoryPattern.GUIExample.Button.WindowsButton;
import AbstractFactoryPattern.GUIExample.Checkbox.Checkbox;
import AbstractFactoryPattern.GUIExample.Checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

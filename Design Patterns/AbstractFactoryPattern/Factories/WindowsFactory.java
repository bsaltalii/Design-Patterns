package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Button.Button;
import AbstractFactoryPattern.Button.WindowsButton;
import AbstractFactoryPattern.Checkbox.Checkbox;
import AbstractFactoryPattern.Checkbox.WindowsCheckbox;

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

package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Button.Button;
import AbstractFactoryPattern.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

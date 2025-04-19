package AbstractFactoryPattern.GUIExample.Factories;

import AbstractFactoryPattern.GUIExample.Button.Button;
import AbstractFactoryPattern.GUIExample.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

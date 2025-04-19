package AbstractFactoryPattern.GUIExample.Checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows Checkbox created..");
    }
}
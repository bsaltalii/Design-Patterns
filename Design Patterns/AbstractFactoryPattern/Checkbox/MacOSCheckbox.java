package AbstractFactoryPattern.Checkbox;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("MacOS Checkbox created..");
    }
}

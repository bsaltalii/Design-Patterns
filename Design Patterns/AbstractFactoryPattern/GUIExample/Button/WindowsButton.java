package AbstractFactoryPattern.GUIExample.Button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("WindowsButton Button created..");
    }
}

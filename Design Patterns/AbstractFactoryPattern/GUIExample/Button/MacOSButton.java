package AbstractFactoryPattern.GUIExample.Button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS Button created..");
    }
}

package MediatorDesignPattern.ComponentExample;

public class TextBox extends Component{
    private boolean enabled = true;
    public TextBox(Mediator mediator) {
        super(mediator);
    }
    public void setEnabled(boolean state){
        enabled = state;
        System.out.println("[TextBox] " + ( enabled ? "Enabled" : "Disabled"));
    }
}

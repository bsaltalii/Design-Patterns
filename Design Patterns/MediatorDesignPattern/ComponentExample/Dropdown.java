package MediatorDesignPattern.ComponentExample;

public class Dropdown extends Component{
    private boolean visible = false;
    public Dropdown(Mediator mediator) {
        super(mediator);
    }
    public void setVisible(boolean state){
        visible = state;
        System.out.println("[Dropdown] " + (visible ? "Shown" : "Hidden"));
    }
}

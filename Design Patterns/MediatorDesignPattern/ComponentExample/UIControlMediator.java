package MediatorDesignPattern.ComponentExample;

public class UIControlMediator implements Mediator{
    private Button button;
    private TextBox textBox;
    private Dropdown dropdown;
    public void register(Button b, TextBox t, Dropdown d){
        this.button = b;
        this.textBox = t;
        this.dropdown = d;
    }
    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")){
            textBox.setEnabled(false);
            dropdown.setVisible(true);
        }
    }
}

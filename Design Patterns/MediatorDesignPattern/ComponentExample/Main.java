package MediatorDesignPattern.ComponentExample;

public class Main {
    public static void main(String[] args) {
        UIControlMediator mediator = new UIControlMediator();

        Button button = new Button(mediator);
        TextBox textbox = new TextBox(mediator);
        Dropdown dropdown = new Dropdown(mediator);

        mediator.register(button, textbox, dropdown);

        button.click();
    }
}

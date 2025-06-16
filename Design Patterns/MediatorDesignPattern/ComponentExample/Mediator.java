package MediatorDesignPattern.ComponentExample;

public interface Mediator {
    void notify(Component sender, String event);
}

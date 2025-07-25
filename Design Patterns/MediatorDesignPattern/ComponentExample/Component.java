package MediatorDesignPattern.ComponentExample;

abstract class Component {
    protected Mediator mediator;
    public Component(Mediator mediator){
        this.mediator = mediator;
    }
}

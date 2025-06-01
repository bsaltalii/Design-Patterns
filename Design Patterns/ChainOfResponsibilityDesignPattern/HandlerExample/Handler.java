package ChainOfResponsibilityDesignPattern.HandlerExample;

abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next){
        this.next=next;
        return next;
    }
    public abstract void handle(String request);
}

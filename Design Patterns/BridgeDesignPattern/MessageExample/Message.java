package BridgeDesignPattern.MessageExample;

public abstract class Message {
    protected MessageSender sender;
    public Message(MessageSender sender){
        this.sender=sender;
    }
    abstract void send(String text);
}

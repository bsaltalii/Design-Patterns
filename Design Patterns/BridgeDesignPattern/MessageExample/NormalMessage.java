package BridgeDesignPattern.MessageExample;

public class NormalMessage extends Message{

    public NormalMessage(MessageSender sender){
        super(sender);
    }
    @Override
    void send(String text) {
        sender.sendMessage(text);
    }
}

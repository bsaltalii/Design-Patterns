package MediatorDesignPattern.ChatRoomExample;

public class ChatUser extends User{
    public ChatUser(ChatMediator mediator,String name){
        super(mediator,name);
    }
    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}

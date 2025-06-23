package MediatorDesignPattern.ChatRoomExample;

public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User onur = new ChatUser(chat,"Onur");
        User burak = new ChatUser(chat, "Burak");
        User ayse = new ChatUser(chat, "Ayşe");

        chat.addUser(onur);
        chat.addUser(burak);
        chat.addUser(ayse);

        onur.send("Selam millet!");
    }
}

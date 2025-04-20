package BridgeDesignPattern.MessageExample;

public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms = new SMSSender();

        Message msg1 = new NormalMessage(email);
        msg1.send("Project deadline is tomorrow.");

        Message msg2 = new UrgentMessage(sms);
        msg2.send("Server is down!");
    }
}

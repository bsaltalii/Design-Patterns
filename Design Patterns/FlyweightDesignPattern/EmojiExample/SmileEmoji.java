package FlyweightDesignPattern.EmojiExample;

public class SmileEmoji implements Emoji{
    @Override
    public void render(String user, int x, int y) {
        System.out.println("User : " + user + " sent :) at (" + x + "," + y + ")");
    }
}

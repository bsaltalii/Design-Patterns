package FlyweightDesignPattern.EmojiExample;

public class HeartEmoji implements Emoji{
    @Override
    public void render(String user, int x, int y) {
        System.out.println("User : " + user + " sent <3 at (" + x + "," + y + ")");
    }
}

package FlyweightDesignPattern.EmojiExample;

public class Main {
    public static void main(String[] args) {
        Emoji e1 = EmojiFactory.getEmoji("Heart");
        Emoji e2 = EmojiFactory.getEmoji("Heart");
        Emoji e3 = EmojiFactory.getEmoji("Smile");

        e1.render("Alice",10,20);
        e2.render("Bob",15,30);
        e3.render("Charlie",25,40);

        System.out.println("Same heart object? : " + (e1 == e2));
    }
}

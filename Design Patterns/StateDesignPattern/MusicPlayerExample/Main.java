package StateDesignPattern.MusicPlayerExample;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.pressPause();
        player.pressPlay();
        player.pressPlay();
        player.pressPause();
        player.pressPause();
        player.pressPlay();
    }
}

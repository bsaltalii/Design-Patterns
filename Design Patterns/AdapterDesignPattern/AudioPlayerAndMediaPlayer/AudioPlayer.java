package AdapterDesignPattern.AudioPlayerAndMediaPlayer;

public class AudioPlayer {
    private MediaPlayer player;

    public AudioPlayer(MediaPlayer player) {
        this.player = player;
    }

    public void play(String filename) {
        player.play(filename);
    }
}

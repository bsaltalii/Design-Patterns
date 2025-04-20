package AdapterDesignPattern.AudioPlayerAndMediaPlayer;

public class Main {
    public static void main(String[] args) {
        AdvancedMediaPlayer advanced = new AdvancedMediaPlayer();
        MediaPlayer adapter = new MediaAdapter(advanced);
        AudioPlayer player = new AudioPlayer(adapter);

        player.play("song.mp3");
    }
}

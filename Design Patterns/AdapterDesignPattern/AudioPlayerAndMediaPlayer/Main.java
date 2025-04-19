package AdapterDesignPattern.AudioPlayerAndMediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();

        player.play("mp3","song1.mp3");
        player.play("mp4","video1.mp4");
        player.play("avi","movie.avi");
    }
}

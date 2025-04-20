package AdapterDesignPattern.AudioPlayerAndMediaPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String filename) {
        System.out.println("Converting to mp4...");
        advancedPlayer.playMp4(filename);
    }
}

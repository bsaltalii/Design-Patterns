package AdapterDesignPattern.AudioPlayerAndMediaPlayer;

import AdapterDesignPattern.AudioPlayerAndMediaPlayer.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file : "+fileName);
    }
}

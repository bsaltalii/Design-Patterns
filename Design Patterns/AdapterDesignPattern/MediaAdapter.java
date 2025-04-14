package AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedPlayer;
    public MediaAdapter(String fileType){
        if (fileType.equalsIgnoreCase("mp4")){
            advancedPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp4")){
            advancedPlayer.playMp4(fileName);
        }
    }
}

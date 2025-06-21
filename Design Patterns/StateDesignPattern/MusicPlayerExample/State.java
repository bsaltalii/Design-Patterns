package StateDesignPattern.MusicPlayerExample;

public interface State {
    void pressPlay(MusicPlayer player);
    void pressPause(MusicPlayer player);
}

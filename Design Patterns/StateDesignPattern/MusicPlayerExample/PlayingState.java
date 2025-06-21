package StateDesignPattern.MusicPlayerExample;

public class PlayingState implements State{
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Already Playing");
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Paused the music");
        player.setState(new PausedState());
    }
}

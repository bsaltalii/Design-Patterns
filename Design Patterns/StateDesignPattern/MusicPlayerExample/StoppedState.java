package StateDesignPattern.MusicPlayerExample;

public class StoppedState implements State{
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Started playing.");
        player.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Can't pause. Music stopped.");
    }
}

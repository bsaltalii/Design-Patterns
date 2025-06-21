package StateDesignPattern.MusicPlayerExample;

public class PausedState implements State{
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Resumed the music.");
        player.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Music is already paused.");
    }
}

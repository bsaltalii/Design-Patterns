package StateDesignPattern.MusicPlayerExample;

public class MusicPlayer {
    private State state;

    public MusicPlayer(){
        this.state = new StoppedState();
    }

    public void setState(State state){
        this.state = state;
    }

    public void pressPlay(){
        state.pressPlay(this);
    }

    public void pressPause(){
        state.pressPause(this);
    }
}


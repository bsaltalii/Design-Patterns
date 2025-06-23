package CommandDesingPattern.TvControllerExample;

public class TurnOffCommand implements Command{
    private final TV tv;

    public TurnOffCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}

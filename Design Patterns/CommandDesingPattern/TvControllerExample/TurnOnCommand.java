package CommandDesingPattern.TvControllerExample;

public class TurnOnCommand implements Command{
    private final TV tv;
    public TurnOnCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}

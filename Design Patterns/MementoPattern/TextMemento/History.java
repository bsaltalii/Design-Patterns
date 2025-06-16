package MementoPattern.TextMemento;

public class History {
    private TextMemento savedState;
    public void backup(TextMemento m){
        savedState = m;
    }
    public TextMemento undo(){
        return savedState;
    }
}

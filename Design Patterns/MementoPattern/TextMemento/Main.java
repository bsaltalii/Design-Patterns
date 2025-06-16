package MementoPattern.TextMemento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello ");
        history.backup(editor.save());

        editor.type("World!");
        System.out.println("Before undo : " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After undo : " + editor.getText());
    }
}

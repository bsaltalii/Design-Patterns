package ProxyDesignPattern.DocumentExample;

public class RealDocument implements Document{
    private final String fileName;

    public RealDocument(String fileName){
        this.fileName=fileName;
        System.out.println("Loading file from disk : " + fileName);
    }
    @Override
    public void display(String user) {
        System.out.println(user + " is reading " + fileName);
    }
}

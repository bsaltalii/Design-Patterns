package ProxyDesignPattern.DocumentExample;

public class SecureDocumentProxy implements Document{
    private final String fileName;
    private RealDocument realDocument;

    public SecureDocumentProxy(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display(String user) {
        if (!user.equals("admin")){
            System.out.println("Access denied for user :" + user);
            return;
        }

        if (realDocument == null){
            realDocument = new RealDocument(fileName);
        }
        realDocument.display(user);
    }
}

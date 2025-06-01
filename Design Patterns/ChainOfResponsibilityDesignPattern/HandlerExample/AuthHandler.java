package ChainOfResponsibilityDesignPattern.HandlerExample;

public class AuthHandler extends Handler{
    @Override
    public void handle(String request) {
        if (request.equals("auth")){
            System.out.println("Handled by AuthHandler");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

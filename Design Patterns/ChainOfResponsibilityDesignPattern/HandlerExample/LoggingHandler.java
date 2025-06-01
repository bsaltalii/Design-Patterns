package ChainOfResponsibilityDesignPattern.HandlerExample;

public class LoggingHandler extends Handler{
    @Override
    public void handle(String request) {
        if (request.equals("log")){
            System.out.println("Handled by LoggingHandler");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

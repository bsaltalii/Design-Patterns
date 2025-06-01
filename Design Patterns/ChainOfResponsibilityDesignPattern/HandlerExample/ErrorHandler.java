package ChainOfResponsibilityDesignPattern.HandlerExample;

public class ErrorHandler extends Handler{
    @Override
    public void handle(String request) {
        if (request.equals("error")){
            System.out.println("Handled by ErrorHandler");
        }else{
            System.out.println("Request not handled.");
        }
    }
}

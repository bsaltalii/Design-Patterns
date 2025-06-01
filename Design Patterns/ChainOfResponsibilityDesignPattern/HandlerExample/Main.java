package ChainOfResponsibilityDesignPattern.HandlerExample;

public class Main {
    public static void main(String[] args) {
        Handler chain = new AuthHandler();
        chain.setNext(new LoggingHandler()).setNext(new ErrorHandler());

        chain.handle("auth");
        chain.handle("log");
        chain.handle("error");
        chain.handle("unknown");
    }
}

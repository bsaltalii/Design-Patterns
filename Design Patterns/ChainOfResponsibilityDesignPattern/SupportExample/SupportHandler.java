package ChainOfResponsibilityDesignPattern.SupportExample;

public interface SupportHandler {
    void setNext(SupportHandler next);
    void handle(String issue);
}

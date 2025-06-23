package ChainOfResponsibilityDesignPattern.SupportExample;

public class SuperviserSupport implements SupportHandler{
    private SupportHandler next;
    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String issue) {
        System.out.println("Supervisor handled (escalated) " + issue);
    }
}

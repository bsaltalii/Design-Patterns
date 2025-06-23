package ChainOfResponsibilityDesignPattern.SupportExample;

public class BasicSupport implements SupportHandler{
    private SupportHandler next;
    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String issue) {
        if (issue.contains("password")){
            System.out.println("BasicSupport handler : " + issue);
        } else if (next != null) {
            next.handle(issue);
        }else {
            System.out.println("No handler for: " + issue);
        }
    }
}

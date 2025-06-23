package ChainOfResponsibilityDesignPattern.SupportExample;

public class TechnicalSupport implements SupportHandler{
    private SupportHandler next;
    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String issue) {
        if (issue.contains("crash")){
            System.out.println("TechnicalSupport handled : " + issue);
        }else if(next != null){
            next.handle(issue);
        }else{
            System.out.println("No handler for : " +issue);
        }
    }
}

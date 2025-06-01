package ChainOfResponsibilityDesignPattern.ApprovalChainExample;

abstract class Approver {
    protected Approver next;

    public void setNext(Approver next) {
        this.next = next;
    }

    public void handleRequest(double amount) {
        if (canApprove(amount)) {
            approve(amount);
        } else if (next != null) {
            next.handleRequest(amount);
        } else {
            System.out.println("No one can approve this amount!");
        }
    }

    protected abstract boolean canApprove(double amount);
    protected abstract void approve(double amount);
}

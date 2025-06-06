package ChainOfResponsibilityDesignPattern.ApprovalChainExample;

class VicePresident extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 5000;
    }
    protected void approve(double amount) {
        System.out.println("Vice President approved $" + amount);
    }
}
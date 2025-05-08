package ChainOfResponsibilityDesignPattern;

class Director extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 10000;
    }
    protected void approve(double amount) {
        System.out.println("Director approved $" + amount);
    }
}
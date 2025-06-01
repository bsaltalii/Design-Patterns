package ChainOfResponsibilityDesignPattern.ApprovalChainExample;

import ChainOfResponsibilityDesignPattern.ApprovalChainExample.Approver;

class Manager extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 1000;
    }
    protected void approve(double amount) {
        System.out.println("Manager approved $" + amount);
    }
}
package ChainOfResponsibilityDesignPattern.ApprovalChainExample;

import ChainOfResponsibilityDesignPattern.ApprovalChainExample.Approver;

class President extends Approver {
    protected boolean canApprove(double amount) {
        return amount > 50000;
    }
    protected void approve(double amount) {
        System.out.println("President approved $" + amount);
    }
}
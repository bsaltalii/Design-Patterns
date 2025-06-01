package ChainOfResponsibilityDesignPattern.ApprovalChainExample;

import ChainOfResponsibilityDesignPattern.ApprovalChainExample.Approver;
import ChainOfResponsibilityDesignPattern.ApprovalChainExample.Director;
import ChainOfResponsibilityDesignPattern.ApprovalChainExample.Manager;
import ChainOfResponsibilityDesignPattern.ApprovalChainExample.President;
import ChainOfResponsibilityDesignPattern.ApprovalChainExample.VicePresident;

public class Main {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vp = new VicePresident();
        Approver president = new President();

        manager.setNext(director);
        director.setNext(vp);
        vp.setNext(president);

        manager.handleRequest(500);
        manager.handleRequest(8000);
        manager.handleRequest(20000);
        manager.handleRequest(100000);
    }
}

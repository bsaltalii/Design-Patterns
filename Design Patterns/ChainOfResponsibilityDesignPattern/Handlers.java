package ChainOfResponsibilityDesignPattern;

class Manager extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 1000;
    }

    protected void approve(double amount) {
        System.out.println("Manager approved $" + amount);
    }
}

class Director extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 10000;
    }

    protected void approve(double amount) {
        System.out.println("Director approved $" + amount);
    }
}

class VicePresident extends Approver {
    protected boolean canApprove(double amount) {
        return amount <= 50000;
    }

    protected void approve(double amount) {
        System.out.println("Vice President approved $" + amount);
    }
}

class President extends Approver {
    protected boolean canApprove(double amount) {
        return amount > 50000;
    }

    protected void approve(double amount) {
        System.out.println("President approved $" + amount);
    }
}

package ProxyDesignPattern.CreditCardExample;

public class RealBankAccount implements BankAccount{
    private double balance;

    public RealBankAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void withdraw(double amount, String pin) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: "+balance);
        }else{
            System.out.println("Insufficient funds.");
        }
    }
}

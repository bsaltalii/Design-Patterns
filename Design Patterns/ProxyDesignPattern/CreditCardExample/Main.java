package ProxyDesignPattern.CreditCardExample;

public class Main {
    public static void main(String[] args) {
        RealBankAccount realBankAccount = new RealBankAccount(5000);
        BankAccount proxy = new BankAccountProxy(realBankAccount,"1234");

        proxy.withdraw(1000,"0000");
        proxy.withdraw(1000,"1234");
    }
}

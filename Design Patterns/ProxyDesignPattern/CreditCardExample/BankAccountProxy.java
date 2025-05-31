package ProxyDesignPattern.CreditCardExample;

public class BankAccountProxy implements BankAccount{
    private RealBankAccount realBankAccount;
    private final String correctPin;
    public BankAccountProxy(RealBankAccount realBankAccount,String correctPin){
        this.realBankAccount=realBankAccount;
        this.correctPin=correctPin;
    }

    @Override
    public void withdraw(double amount, String pin) {
        if (pin.equals(correctPin)){
            realBankAccount.withdraw(amount,pin);
        }else{
            System.out.println("Invalid PIN. Access denied");
        }
    }
}

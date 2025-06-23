package StrategyDesignPattern.PaymentExample;

public class CryptoPayment implements PaymentStrategy{
    private String wallet;
    public CryptoPayment(String wallet){
        this.wallet=wallet;
    }
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f in crypto from wallet %s%n",amount,wallet);
    }
}

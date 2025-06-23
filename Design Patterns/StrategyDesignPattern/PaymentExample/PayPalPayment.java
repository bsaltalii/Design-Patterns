package StrategyDesignPattern.PaymentExample;

public class PayPalPayment implements PaymentStrategy{
    private String email;
    public PayPalPayment(String email){
        this.email=email;
    }
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f via Paypal account %s%n",amount,email);
    }
}

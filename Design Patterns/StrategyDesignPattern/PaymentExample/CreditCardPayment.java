package StrategyDesignPattern.PaymentExample;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f by credit card %s%n", amount, mask(cardNumber));
    }
    private String mask(String num){
        return "XXXX-XXXX-XXXX-" +num.substring(num.length() - 4);
    }
}

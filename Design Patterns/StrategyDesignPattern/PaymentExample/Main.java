package StrategyDesignPattern.PaymentExample;

public class Main {
    public static void main(String[] args) {
        Checkout cart = new Checkout();

        cart.setPaymentStrategy(new CreditCardPayment("12345670123456"));
        cart.processOrder(99.99);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.processOrder(59.90);

        cart.setPaymentStrategy(new CryptoPayment("0xABCD1234EF"));
        cart.processOrder(120.00);
    }
}

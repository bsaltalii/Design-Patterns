package StrategyDesignPattern.PaymentExample;

public class Checkout {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void processOrder(double total){
        if (strategy == null){
            throw  new IllegalStateException("Payment strategy not selected");
        }
        strategy.pay(total);
    }
}

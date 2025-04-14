package OpenClosedPrinciple;

//public class PaymentProcessor {
//    public void processPayment(String paymentMethod){
//        if (paymentMethod.equals("CreditCard")){
//            System.out.println("Processing payment through Credit Card");
//        }else if(paymentMethod.equals("PayPal")){
//            System.out.println("Processing payment through Paypal");
//        }else{
//            System.out.println("Unknown payment method");
//        }
//    }
//}

class PaymentProcessor{
    public void processPayment(PaymentMethod method){
        method.processPayment();
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        PaymentMethod eft = new EFT();

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(eft);
    }
}

class CreditCard implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Credit Card");
    }
}

class PayPal implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal");
    }
}

class EFT implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Processing payment with EFT");
    }
}


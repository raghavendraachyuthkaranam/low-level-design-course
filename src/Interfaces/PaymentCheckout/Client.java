package Interfaces.PaymentCheckout;

public class Client {
    public static void main(String[] args) {

        // parent class reference can refer to the child class object or parent class object.
        // child class reference cannot refer to the parent class object. It can only refer its own child class object.
        CheckoutService checkoutService = new CheckoutService();

        // Payment is an abstract class
        // object creation is not allowed
//        Payment payment = new Payment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();
        GiftCardPayment giftCardPayment = new GiftCardPayment();


//        checkoutService.makePayment(payment);
        checkoutService.makePayment(creditCardPayment);
        checkoutService.makePayment(upiPayment);
        checkoutService.makePayment(giftCardPayment);
        System.out.println("-------------------------------");

        Payment payment1 = new UPIPayment();
        Payment payment2 = new CreditCardPayment();
        checkoutService.makePayment(payment1);
        checkoutService.makePayment(payment2);
        System.out.println("-------------------------------");


        // use case - refund option is available for CreditCard and GiftCard payment

        // As I kept the Payment as reference variable, but CrediCardPayment's object.. so compiler is looing for refund()
        // method in the parent class i.e, in Payment
        // Once I change the ref variable to CreditCardPayment refund() method will work.
        // refund() is not common functionality for all the children.
        // refund() is a specific functionality of certain payment methods
        CreditCardPayment payment = new CreditCardPayment();
        UPIPayment payment3 = new UPIPayment();
        GiftCardPayment payment4 = new GiftCardPayment();
//        payment.refund();
        // UPIPayment class doesn't have the refund method, so it is expected that below line won't work
//        payment3.refund();

        // better is create an interface called Refundable and declare void refund() in that and
        // define the void refund() method in the CreditCardPayment and GiftCardPayment classes

        checkoutService.getRefund(payment);
//        checkoutService.getRefund(payment3);
        checkoutService.getRefund(payment4);


    }
}

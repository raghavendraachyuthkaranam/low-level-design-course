package Polymorphism.Overriding.PaymentCheckout;

import com.sun.source.tree.ParenthesizedTree;

public class Client {
    public static void main(String[] args) {

        // parent class reference can refer to the child class object or parent class object.
        // child class reference cannot refer to the parent class object. It can only refer its own child class object.
        CheckoutService checkoutService = new CheckoutService();

        Payment payment = new Payment();
//        CreditCardPayment creditCardPayment = new CreditCardPayment();
//        UPIPayment upiPayment = new UPIPayment();
//        GiftCardPayment giftCardPayment = new GiftCardPayment();


//        checkoutService.makePayment(payment);
//        checkoutService.makePayment(creditCardPayment);
//        checkoutService.makePayment(upiPayment);
//        checkoutService.makePayment(giftCardPayment);
        System.out.println("-------------------------------");

        Payment payment1 = new UPIPayment();
        Payment payment2 = new CreditCardPayment();
        checkoutService.makePayment(payment1);
        checkoutService.makePayment(payment2);
        System.out.println("-------------------------------");


    }
}

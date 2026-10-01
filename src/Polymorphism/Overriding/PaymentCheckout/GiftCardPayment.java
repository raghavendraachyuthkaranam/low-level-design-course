package Polymorphism.Overriding.PaymentCheckout;

public class GiftCardPayment extends Payment{
    void process(){
        System.out.println("Processing payment via GiftCard");
    }
}

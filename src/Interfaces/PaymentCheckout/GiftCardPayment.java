package Interfaces.PaymentCheckout;

public class GiftCardPayment extends Payment implements Refundable{
    void process(){
        System.out.println("Processing payment via GiftCard");
    }

    public void refund(){
        System.out.println("Refunding the amount to the GiftCard");
    }
}

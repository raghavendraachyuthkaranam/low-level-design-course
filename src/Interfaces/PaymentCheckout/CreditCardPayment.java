package Interfaces.PaymentCheckout;

public class CreditCardPayment extends Payment implements Refundable{
    void process(){
        System.out.println("Processing payment via CreditCard");
    }

    public void refund(){
        System.out.println("Refunding the amount to the CreditCard");
    }
}

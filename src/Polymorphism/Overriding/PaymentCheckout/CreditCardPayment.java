package Polymorphism.Overriding.PaymentCheckout;

public class CreditCardPayment extends Payment{
    void process(){
        System.out.println("Processing payment via CreditCard");
    }
}

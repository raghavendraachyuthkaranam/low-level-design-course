package Polymorphism.Overriding.PaymentCheckout;

public class UPIPayment extends Payment{
    void process(){
        System.out.println("Processing payment via UPI");
    }
}

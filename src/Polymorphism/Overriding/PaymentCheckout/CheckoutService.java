package Polymorphism.Overriding.PaymentCheckout;

public class CheckoutService {

    public void makePayment(Payment payment){
        payment.process();
    }

    // duplication of code
//    public void makePayment(UPIPayment upiPayment){
//        upiPayment.process();
//    }
//
//    public void makePayment(GiftCardPayment giftCardPayment){
//        giftCardPayment.process();
//    }
//    public void makePayment(CreditCardPayment creditCardPayment){
//        creditCardPayment.process();
//    }

}

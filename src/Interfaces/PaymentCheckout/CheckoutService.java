package Interfaces.PaymentCheckout;

public class CheckoutService {

    // Here when calling makePayment method, it doesn't know which child object is coming as input.
    public void makePayment(Payment payment){
        payment.process();
//        payment.refund();
    }

    public void getRefund(Refundable refundable){
        refundable.refund();
    }

    // duplication of code
//    public void makePayment(UPIPayment upiPayment){
//        upiPayment.process();
//    }
//
//    public void makePayment(GiftCardPayment giftCardPayment){
//        giftCardPayment.process();
//    }
    // we can use this type of function for creditcard type
//    public void makePayment(CreditCardPayment creditCardPayment){
//        creditCardPayment.process();
//        creditCardPayment.refund();
//    }

}

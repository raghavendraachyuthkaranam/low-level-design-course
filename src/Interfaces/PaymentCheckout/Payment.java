package Interfaces.PaymentCheckout;

import java.awt.dnd.DropTargetEvent;
import java.util.Date;

public abstract class Payment    {
    private int paymentId;
    private String referenceNumber;
    private Date date;
    private int amount;


    // common for all children
    public int getAmount(){
        return amount;
    }
//    void process(){
//        System.out.println("Processing Payment");
//    }

    //  each of inherited child class has to define the process method.
    // here it is abstract method
    abstract void process();
}

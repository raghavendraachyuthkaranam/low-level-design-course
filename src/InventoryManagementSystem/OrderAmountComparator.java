package InventoryManagementSystem;

import java.util.Comparator;

// Desc order of totalAmount
public class OrderAmountComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getTotalAmount() > o2.getTotalAmount()){
            return -1;
        } else if (o1.getTotalAmount() < o2.getTotalAmount()) {
            return 1;
        }
        return 0;
    }
}

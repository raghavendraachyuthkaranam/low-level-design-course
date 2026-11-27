package InventoryManagementSystem;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {

    // Ascending order of Name
    // item with higher value should come
    // unlike comparable both objects are passed as arguments
    // rules are similar to Comparable
    @Override
    public int compare(Item o1, Item o2) {
        // o1 to come before o2 in the final order => -ve
        // o2 to come before o1 in the final order => +ve
        if(o1.getName().compareToIgnoreCase(o2.getName()) < 0){
            return -1;
        } else if (o1.getName().compareToIgnoreCase(o2.getName()) > 0) {
            return 1;
        }
        return 0;
    }
}

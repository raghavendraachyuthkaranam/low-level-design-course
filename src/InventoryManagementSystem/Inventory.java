package InventoryManagementSystem;

import java.util.HashMap;

public class Inventory<T extends Item> {
    // we are storing the items and others things in hashmap
    // we should be easily lookup for items using id
    // create an inventory object just hold specifically electronics
    // books and clothing all under one roof only but with segregation
    // we have to use generic bounds here
    private HashMap<String, T> items;

    public Inventory(){
        items = new HashMap<>();

    }

    public void addItem(T item){
        items.put(item.getId(), item);

    }

    public void remove(T item){
        items.remove(item.getId());
    }

}


package InventoryManagementSystem;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(){

    }

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // this method is called via some object i.e, item
    // calling will happen like this
    // item.compareTo(item2);
    // item object is calling this compareTo function and item2 object is being passed to the same function

    @Override
    public int compareTo(Item other) {
        // we need two item objects to compare
        // obj1 : this ( calling compareTo function)
        // obj2: other (passed in the arguments)

        // we need to inform the function that which obj should come first
        // obj1 to come first then return -ve value
        // obj2 to come first then return +ve value

        // natural sorting order let us consider ascending order of price
        // this will come first
        if(this.getPrice() < other.getPrice()){
            return -1;
        } else if(this.getPrice() > other.getPrice()){
            return 1;
        }
        return 0;

//        // natural sorting order let us consider ascending order of name
//        // this will come first
//        if(this.getName().compareToIgnoreCase(other.getName()) < 0){
//            return -1;
//        } else if(this.getName().compareToIgnoreCase(other.getName()) > 0){
//            return 1;
//        }
//        return 0;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

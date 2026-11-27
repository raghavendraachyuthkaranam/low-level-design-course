package InventoryManagementSystem;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        /*
        Tasks:
         1. Inventory management system create an Item class and then Book,Clothing and Electronics inherited from Item class
         2. Natural sorting order with price using Comparable interface
         3. Store the Item/Electronics/Book/Clothing objects in an Inventory using HashMap
         (create an inventory object just hold specifically electronics,
          specifically books and specifically clothing all under one inventory, but with segregation)
         4. Explicit comparison logic with Name or Quantity using Comparator interface
         5. Recently viewed items top 3 and dynamic way also using LinkedList or Queue or LRU cache
         6. Order processing with Order and OrderProcessing class, prioritize express order first and next is regular order.
            (use priority queue with Comparable interface)
            (use priority queue as input parameter in orderProcessing class using Comparator interface)
         */


        Item item = new Item("1","Pen",10.0,5);
        Item item1 = new Item("2","Calender",15.0, 3);

        Electronics electronics = new Electronics("3","iPad",100,7,3);
        Book book = new Book("4","Clean Code",30,3,"ABC");
        Clothing clothing =  new Clothing("5","Shirt",200.0,2,"L");


        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item1);
        items.add(electronics);
        items.add(book);
        items.add(clothing);

        // here we need to define the natural sorting order for custom classes
        // wrt to id or name or price or quantity
        // we will be using Comparable Interface which ha compareTo method

        Collections.sort(items);

        for(Item i : items){
            System.out.println(i.getName() + " " + i.getPrice());
        }

        System.out.println("-----------------------------------");

        // example of sort for arraylist of integers

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);


        // Inventory
        // create an inventory object just hold specifically electronics
        // books and clothing all under one roof only but with segregation
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(electronics);

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(book);

        Inventory<Clothing> clothingInventory = new Inventory<>();
        clothingInventory.addItem(clothing);

        // we can also create a generic inventory of Item
        Inventory<Item> itemInventory = new Inventory<>();
        itemInventory.addItem(item);
        itemInventory.addItem(item1);
//        itemInventory.addItem(book);


        // Comparable : Define natural sorting order. It cannot be multiple only one
        // Comparator: Explicit comparison logic


        System.out.println("-----------------------------------");
        Collections.sort(items, new ItemQuantityComparator());
        for(Item i : items){
            System.out.println(i.getName()  + " " + i.getQuantity());
        }

        System.out.println("-----------------------------------");

        Collections.sort(items, new ItemNameComparator());
        for(Item i : items){
            System.out.println(i.getName()  + " " + i.getPrice());
        }

        // order processing
        Order order1 = new Order(1,true, 100);
        Order order2 = new Order(2,true, 300);
        Order order3 = new Order(3,false,200);
        Order order4 = new Order(4,true,800);
        Order order5 = new Order(5,false,600);
        Order order6 = new Order(6,true,150);
        // Order -> should process => 1 2 4 6 3 5
        // isExpress true should be processed first and next priority is given to regular order
        // this is natural sorting order processing and the first priority given to isExpress is true

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);
        orderProcessor.addOrder(order6);

        orderProcessor.processAllOrders();


        // this is using Comparator we are passing Priority queue with OrderAmountComparator
        // explicit way of order processing
//        PriorityQueue<Order> pq = new PriorityQueue<>(new OrderAmountComparator());
//        OrderProcessor orderProcessor = new OrderProcessor(pq);
//        orderProcessor.addOrder(order1);
//        orderProcessor.addOrder(order2);
//        orderProcessor.addOrder(order3);
//        orderProcessor.addOrder(order4);
//        orderProcessor.addOrder(order5);
//        orderProcessor.addOrder(order6);
//        orderProcessor.processAllOrders();






        // Priority queue can't understand the Orders in which order it should be processed
        // it can understand the integers
        // either we can do with natural order using Comparable or use Comparator
//        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
//        priorityQueue.add(3);
//        priorityQueue.add(2);
//        priorityQueue.add(6);
//        priorityQueue.add(1);
//
//        while(!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.poll());
//        }



    }
}

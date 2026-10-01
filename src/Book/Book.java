package Book;

public class Book {
    String title;
    String author;
    String isbn;
    private double price;
    int noOfPages;
    boolean isAvailable;


    public void setPrice(double price) {
        if(price<=100){
            System.out.println("Price has to be >=100");
            return;
        }
        this.price = price;
    }

    // Constructor:
    // 1. It has the same name as the class name
    // 2. No return type
    Book(){
        title = "New Book";
        author = "Some author";
        isbn = "";
        price = 100.0;
        noOfPages = 50;
        isAvailable = true;
    }
    Book(String title,String author, String isbn, double price, int noOfPages, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.noOfPages = noOfPages;
        this.isAvailable = isAvailable;
    }

    // below are the actions...
    // book can be borrowed
    void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title + " Book is borrowed");
        }
        else{
            System.out.println(title + " Book is not available");
        }
    }
    // book can be returned

    void returnBook(){
        isAvailable = true;
        System.out.println(title + " is returned");
    }

    // availability check of the book --> variable..



    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + noOfPages);
        System.out.println("Available: " + isAvailable);

    }
}

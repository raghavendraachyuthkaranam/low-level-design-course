package Book;

public class LibraryDemo {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Clean Code";
        book1.author = "Robert C. Martin";
        book1.isbn = "978-0132350884";
//        book1.price = 599.0;
        book1.setPrice(50);
        book1.setPrice(150);
        book1.noOfPages = 464;
        book1.isAvailable = true;

        Book book2 = new Book();
        book2.title = "The Pragmatic Programmer";
        book2.author = "David Thomas";
        book2.isbn = "978-0135957059";
//        book2.price = 749.0;
        book2.noOfPages = 352;
        book2.isAvailable = true;


        // drawbacks of above lines --> Need of constructor

        // 1. multiple line again and again to initialize the value of an object
        // 2. might forget to initialize something which is required

        // Constructors
        // 1. Java will give default constructor if we don't provide one.
        // 2. We can create our own constructor as well.

        book1.displayInfo();
//        book1.borrow();
//        book1.borrow();
//        book1.returnBook();


        Book book3 = new Book("Clean Code",
                "Robert C. Martin",
                "978-0132350884",
                599.0,
                464,
                true);

        book3.displayInfo();
        book3.borrow();
    }
}

package Inheritance;

public class User {
    private int id;
    private String name;

    // if I don't use the no argument constructor and use two args constructor
    // when I create a Instructor/Student object then java looks for no arg constructor
    // if not found then it throws error.. because child class method automaticllay calls the parent class method using super() --> without args
    // if you don't want to use no args constructor and want to use two args constructor
    // then we need to explicitly define the super(1,"newUser") in the Instructor or Student child class method
    public User() {
        this.id = 1;
        this.name = "New User";
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out.println("User: " + name + " logged in successfully!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("User: " + name);
        System.out.println("User: " + id);
    }
}

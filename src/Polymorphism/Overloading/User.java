package Polymorphism.Overloading;

public class User {
    // until I provide the constructor java will provide the one..
    private int id;
    private String name;

    public User(){
        id = 1;
        name = "New_name";
    }

    public User(int id) {
        this.id = id;
        name = "New_name";
    }

    public User(String name){
        id = 1;
        this.name = name;
    }

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public User(User other){
        this.id = other.id;
        this.name = other.name;
    }






}

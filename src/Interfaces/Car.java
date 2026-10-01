package Interfaces;

public class Car extends Vehicle implements Runner{
    public void run(){
        System.out.println("Car is running");
    }
}

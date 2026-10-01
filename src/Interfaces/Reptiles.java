package Interfaces;

public class Reptiles extends Animal implements Runner{
    // let us consider all reptiles can run
    public void run(){
        System.out.println("Reptile is running");
    }
}

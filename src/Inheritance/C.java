package Inheritance;

public class C extends B{
    C(){
       // super(); // super() => parent of C => B's constructor is called.
        System.out.println("C() constructor is called");
    }
}

package Inheritance;

public class D extends C{
    D(){
        // hidden super() is called..
        //super(); // super() => parent of D => C's constructor is called.
        System.out.println("D() constructor is called");
    }
}



package Inheritance;

// child inherits all the properties from the parent
// private attributes are not inherited
// but the values are shown when we create a child object
public class B extends A{
    B(){
        //super(); // super() => parent of B => A's constructor is called.
        System.out.println("B() constructor is called");
    }
}

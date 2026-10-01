package Interfaces;

// interface brings us more flexibility
// interfaces are created based on the behavior classification -> based on what someone can do
// we can implement multiple interfaces, but we can't extend multiple inheritance due to diamond problem.
// inheritance -> each class has only one parent


// abstract classes:
// 1. Are generic in nature, you do not want to create object of the class which is abstract
// ex: Animal class, Notification class
// 2. These have abstract methods, which helps abstract classes to declaration to the methods which their child should implement
// ex: Bird abstract class -> can have abstract void fly(); method as declaration.

// Difference between Interface and Abstract class
// a class can implement multiple interfaces but a class cannot extend multiple abstract classes.
// Interface do not tak about common attribute, they just tak about behaviors.
// But abstract classes talk about common attributes(data members) and common functions plus some abstract methods.
public interface Runner {
    void run();
}

// all the methods which we declare in the interface are by default public
// all the declared methods has to be implemented or defined by the class which implements this interface Runner.

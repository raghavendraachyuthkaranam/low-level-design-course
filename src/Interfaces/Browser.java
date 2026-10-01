package Interfaces;

public class Browser {
    // forward and backward button
    // implementing backward operation
    Stack pagesStack;

    // when you open a browser new object is created using constructor
    // whoever is creating the object of the browser  is
    // deciding which stack is to be used arraystack or linkedliststack or queuestack
    // below we are not specifically talking about which type of stack it is..
    // it could be arraystack or linkedliststack or queuestack
    public Browser(Stack stack){
        pagesStack = stack;
    }

    void gotoPreviousPage(){
        pagesStack.pop();
        System.out.println("Opening the previous page");
        pagesStack.top();
    }
}

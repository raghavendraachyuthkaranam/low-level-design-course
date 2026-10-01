package Threads2;

public class HelloWorldPrinter implements Runnable{

    // Thread class expects Runnable type of object
    // It will contain run()
    // Thread will call the this run()
    public void run(){
        // whatever we do inside this thread will be executed
        print();
    }

    public void print(){
        System.out.println("Hello World from " + Thread.currentThread().getName());
    }
}

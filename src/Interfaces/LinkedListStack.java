package Interfaces;

public class LinkedListStack implements Stack{
    public void push(int x){
        System.out.println("Data is pushed into LinkedListStack");
    }

    public void pop(){
        System.out.println("Data is popped from LinkedListStack");
    }

    public int top(){
        System.out.println("Data is top from LinkedListStack");
        return 0;
    }
}

package Interfaces;

public class QueueStack implements Stack{
    public void push(int x){
        System.out.println("Data is pushed into QueueStack");
    }

    public void pop(){
        System.out.println("Data is popped from QueueStack");
    }

    public int top() {
        System.out.println("Data is top from QueueStack");
        return 0;
    }
}

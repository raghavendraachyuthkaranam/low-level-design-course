package Interfaces;

public class ArrayStack implements Stack{

    int[] arr;
    int index = 0;
    public ArrayStack(int size){
        arr = new int[size];
        index = 0;
    }
    public void push(int x){
        arr[index++] = x;
        System.out.println("Data is pushed into ArrayStack");
    }

    public void pop(){
        index--;
        System.out.println("Data is popped from ArrayStack");
    }

    public int top(){
        System.out.println("Data is top from ArrayStack");
        return arr[index];
    }
}

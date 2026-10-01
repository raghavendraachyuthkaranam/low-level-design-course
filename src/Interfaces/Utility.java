package Interfaces;

public class Utility {
    // this method doesn't care about implementation..
    // It only cares that it should have the methods of Stack..

    // this is Abstraction
    public static void someUtilityMethod(Stack stack){
            stack.push(1);
            stack.pop();
            stack = new ArrayStack(5);
            stack.push(2);

    }
}

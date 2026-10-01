package Interfaces;


public class Client {


    private static void startRace(Runner[] participants){
        for(Runner runner: participants){
            runner.run();
        }

    }

    public static void main(String[] args) {
        Runner[] paticipants = {new Dog(),
                new RoboticDog(),
                new Reptiles(),
                new Car(),
                new Snakes()
        };
        // let us call a startRace method
        startRace(paticipants);


        // Stack example
//        ArrayStack arrayStackstack = new ArrayStack(10);
        // An interface type can refer to the object
        // of any class which has implemented the interface...

        // this becomes flexible --> Stack stack = new ArrayStack();
        // suppose there are 10 files all those files are consuming Stack..
        // they are not concerned about which implementation of Stack is used.
        // it can be ArrayStack or LinkedListStack or QueueStack..
//        Stack stack = new ArrayStack(10);
//        stack.push(10);
//        stack.push(15);
//        stack = new LinkedListStack();
//        stack.push(25);
//        stack.pop();
//        stack = new QueueStack();
//        stack.push(1);
//        stack.pop();


//        Utility.someUtilityMethod(stack);

    }
}

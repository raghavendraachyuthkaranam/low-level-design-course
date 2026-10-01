package IntroToThreads;
import java.time.Duration;
import java.time.Instant;


// task-1 - to print hello world single thread

public class Client {
    public static void main(String[] args) {
      //  System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId()+ "  "+ Thread.currentThread().getState());
        HelloWorldPrinter task = new HelloWorldPrinter();
        Thread t1 = new Thread(task);
        t1.start();
        System.out.println(task.getClass().getSimpleName());
        Runnable r1 = new HelloWorldPrinter();
        Thread t2 = new Thread(r1);
        t2.start();
        System.out.println(r1.getClass().getName());
        // Here task object is of Runnable interface, so it is working as expected.
        /*
        The Rule: The Thread constructor requires an object that implements the Runnable interface.
        The Code: Since your class has implements Runnable, both task and r1 qualify as valid inputs.
        The Result: The Thread class accepts them and successfully runs your cod
         */

// task-2: Print 1 to 100 using single thread

        Runnable task2 = new NumberPrinter();
        Thread t3 = new Thread(task2);
        t3.start();

        // task-3: Print each number using a new thread

//        Runnable task3 = new NumberPrinterV1(1);
//        Thread t4 = new Thread(task3);
//        t4.start();



//        Instant st = Instant.now();
//        for(int i = 1; i<=1000000;i++){
//            System.out.println("Number: " + i);
//        }
//
//        Instant en = Instant.now();
//        Duration timeCon = Duration.between(st, en);
//
//        System.out.println("Time consumed in milliseconds: " + timeCon.toMillis() + " ms");
//        System.out.println("Time consumed in seconds: " + timeCon.toSeconds() + " s");
//        System.out.println("Time consumed in nanoseconds: " + timeCon.toNanos() + " ns");


//        Instant start = Instant.now();
//        for(int i=1;i<=1000;i++){
//            Runnable task4 = new NumberPrinterV1(i);
//            Thread t5 = new Thread(task4);
//            t5.start();
//        }
//        Instant end = Instant.now();
//
//
//        Duration timeConsumed = Duration.between(start, end);
//
//        System.out.println("Time consumed in milliseconds: " + timeConsumed.toMillis() + " ms");
//        System.out.println("Time consumed in seconds: " + timeConsumed.toSeconds() + " s");
//        System.out.println("Time consumed in nanoseconds: " + timeConsumed.toNanos() + " ns");




    }




}

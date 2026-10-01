package Threads2;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;


// task - to print hello world single thread
public class  Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getId()+ "  "+ Thread.currentThread().getState());
//        HelloWorldPrinter task = new HelloWorldPrinter();
//        Thread t1 = new Thread(task);
//        t1.start();
//        Runnable r1 = new HelloWorldPrinter();
//        Thread t2 = new Thread(r1);
//        t2.start();
//
////        Runnable task2 = new NumberPrinter();
////        Thread t3 = new Thread(task2);
////        t3.start();
//
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


        // 1. To create a Thread Pool we need to create an object of ExecutorService
            // this => Executors.newFixedThreadPool(10) return to the reference called ExecutorService
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=100;i++){
//            Runnable task4 = new NumberPrinterV1(i);
//            executorService.execute(task4);
//
//        }

        // 2. newCachedThreadPool()
        // Create a new Thread only if all the threads are busy. Otherwise, reuse the Thread which is free
        // here we are not fixing the Thread Pool count
        // System creates few set of ThreadPool for us
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for(int i=1;i<=100;i++){
//            Runnable task4 = new NumberPrinterV1(i);
//            executorService.execute(task4);
//
//        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        NumberGenerator numberGenerator = new NumberGenerator(105);
//        // Main thread is will be moving to the next lines to execute, so we might get wrong value if we put Integer here.
//        // so, Java provided Future<Integer> holder to hold the data when new worker thread is called and store the value in that ansFuture variable.
        Future<Integer> ansFuture = executorService.submit(numberGenerator);
        System.out.println("Doing something");
        System.out.println("Doing Doing");
//        // below we are making the Main Thread to go to sleep for 20ms so that new worker thread is getting executed
        Thread.sleep(20);
        System.out.println("Still doing");
        // ansFuture.get() ==>  will put Main Thread on hold until the data is ready from worker thread.
        // i.e, waits until the worker thread has produced the result.
        /*Main thread becomes
        WAITING
        until worker completes.
        This is called blocking.
         */
        ansFuture.get();
        Integer ans = ansFuture.get();
        System.out.println(ans);


    }


}

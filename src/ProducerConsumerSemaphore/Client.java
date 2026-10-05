package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        // let us consider we have max size of 6 for the store
        Store store = new Store(6);
        // create semaphores
        Semaphore producerSemaphore = new Semaphore(store.getMAX_SIZE());
        Semaphore consumerSemaphore = new Semaphore(0);

        // we can create multiple producers and consumers

        // create executor service
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1; i<=8; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            executorService.execute(producer);
        }

        // less no. of producers but sales is high
        for(int i=1; i<=20; i++){
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);
            executorService.execute(consumer);
        }

    }
}

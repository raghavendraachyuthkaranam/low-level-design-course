package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
//    private List<Object> items;
    // use thread safe concurrentlinkedqueue
    private ConcurrentLinkedQueue<Object> items;

    private int MAX_SIZE;

    public Store(int max_size){
        items = new ConcurrentLinkedQueue<>();
        MAX_SIZE = max_size;

    }

    public void addItem(Object item){
        items.add(item);
    }

    public void removeItem(){
        items.remove();
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public int getSize(){
        return items.size();
    }


}

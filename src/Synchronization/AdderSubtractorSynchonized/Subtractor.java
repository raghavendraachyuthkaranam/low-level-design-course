package Synchronization.AdderSubtractorSynchonized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    public Subtractor(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        // add from 1 to 100

        for(long i = 0; i<=100000; i++){
            synchronized (value){
                value.setX(value.getX() - i);
            }

        }

        return null;
    }
}
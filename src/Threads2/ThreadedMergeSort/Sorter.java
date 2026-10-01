package Threads2.ThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> toSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> input, ExecutorService executorService){
        this.toSort = input;
        this.executorService = executorService;

    }
    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }

    List<Integer> sort() throws ExecutionException, InterruptedException {
        // we need to write mergesort code

        System.out.println("Sort this data: " + toSort + " in Thread: " + Thread.currentThread().getName());
        if(toSort.size()<=1)
            return toSort;
        int mid = toSort.size()/2;
        List<Integer> leftArray = toSort.subList(0,mid);
        List<Integer> rightArray = toSort.subList(mid,toSort.size());
        // we need to do two recursive calls
        // one to sort the leftArray and other to rightArray
        // need to do it via two different threads
        // for that we need to create objects of those tasks and pass it to the threads

        Sorter leftArraySorter = new Sorter(leftArray, executorService);
        Sorter rightArraySorter =  new Sorter(rightArray, executorService);

        // pass the above objects to the two threads

        Future<List<Integer>> leftArrayFuture = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = executorService.submit(rightArraySorter);

        // getting the answers
        List<Integer> leftSortedArray = leftArrayFuture.get();
        List<Integer> rightSortedArray = rightArrayFuture.get();

        // Merge the arrays
        int i = 0, j = 0;
        List<Integer> sortedArray =  new ArrayList<>();
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) <= rightSortedArray.get(j))
            {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}



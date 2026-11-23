package GenericsandCollections;

public class Pair<T,K> {
    private T first;
    private K second;


    public void addFirst(T first) {
        this.first = first;
    }

    public void addSecond(K second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }


}

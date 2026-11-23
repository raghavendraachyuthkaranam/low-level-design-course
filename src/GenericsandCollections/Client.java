package GenericsandCollections;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer> p1 = new Pair<>();
//        p1.addFirst(5);
//        p1.addSecond(7);

        Pair<Integer, String> pair = new Pair<>();
        pair.addFirst(3);
        pair.addSecond("Hello");

        Pair<String, String> p2 = new Pair<>();
        Pair<Double, Double> p3 = new Pair<Double, Double>();
        p3.addFirst(4.5);
        p3.addSecond(6.5);

        System.out.println("p3 first: " + p3.getFirst() + " & p3 second: " + p3.getSecond());

        // below is for backward compatibility
        // everything was of object type
        // recommendation not to use this approach
        Pair pair1 = new Pair();

        //Collection


    }
}

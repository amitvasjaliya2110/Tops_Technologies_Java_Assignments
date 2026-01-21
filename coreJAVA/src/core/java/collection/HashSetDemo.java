package core.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main ( String[] args ) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(30);
        list.add(300);
        list.add(500);
        list.add(300);

        System.out.println("Original List:"+list);

        HashSet<Integer> Set = new HashSet<>(list);

        System.out.println("After removing duplicates: "+Set);

    }
}

package core.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main ( String[] args ) {
        List <String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("PYTHON");
        list.add("C#");
        list.add("C++");
        list.add("PHP");

        System.out.println("ArrayList elements: ");
        for(String s : list){
            System.out.println(s);
        }

        List<Number> numbers = new LinkedList<>();
        numbers.add(15);
        numbers.add(255);
        numbers.add(10000);
        numbers.add(555.6666);
        numbers.add(8179F);
        numbers.add(2555879L);

        System.out.println("LinkedList elements: ");
        for(Number number : numbers){
            System.out.println(number);
        }

    }
}

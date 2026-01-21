package core.java.collection;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<>();

        map.put(1,"JAVA");
        map.put(2,"PYTHON");
        map.put(3,"PHP");
        map.put(4,"C#");
        map.put(5,"C++");

        System.out.println("values for key 3: "+map.get(3));

        System.out.println("\nAll key-Value Pairs:");
        for(Integer key : map.keySet()){
            System.out.println(key +" = "+map.get(key));
        }
    }
}

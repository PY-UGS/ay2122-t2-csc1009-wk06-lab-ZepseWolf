package week6;

import java.util.*;
import java.util.LinkedList;

public class CollectionHash1 {
    public static void addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));

        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i))
            ;
        }
        System.out.println("\nThe HashMap Before Adding :-" + hashMap);
        
        System.out.println("\nThe HashMap After Adding :-");
        addAndSort(hashMap, 10);
    }
}

package week6;
import java.util.*;  
import java.util.LinkedList;  

public class CollectionHash2 {
    public static void swapValues (HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo) {
        int tempHolder = hashMap.get(indexTwo);
        hashMap.put(indexTwo, hashMap.get(indexOne));
        hashMap.put(indexOne, tempHolder);
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i));
        }

        System.out.println("The HashMap Before Swapping :-\n"+hashMap);
        swapValues(hashMap, 1,5);
        System.out.println("The HashMap After Swapping :-\n "+hashMap);
    }
}

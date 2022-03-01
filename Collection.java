package week6;

import java.util.*;

public class Collection {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
        Scanner s = new Scanner(System.in);
//        For fully input based
//        System.out.print("Number of data (N) : ");
//        int n = s.nextInt();
//        int prev_number = 0;
//        for(int i = 0 ; i <n ; i++){
//            System.out.print("Input data : ");
//            prev_number = s.nextInt();
//            addAndSort(list , prev_number);
//        }
        System.out.println("-------------- Question 1 --------------");
        System.out.println("Linked List Before Adding :-");
        printList(list);
        System.out.println();
        addAndSort(list, 2);
        System.out.println("Linked List After Adding :-");
        printList(list);
        System.out.println();

        System.out.println("\n\n-------------- Question 2 --------------\n");
        System.out.print("Input first data to swap : ");
        int e1 = s.nextInt();
        System.out.print("Input second data to swap : ");
        int e2 = s.nextInt();

        System.out.println("\nLinked List Before Swapping :-");
        printList(list);
        swapValues(list,e1, e2);
        System.out.println("\nLinked List AFTER Swapping :-");
        printList(list);
    }

    public static void swapValues (LinkedList<Integer> list, int indexOne, int indexTwo){
        int index1 = list.indexOf(indexOne);
        int index2 = list.indexOf(indexTwo);
        if(index1 != -1 && index2 != -1){
            list.set(index1, indexTwo);
            list.set(index2, indexOne);
        }else{
            System.out.println("\nNone existance data inputed. Please restart program.");
            System.exit(0);
        }
    }

    public static void printList (LinkedList<Integer> list){
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        boolean added = false;
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        int size=  list.size();
        list.add(value);

        if(size == 0){
            list2.add(value);
        }
        else{
            // Something in list
            for(int i = 0 ; i< size; i++ ){
                int data = list.get(i);

                if(data>=value && i == size-1 && !added){
                    list2.add(value);
                    list2.add(data);
                    added = true;
                }
                else if(data>=value && i != size && !added){
                    list2.add(value);
                    list2.add(data);
                    added = true;
                }
                else if(data<value && i == size-1 && !added){
                    list2.add(data);
                    list2.add(value);
                    added = true;
                }
                else{
                    list2.add(data);
                }
            }
        }

        for(int x = 0 ; x< list2.size();x++){
            list.set(x,list2.get(x));
        }
    }
}

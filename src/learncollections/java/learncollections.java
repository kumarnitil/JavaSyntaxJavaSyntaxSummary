package learncollections.java;

import java.util.ArrayList;

public class learncollections {
    public static void main(String[] args){
        /*
        Collections - Collections are various data types. Let us list the each one here
        List - ArrayList and LinkedList
        Set - Hashset
        SortedSet - Treeset
        Queue - PriorityQueue
        Deque - LinkedList and ArrayDeque
        Map - HashMap
        SortedMap - TreeMap
         */

        //ArrayList
        int n = 10;
        ArrayList<Integer> Arraylistsample = new ArrayList<>();
        for(int i=0;i<n;i++){
            Arraylistsample.add(i);//Keep adding elements to the array list dynamically
        }
        System.out.println(Arraylistsample);
        Arraylistsample.remove(3);
        System.out.println(Arraylistsample);
        System.out.println(Arraylistsample.get(5)+" get is used to print a particular element");

        //LinkedList
        
    }

}


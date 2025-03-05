package lk.acpt.demofx;/*Auther : Yasindu Sathsara
Place : ACPT's Lab*/

import java.util.*;

public class Test {
    public static void main(String[] args) {

        //collection framework and generics

        //type safe
        //length safe
        int[] ar = new int[10];

        //List, Set, Queue, Map ----> interfaces

        ArrayList<Object> list = new ArrayList();
        list.add(10);
        list.add(56);
        list.add("Yasindu");
        list.add(90.6);
        list.add(new Scanner(System.in));

        list.get(2);

        System.out.println(list);

        ///////////////////////////////

        HashSet set = new HashSet();
        set.add(12);
        set.add("Yasindu");
        set.add(90.6);
        set.add(12);
        set.add("Kavindu");

        System.out.println(set);

        ////////////////////////////////

        PriorityQueue queue = new PriorityQueue();
        queue.add(20);
        queue.add(10);
        queue.add(30);

        System.out.println(queue);

        /////////////////////////////////

        HashMap<Integer, Object> map = new HashMap();
        map.put(0,"yasindu");
        map.put(1,25);
        map.put(2, 56.7);

        map.get(0);

        System.out.println("Shaveeen...");
    }
}

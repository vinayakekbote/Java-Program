package com.collection;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>(Arrays.asList(1,3,6,7,8));
        Deque<Integer> ad=new LinkedList<>();

        Iterator<Integer> i=q.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        q.offer(6);
        System.out.println(q);
    }
}

package com.example;

import java.util.PriorityQueue;

public class PriorityQueueExample {
   public static void main(String[] args) {
        // priority queue orders its elements according to their natural ordering.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements 
        pq.add(3);
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(4);

        // Use offer() method to add elements to the head
        pq.offer(0);

        // PriorityQueue stores elements according to natural order or comparator specified
        System.out.println(pq); 

        // Looping using the isEmpty() method
        // As long as pq is not empty, return and remove the head element in the queue using poll()
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            
        }
   }

}

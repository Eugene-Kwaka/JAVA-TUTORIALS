package com.example;

import java.util.Deque;
import java.util.LinkedList;


public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        //Add to the deque from the rear
        deque.add("Captain America (Tail)");

        // Add from the front
        deque.addFirst("IronMan 1 (Head)");

        // Add to the rear 2
        deque.addLast("Thor (Tail)");

        // Add at the first
        deque.push("Antman (Head)");
 
        // Add at the last
        deque.offer("Endgame (Tail)");
 
        // Add at the first
        deque.offerFirst("Spiderman (Head)");

        System.out.println("Print the deque: " + deque);
        
        
        // Removing Elements
        // removing head
        String removedFirst = deque.removeFirst();
        System.out.println("Head element removed is: " + removedFirst);

        // removing tail
        String removedTail = deque.removeLast();
        System.out.println("Tail element removed is: " + removedTail);

        System.out.println("print deque after removing head and tail objects: " + deque);

    }
    


}

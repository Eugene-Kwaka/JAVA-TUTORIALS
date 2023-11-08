package com.example;

import java.util.Deque;
import java.util.LinkedList;


public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        //Add to the deque from the tail
        deque.add("Captain America (Tail)");
        deque.addLast("Thor (Tail)");
        deque.offer("Endgame (Tail)");

        // Add from the head
        deque.addFirst("IronMan 1 (Head)");
        deque.offerFirst("Spiderman (Head)");
        deque.push("Antman (Head)");
        
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

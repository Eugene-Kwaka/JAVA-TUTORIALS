package com.example;

import java.util.LinkedList;
import java.util.Queue;

// Example of a LinkedList queue
public class LinkedListExample 
{
    public static void main( String[] args )
    {
        Queue<Integer> linkedList = new LinkedList<>();
        // Add elements to the linkedList
        for (int i = 0; i <= 7; i++){
            linkedList.add(i);
        }

        System.out.println( "Elements of LinkedList queue" + linkedList);

        // View head of linkedList queue
        int head = linkedList.element();
        System.out.println("First element in the linkedList is: " + head);

        // Remove head
        int removedElement = linkedList.remove();
        System.out.println("Removed element from linkedList is: " + removedElement);

        // Check size of queue
        System.out.println("Size of the linkedList is: " + linkedList.size());

        
    }
}

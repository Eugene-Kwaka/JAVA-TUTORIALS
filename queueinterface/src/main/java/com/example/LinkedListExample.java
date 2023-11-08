package com.example;


import java.util.Iterator;
import java.util.LinkedList;


// Example of a LinkedList queue
public class LinkedListExample 
{
    public static void main( String[] args )
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Add elements to the linkedList
        for (int i = 1; i <= 7; i++){
            linkedList.add(i);
        }

        System.out.println( "Elements of LinkedList queue" + linkedList);

        //View head of linkedList queue
        int head = linkedList.peek();
        System.out.println("First element in the linkedList is: " + head);

        // Get an element from the LinkedList
        System.out.println("The First element in the list is: " + linkedList.getFirst());
        System.out.println("The last element in the list is: " + linkedList.getLast());
        // specify the index of the item I want to retrieve
        System.out.println("The element retrieved from the list is: " + linkedList.get(3));
       
        // Retrieve and remove the head element
        int polledElement = linkedList.poll();
        System.out.println("This head element is retrieved and polled: " + polledElement);

        // Remove head
        int removedElement = linkedList.remove();
        System.out.println("Removed element from linkedList is: " + removedElement);

        // Check size of queue
        System.out.println("Size of the linkedList is: " + linkedList.size());
 
        // Looping through the LinkedList with an iterator()
        Iterator<Integer> iter = linkedList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        // Change an element in the list
        linkedList.set(0, 0);
        System.out.println(linkedList);

        // Empty the LinkedList
        linkedList.clear();
        System.out.println(linkedList);

        
    }
}

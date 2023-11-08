/**
HashMap is a Map which:
1. Stores elements in key-value pairs
2. Insertion/Retrieval of element by key is fast
3. Tradeoff is that it does not maintain the order of insertion
4. Permits one null key and null values
 */


package com.example;

import java.util.*;

public class HashMapExample 
{
    public static void main( String[] args )
    {
        // creating a map object with int keys and String values
        Map<Integer, String> students = new HashMap<>();

        //Add entries to the student hashMap
        students.put(1, "Jambo");  
        students.put(2, "Habari");
        students.put(3, "Gani");

        // LOOPING
        // Iterating through the hashMap with a forEach loop using entrySet()
        for (Map.Entry<Integer, String> student:students.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());

        }
        // Looping with keySet()
        for (int key: students.keySet()){
            System.out.println("The students ids are: " + key + " and their names are " + students.get(key));
        }
        // Looping with forEach and values() method
        for(String student: students.values()){
            System.out.println("The student names are: " + student);
        }

        // print out entries
        System.out.println(students.entrySet());

        // show size of HashMap
        System.out.println("size: " + students.size());

        // Remove entry
        // Returns true if object is removed
        System.out.println(students.remove(1, "Jambo"));

        //Check if map contains a key
        if(students.containsKey(1)){
            System.out.println("The student is: " + students.get(1));
        }
        else{
            System.out.println("Student not found");
        }

        System.out.println("The map contains this value " + students.containsValue("Gani"));
    }
}

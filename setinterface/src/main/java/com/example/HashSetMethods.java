package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
 * Looking at different operations for the Set interface
 * 1. Intersection
 * 2. Union
 * 3. Difference
*/
public class HashSetMethods {
    public static void main(String[] args) {

        //*********************** WORKING WITH FRIEND CLASS USING HASHSET*************************************** */
        HashSet<Friend> friends = new HashSet<>();

        friends.add(new Friend("Eugene", 26));
        friends.add(new Friend("John", 21));
        friends.add(new Friend("Doe", 20));

        // toString() method provides a customized way to list the HashSet elements
        System.out.println(friends.toString());

        
        //*********************** DIFFERENT OPERATIONS USING HASHSET*************************************** */
        // Creating a new HashSet object
        Set<Integer> x = new HashSet<>();
        
        // Adding elements to the HashSet using the Arrays.asList() method
        x.addAll(Arrays.asList(1,3,5,7));

        // Creating another HashSet object
        Set<Integer> y = new HashSet<>();
        // Adding elements to the HashSet using the Arrays.asList() method
        y.addAll(Arrays.asList(5,2,9,4));

        //Union
        // create a new union HashSet object that has elements from x
        Set<Integer> union = new HashSet<>(x);
        union.addAll(y);
        System.out.println("Union of the two sets");
        System.out.println(union);

        // Intersection
        Set<Integer> intersect = new HashSet<>(x);
        System.out.println("Intersection of the sets");
        intersect.retainAll(y);
        System.out.println(intersect);

        // Difference
        Set<Integer> diff = new HashSet<>(x);
        System.out.println("Difference of the sets");
        diff.removeAll(y);
        System.out.println(diff);
    
    }
}

class Friend {
    String name;
    int age;

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Overriden the Object.toString() method and implemented it my own way
    public String toString(){
        return name + " " + age;
    }
}

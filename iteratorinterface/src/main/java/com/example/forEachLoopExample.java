package com.example;

import java.util.*;

/* The forEach() method takes the Lambda Expression as a parameter. 
   This Lambda Expression is called for each element of the collection.
*/
public class forEachLoopExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Kia");
        cars.add("BMW");

        cars.forEach((car) -> {
            System.out.println(car);
        });
    }
} 

package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSet {
    public static void main(String[] args) {
        int[] nums = {24, 56, 43, 343, 51, 40};

        //using a for loop I add all elements to a new HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }

        System.out.println("Unordered elements in a HashSet: ");
        System.out.println(hashSet);

        // Show ordered elements in a TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int i=0; i<nums.length; i++){
            treeSet.add(nums[i]);
        }

        System.out.println("ordered elements in a TreeSet: ");
        System.out.println(treeSet);

        

    }
}

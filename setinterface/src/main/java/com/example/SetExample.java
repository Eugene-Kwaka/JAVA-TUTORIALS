package com.example;

import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
    public static void main( String[] args )
    {
        Set<String> names = new HashSet<String>();
        names.add("Eugene");
        names.add("Kwaka");
        names.add("Kirima");

        System.out.println(names);
    }
}

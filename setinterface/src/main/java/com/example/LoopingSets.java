package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopingSets {
    public static void main(String[] args) {
        Set<String> anime = new HashSet<>();
        anime.add("One-Piece");
        anime.add("Naruto");
        anime.add("Attack on Titans");
        anime.add("Berserk");

        // Iterator
        // System.out.println("====== Using the iterator method ======");
        // //Create an iterator variable from Iterator interface
        // Iterator<String> iter = anime.iterator();
        // while(iter.hasNext()){
        //     System.out.println(iter.next());
            
        // }
        // // ForEach()
        // System.out.println("====== Using forEach() ======");
        // for(String movie : anime){
        //     System.out.println(movie);
        // }
        
        // // lambda expression inside a forEach()
        // System.out.println("====== Using lambda Expression in a forEach() ======");
        // anime.forEach(movie -> System.out.println(movie));

        // // StreamAPI
        // System.out.println("====== Using Stream() ======");
        // anime.stream().forEach(movie -> System.out.println(movie));

        // forEachRemaining
        Iterator<String> it = anime.iterator();
        it.forEachRemaining(movie -> {
            System.out.println(movie);
        });

    }
}

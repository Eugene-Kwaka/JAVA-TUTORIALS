package com.eugene;

public class Main {
    public static void main(String[] args) {
        ItemTableAccessor itemAccessor = new ItemTableAccessor();

        Item fruitReturned = itemAccessor.selectItemById(1);
        System.out.println(fruitReturned);
    }
}
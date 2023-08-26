package com.eugene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DB {
    // Creating a list to store the items
    private List<Item> itemList = new ArrayList<>();
    private int idGenerator = 0;

    // initialize with some items
    public void init(){
        // This method adds new objects to the array specified(itemList).
        // it takes the array as its first argument and adds each item in the order which they appear in the array
        Collections.addAll(itemList, new Item(++idGenerator, "Crisps", 10.25), 
                                 new Item(++idGenerator, "Choco", 7.25),
                                 new Item(++idGenerator, "Bread", 3.25),
                                 new Item(++idGenerator, "Milk", 2.25));
    }
    
    // Create
    public void addItem(Item item){
        // an item passed to be added the db will get an id using setId() method from Item class.
        // The setId() method autoincrements the idGenerator which is assigns a new id to the item
        item.setId(++idGenerator);
        // add the item to itemList
        itemList.add(item);
    }

    // Read
    public Item getItemById(int id){
        // For each item if the item's id is equal to the id passed as argument
        for(Item item : itemList){
            if(item.getId() == id){
                return item;
            }
        }
        // if item not found by its id return nothing
        return null;
    }

    public List<Item> getaAllItems(){
        return itemList;
    }

    // Update
    public void updateItem(Item itemUpdated){
        // For each item in the itemList
        for(Item item : itemList){
            //check whether id matches the new item's id passed as param
            // them assign newname & price to the new item passed
            if (item.getId() == itemUpdated.getId()){
                item.setName(itemUpdated.getName());
                item.setPrice(itemUpdated.getPrice());
            }
        }
    }
    // Delete
    public void deleteItem(int id){
        // For each item in the list
        for (Item item : itemList){
            // if the item's id matches the id passed as an argument
            // remove the item
            if (item.getId() == id){
                itemList.remove(item);
            }
        }
    }



    
}

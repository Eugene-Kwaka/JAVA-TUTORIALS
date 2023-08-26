package com.eugene;
import io.javalin.Javalin;
import io.javalin.http.Context;

import java.util.List;

// THIS CLASS CONTAINS THE JAVALIN ENDPOINTS
public class Controller {
    // Initialize my db
    DB db = new DB();

    public void setUp(){
        Javalin app = Javalin.create().start(8080);

        //create endpoints
        // Get all items
        app.get("/items", this::getAllItems);

        // get single item
        app.get("/items/{id}", this::getItemById);

        // add item
        app.post("/items/", this::addItem);

        // update item
        app.put("/items/{id}", this::updateItem);

        // Delete item
        app.delete("/items/{id}", (ctx) -> {
            this.deleteItem(ctx);
        } );
    }


    //handlers
    /* Handlers do not return anything, so they are void. I am passing the  */
    // Get all items
    public void getAllItems(Context ctx){
        // Use data from db to return the item list
        List<Item> itemListReturned = App.db.getaAllItems();
        //send the info to the response body using json 
        ctx.json(itemListReturned);
    }

    // get single item
    public void getItemById(Context ctx){
        // get id as String from the path using the ctx.pathParam()method
        String paramValue = ctx.pathParam("id");
        // change the id from String to integer
        int id = Integer.parseInt(paramValue);
        // use db to get the info
        Item itemReturned = App.db.getItemById(id);
        // display the info with json
        if (itemReturned != null){
            ctx.json(itemReturned);
        } else{
            ctx.status(400);
        }
        
    }

    // add item
    public void addItem(Context ctx){
        // Jackson provides Object Mapper while Javalin provides bodyAsClass
        // The ctx.bodyAsClass converts the request body into an instance of the Item class
        Item itemToAdd = ctx.bodyAsClass(Item.class);
        App.db.addItem(itemToAdd);
    }

    // update item
    public void updateItem(Context ctx){
        // Same thing happens here where the request body is converted to a new instance of an Item class 
        Item itemToUpdate = ctx.bodyAsClass(Item.class);
        App.db.addItem(itemToUpdate);
    }


    // Delete item
   public void deleteItem(Context ctx){
        String idText = ctx.pathParam("id");
        int id = Integer.parseInt(idText);
        App.db.deleteItem(id);

    }



}

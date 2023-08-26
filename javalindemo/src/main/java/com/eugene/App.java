package com.eugene;

public class App 
{
    public static DB db = new DB();
    
    public static void main( String[] args )
    {
        DB db = new DB();
        // creates a List of item objects in the new db instance
        db.init();

        // Controller
        Controller controller = new Controller();
        controller.setUp();
        
    }
}

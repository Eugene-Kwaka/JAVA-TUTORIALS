package com.eugene;

import java.sql.*;

public class DBConnectionUtility {
    static String url = "jdbc:postgresql://localhost/JDBC-Demo";
    static String username = "postgres";
    static String password = "password";

    // Create a method that returns a connection
    static Connection getConnection(){

        Connection connection = null;

        //Because I'm dealing with a connection with SQL, I need to catch any exceptions within a try/catch block
        try {
            // load driver class
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            //Check if connection is valid
            System.out.println(connection.isValid(5));

        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }



}

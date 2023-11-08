package com.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) {
        Connection connection = PSQLConnectionUtility.getConnection();
        try{
            System.out.println(connection.isValid(5));
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
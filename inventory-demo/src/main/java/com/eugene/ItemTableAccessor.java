package com.eugene;

import java.sql.*;

public class ItemTableAccessor {
    Item selectItemById(int id) {
        Item fruit = new Item();
        //JDBC-Code
        // This try-with-resources 
        // Get connection
        try(Connection connection = DBConnectionUtility.getConnection();){
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM item WHERE " + id;
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                fruit.setId(rs.getInt("id"));
                fruit.setName(rs.getString("name"));
                fruit.setPrice(rs.getInt("price"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return fruit;
    }
}

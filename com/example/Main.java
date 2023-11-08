package com.example;


// To use jdbc in my project, I need to install the necessary package
import java.sql.*;

/* I need for packages to successfully connect to the database:
1. Database URL
2. Username
3. Password
4. Database driver
*/

public class Main {
    public static void main(String[] args) {
        Connection connection = PSQLConnectionUtility.getConnection();
        try {
            System.out.println(connection.isValid(5));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
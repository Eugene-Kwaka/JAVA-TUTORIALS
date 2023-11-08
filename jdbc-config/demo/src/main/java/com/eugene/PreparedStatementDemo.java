package com.eugene;
import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection conn = null;

        PreparedStatement pstmt = null;

        String sql = "INSERT INTO employee (id, fname, lname, age) values(?,?,?,?)";

        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/JDBC-Demo", "postgres", "password");

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 87);
            pstmt.setString(2, "Eugene");
            pstmt.setString(3, "Kwaka");
            pstmt.setInt(4, 5);
            int affectedRows = pstmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");
        }
        catch (SQLException e){
            e.printStackTrace();
        } 
        // Catches an exception for the JDBC Driver class name if not found
        catch (ClassNotFoundException e) { 
            e.printStackTrace();
        }
        // Runs regardless of the outcome
        finally {
            try {
              pstmt.close();
              conn.close();
            } catch (Exception e) {
              e.printStackTrace();
            }
          }

    }
}

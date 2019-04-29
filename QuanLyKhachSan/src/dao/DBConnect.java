/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CLAY
 */
public class DBConnect {
     public static Connection getConnection(){
        Connection cons=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
             cons =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sanglee","1272873921");
             return cons;
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
  
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}

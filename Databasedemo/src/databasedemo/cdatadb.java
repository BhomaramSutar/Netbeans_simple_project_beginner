/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedemo;

import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MJ
 */
public class cdatadb {
    
    public static Connection conn() throws SQLException ,ClassNotFoundException {
        
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        
        return con;
        
    }
    
    public static void main(String args[])
    {
        try{
            Connection con = conn();
            Statement st = con.createStatement();
            
           int cid = 1;
//           String cname = "vishal";
           String query;
           query="INSERT INTO CDATA VALUES (5,'VISHAL')";
           st.executeUpdate(query);
           query="INSERT INTO CDATA VALUES (6,'Raj')";
           st.executeUpdate(query);
            query="INSERT INTO CDATA VALUES (7,'Veer')";
           st.executeUpdate(query);
             query="INSERT INTO CDATA VALUES (8,'B')";
           st.executeUpdate(query);
//            Statement s1 = con.createStatement();
            
        
            



    
           ResultSet rs = st.executeQuery("select * from cdata");
           
           while(rs.next())
           {
               System.out.println(st);
           }
            
        }
        catch(Exception e){
                System.out.println(e);
        }
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author MJ
 */
public class swingdb {
    
    public static Connection sdb() throws SQLException , ClassNotFoundException{
        
        Connection db;
        Class.forName("com.mysql.jdbc.Driver");
        db = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        
        return db;
    }
    public static void main(String args[])
    {
        try{
            Connection db = sdb();
                              
            Statement st = db.createStatement();
            String query;
            query = "insert into swing values('"+name+"','"+mname+"','"+lname+"','"+email+"','"+mobile+"','"+address+"')";
            st.executeUpdate(query);
            
            String query3;
            query3="Select * from swing ";
            ResultSet rs = st.executeQuery(query3);
            
            while(rs.next())
            {
                System.out.println(st);
            }
     
        }
        catch(Exception e)
        {
            
        }
    }
}

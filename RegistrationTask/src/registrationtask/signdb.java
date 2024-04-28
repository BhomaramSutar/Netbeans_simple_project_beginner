/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationtask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MJ
 */
public class signdb {
     
    public static Connection signup() throws ClassNotFoundException, SQLException{
        Connection db;
        Class.forName("com.mysql.jdbc.Driver");
        db = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","admin");
        return db;
        
    }
    public static void main(String args[])
    {
        try{
                   
                Connection db = signup();
                Statement st = db.createStatement();
                String query;
                query = "select * from signup";
                st.executeUpdate(query);
                        
                System.out.println("Query is Executed");
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next())
                {
                    System.out.println(st);
               }

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
       public static Connection filedb() throws SQLException ,ClassNotFoundException
    {
        Connection dbs;
        Class.forName("com.mysql.jdbc.Driver");
        dbs = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","admin");
        
        return dbs;
                
    }
    
    
}

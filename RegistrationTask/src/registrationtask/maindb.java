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
import static registrationtask.signdb.signup;

/**
 *
 * @author MJ
 */
public class maindb {
      
    public static Connection regist() throws SQLException ,ClassNotFoundException
    {
        Connection dbs;
        Class.forName("com.mysql.jdbc.Driver");
       dbs = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","admin");
        
        return dbs;
                
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
    try
                  {
                      Connection db = regist();
                      Statement st = db.createStatement();

                      String query;
                      query ="select * from logindb";
                      st.executeUpdate(query);
                        System.out.println("Data Is Inserted in Table:");
          //            String query2;
          //            query2 = "Select * from login";
          //            st.executeUpdate(query2);

//                      ResultSet rs = st.getResultSet();
//                      while(rs.next())
//                      {
//                          System.out.println(st);
//                      }
                                   
               String query2;
                query2 = "select * from signup";
                st.executeUpdate(query2);
                        
                System.out.println("Query is Executed");
                ResultSet rs = st.executeQuery(query2);
                
                while(rs.next())
                {
                    System.out.println(st);
                }
                
                
                
               String query3;
                query3 = "select * from file";
                st.executeUpdate(query3);
                ResultSet rs1 = st.executeQuery(query3);
                 while(rs1.next())
                {
                    System.out.println(st);
                }
                
        }catch(SQLException e)
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
     public static Connection signup() throws ClassNotFoundException, SQLException{
        Connection db;
        Class.forName("com.mysql.jdbc.Driver");
        db = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","admin");
        return db;
        
    }
}

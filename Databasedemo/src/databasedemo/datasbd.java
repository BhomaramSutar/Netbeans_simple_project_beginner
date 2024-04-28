/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedemo;

import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author MJ
 */
public class datasbd {
    
    public static Connection connect() throws SQLException , ClassNotFoundException{
        
        Connection db;
        Class.forName("com.mysql.jdbc.Driver");
        
        db = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        System.out.println("Connection Confirm :");
        return db;
    }
    
    public static void main(String args[])
    {
        try{
            Connection db = connect();
            
            Statement st = db.createStatement();
            
            String query;
//                
//            query= "INSERT INTO DATAS VALUES(1,'VISHAL','V@GMAIL.COM')";
//            st.execute(query);
//            
//            query = "INSERT INTO DATAS VALUES(2,'RAJ','Raj@gmail.com')";
//            st.execute(query);
//            
//            System.out.println("Values are Inserted in table: ");
//            
            String query1;
            query1 = "UPDATE DATAS SET cid=4,cname='rajveers'"+"where cid=3";
            st.executeUpdate(query1);
            System.out.println("Table Is updated :");
            
            String query2;
            query2 = "delete from datas "+"where cid = 1";
            st.executeUpdate(query2);
            System.out.println("Data in Table Is Deleted :");
//            
            ResultSet rs = st.executeQuery("select * from datas");
            
            while(rs.next())
            {
                System.out.println(st);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
            
}

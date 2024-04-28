/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/**Java DataOutputStream class allows an application to 
 * write primitive Java data types to the output stream in a machine-independent way.
 * Java application generally uses the data output stream 
 * to write data that can later be read by a data input stream.
 * @author MJ
 */
public class dataoutputstream {
    
    public static void main(String args[])
    {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\MJ\\Desktop\\abc.txt");
            DataOutputStream ds = new DataOutputStream(fos);
            
            ds.writeInt(65);
           //ds.writeChar("Name: Vishal Sutar");
            ds.flush();
            
//            ds.getClass();
//            ds.toString();
//            ds.writeBoolean(true);
            
            ds.close();
            System.out.println("Created successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

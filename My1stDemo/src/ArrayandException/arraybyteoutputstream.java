/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author MJ
 */
public class arraybyteoutputstream {
    public static void main(String args[])
    {
        try{
               FileOutputStream fout1=new FileOutputStream("C:\\Users\\MJ\\Desktop\\tet.txt");      
               FileOutputStream fout2=new FileOutputStream("C:\\Users\\MJ\\Desktop\\aj.txt");  
//               
                
                ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
                
                bout.write(65);    
                bout.writeTo(fout1);    
                bout.writeTo(fout2);    

                bout.flush();  //Flush - no duplicate value..  
                bout.close();//has no effect    
                System.out.println("Success...");    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

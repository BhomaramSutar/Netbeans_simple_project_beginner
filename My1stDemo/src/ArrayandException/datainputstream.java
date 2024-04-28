/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/**
 *
 * @author MJ
 */
public class datainputstream {
    public static void main(String args[])
    {
        try
        {
            InputStream is = new FileInputStream("C:\\Users\\MJ\\Desktop\\files\\ab.txt");
            DataInputStream ds = new DataInputStream(is);
            //D:\\
         int count = is.available();
         byte[] sr = new byte[count];
         
                ds.read(sr);
                    for (byte bt : sr) {  
                    char k = (char) bt;  
                    System.out.print(k+"-"); } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
               
    }
}

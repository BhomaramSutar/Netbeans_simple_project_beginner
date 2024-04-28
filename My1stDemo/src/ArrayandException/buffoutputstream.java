/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
import java.io.BufferedOutputStream;
/**
 *Java BufferedOutputStream class is used for buffering an output stream.
 * It internally uses buffer to store data. 
 * It adds more efficiency than to write data directly into a stream. 
 * So, it makes the performance fast.
 * @author MJ
 */
public class buffoutputstream {
    public static void main(String args[])
    {
        try
        {
            //file output stream for creating a file
            FileOutputStream fout = new FileOutputStream("C:\\Users\\MJ\\Desktop\\file.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fout);
             //buffered output stream to store data and adds more efficiency     
                String s ="HELLO WELCOME TO JAVA PROGRAMMING ...";
                byte b[]=s.getBytes();
                fout.write(b);
                fout.flush();
                fout.close();
                
                System.out.println("File Created Successfully..");
             
                //file input stream to access the file 
                FileInputStream fin =new FileInputStream("C:\\Users\\MJ\\Desktop\\file.txt");
                BufferedInputStream bin = new BufferedInputStream(fin);
                int i=0;
                while((i=bin.read())!=-1)
                {
                    System.out.println((char)i);
                }
                fin.close();
                bin.close();
               
                System.out.println(" Task Completed successfully..");
        }
        catch(Exception e)
            {
                 System.out.println(e);
            }
    }
    
}

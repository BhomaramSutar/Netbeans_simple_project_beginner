/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/**Java SequenceInputStream class is used to read data from multiple streams. 
 * It reads data sequentially (one by one).
 *
 * @author MJ
 */
public class sequanceinput {
    public static void main(String args[])
    {
        try{
                FileInputStream fin = new FileInputStream("C:\\Users\\MJ\\Desktop\\file.txt");
                FileInputStream fin2 = new FileInputStream("C:\\Users\\MJ\\Desktop\\ab.txt");
//                 FileOutputStream fout=new FileOutputStream("C:\\Users\\MJ\\Desktop\\testout.txt");      
                
                SequenceInputStream sq = new SequenceInputStream (fin,fin2);
                
                int i;
                while((i=sq.read())!=-1)
                {
                    System.out.println((char)i);
                }
                fin.close();
                fin2.close();
                sq.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

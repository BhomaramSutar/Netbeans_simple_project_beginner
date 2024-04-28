
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author MJ
 */
public class sequenceoutputstring {
    public static void main(String args[])
    {
        try{
                FileInputStream fin = new FileInputStream("C:\\Users\\MJ\\Desktop\\file.txt");
                FileInputStream fin2 = new FileInputStream("C:\\Users\\MJ\\Desktop\\ab.txt");
                 FileOutputStream fout=new FileOutputStream("C:\\Users\\MJ\\Desktop\\testout.txt");      
                
                SequenceInputStream sq = new SequenceInputStream (fin,fin2);
                
                int i;
                while((i=sq.read())!=-1)
                {
                     fout.write(i);  
                }
                fin.close();
                fin2.close();
                fout.close();
                sq.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

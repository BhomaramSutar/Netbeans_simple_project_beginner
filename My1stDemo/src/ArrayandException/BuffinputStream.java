/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
import java.io.BufferedInputStream;

/**
 *Java BufferedInputStream class is used to read information from stream. 
 * It internally uses buffer mechanism to make the performance fast.
 * When the bytes from the stream are skipped or read, the internal buffer automatically
 * refilled from the contained input stream, many bytes at a time
 * @author MJ
 */
public class BuffinputStream {
    public static void main(String args[])
    {
        try
        {
//            BufferedInputStream bs = new BufferedInputStream("C:\\Users\\MJ\\Desktop\\abc.txt");4
            FileInputStream in = new FileInputStream("C:\\Users\\MJ\\Desktop\\files\\abc.txt");
            BufferedInputStream bs = new BufferedInputStream(in);
            
            int i = 0;
            
            while((i=in.read())!=-1)
            {
                System.out.println((char)i);
            }
            
            in.close();
            bs.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

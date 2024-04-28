/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/**
 *Java FileOutputStream is an output stream used for writing data to a file.
 * If you have to write primitive values into a file, use FileOutputStream class.
 * You can write byte-oriented as well as character-oriented data through FileOutputStream class
 * But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
 * @author MJ
 */
public class fileoutstream {
    public static void main(String args[])
    {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\MJ\\Desktop\\ab.txt");
            String s = "Name: Rajveer Singh ";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            
            System.out.println("File Created Suceessfully ... ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;

import java.io.FileOutputStream;

/**
 *
 * @author MJ
 */
public class fileio {
     public static void main(String args[])
    {
            try
            {   //StringBuilder sb = new StringBuilder();
                FileOutputStream fout=new FileOutputStream("C:\\Users\\MJ\\Desktop\\ac.txt"); 
//                    System.out.println(fout);
                   // sb.append("Hello World");
                   // System.out.println(sb);
                    System.out.println(fout);
                    fout.write(65);
                    fout.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
    }       
}

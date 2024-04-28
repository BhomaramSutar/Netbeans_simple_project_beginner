/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/*
 *Java FileInputStream class obtains input bytes from a file.
 * It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
 * You can also read character-stream data.
 * But, for reading streams of characters, it is recommended to use FileReader class.
 *
 * @author MJ
 */
public class fileinputstream {
    
    public static void main(String args[])
    {
        try{           
        
                FileInputStream fin=new FileInputStream("C:\\Users\\MJ\\Desktop\\ak.txt");
               // C:\\Users\\MJ\\Desktop\\abc.txt
                int i = 0;
                 while((i=fin.read())!=-1)   
                {
                    System.out.println((char)i);
                    
                }
//                        System.out.println(fin.read(fin!=-1));
                fin.close();
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

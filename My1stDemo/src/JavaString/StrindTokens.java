/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;
import java.util.StringTokenizer;
/**
 *
 * @author MJ
 */
public class StrindTokens {
    
    public static void main(String args[])
    {
        StringTokenizer st = new StringTokenizer("I Am A Java Developer");
        
        StringTokenizer sp = new StringTokenizer("I Am A Java Developer");
         
          System.out.println("Token  is : "+st.countTokens());
        while(st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
        
       //System.out.println(" String is working : "+st.nextToken());
        
        
         System.out.println("Token in the String is : "+sp.countTokens());
         
                while(sp.hasMoreTokens())
        {
            System.out.println(sp.nextElement());
           // System.out.println("Token in the String is : "+sp.countTokens());
        }     
    }
}


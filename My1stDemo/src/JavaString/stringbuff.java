/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;

/**
 *
 * @author MJ
 */
public class stringbuff {
     
    public static void main(String args[])
    {
          StringBuffer sb=new StringBuffer("Hello ");  //16 + string 
          sb.append("Welcome");
                System.out.println(sb);
               
           sb.reverse();
           System.out.println(sb);
            
           sb.replace(2, 6, "Veer");
           System.out.println(sb);
           
         //  sb.capacity();
          // System.out.println(sb.capacity());
           
             sb.ensureCapacity(5);
           System.out.println(sb.capacity());
           
           sb.delete(5, 10);
           System.out.println(sb);
        
           sb.insert(0,"Raj");
           System.out.println(sb);
           
           sb.reverse();
           System.out.println(sb);
           
           sb.ensureCapacity(5);
           System.out.println(sb.capacity());
           
           sb.delete(5, 10);
           System.out.println(sb);

    }
}

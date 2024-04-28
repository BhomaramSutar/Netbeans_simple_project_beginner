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
public class StringBuild {
    public static void main(String args[])
    {
    StringBuilder sb = new StringBuilder("Welcome");
      
           sb.append("Java Programming");
                System.out.println(sb);
                
           sb.reverse();
           System.out.println(sb);
           
           sb.insert(0,"Raj");
           System.out.println(sb);
           
           sb.replace(3, 6, "Veer ");
           System.out.println(sb);
           
           sb.insert(8,"gni");
           System.out.println(sb);
           
   
           System.out.println(sb.capacity());
           
 
           sb.reverse();
           System.out.println(sb);
           
           sb.ensureCapacity(5);
           System.out.println(sb.capacity());
           
           sb.delete(5, 10);
           System.out.println(sb);
    
    }
}
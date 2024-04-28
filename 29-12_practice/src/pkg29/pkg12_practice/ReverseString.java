/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg12_practice;
import java.util.*;
/**
 *
 * @author MJ
 */
public class ReverseString {
    // reverse a String
     public static void main(String args[]) 
     {
              String name, rev="";
              Scanner in=new Scanner(System.in);
               
              System.out.println("Enter the string to reverse");
              
              name=in.nextLine();
              
              int length=name.length();
              for(int i=length-1;i>=0;i--)
                rev=rev+name.charAt(i);
              System.out.println("Reversed string: "+rev);
    }
}
 


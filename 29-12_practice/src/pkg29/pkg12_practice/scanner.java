/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg12_practice;
import java.util.*;

/**
 *scanner is used for input 
 * we can take input at the time of compilation of program
 * @author MJ
 */
public class scanner {
        
    // swapping of two numbers using third variable
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System . in);
            int a , b,temp;
            System.out.println("Enter number a and b");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Using 3rd variable");
            System.out.println("Before Swappning :\t "+"a =\t"+a+"and \t "+"b = "+b);
            
            temp = a;
            a = b;
            b = temp;
            
             System.out.println("After Swappning "); 
                 
               System.out.println("After swapping: "+"a \t"+a +"  " +"b \t"+ b); 
                    
    }
}


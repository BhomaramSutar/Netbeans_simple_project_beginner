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
public class swap {
    public static void main(String args[])
    {
     Scanner sc = new Scanner (System . in);
     int a , b;
            System.out.println("Enter number a and b");
            a = sc.nextInt();
            b = sc.nextInt();
            
     System.out.println("without Using 3rd variable");
                   System.out.println("Before Swappning :\t "+"a =\t"+a+"and \t "+"b = "+b);
                 a = a + b;
                 
                 b = a - b;
                 a = a - b;
                 
                  System.out.println("After swapping: "+"a \t"+a +"  " +"b \t"+ b); 
    }
}
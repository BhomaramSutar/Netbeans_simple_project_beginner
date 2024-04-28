/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsconcept;

/**
 *
 * @author MJ
 */
public class overriding extends overloading{
    
     void calculation(int a , int b) 
    {
        int sum;                    //Addition
        sum = a + b+5;
        System.out.println("Addition is: "+sum);
    } 
     
     
   public static void main(String args[])
    {
         overloading or = new overriding();//upcasting 
        
  
        or.calculation(10, 30);
       or.calculation(10, 60, 20);
        
    }

    
}

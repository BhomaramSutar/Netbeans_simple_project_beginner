/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg12_practice;

/**
 *
 * @author MJ
 */
public class NewClass1 extends NewClass{
    /*public void func(int c , int d)
    {
        System.out.println(".........Function Overriding ...............");
        int sub;
        sub = c - d;
        System.out.println("Subtraction is : \t "+sub+"\n");
     
    }*/
    public static void main(String args[])
    {
        NewClass1 n= new NewClass1();
        
          n.cal(10, 5);
          n.func(5, 4);
         
    }
    
}

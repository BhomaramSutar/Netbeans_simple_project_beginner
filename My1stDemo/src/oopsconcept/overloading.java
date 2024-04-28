/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsconcept;

/**
 * method overloading is a class in which two or more methods with same name 
 * but different parameters is known as method overloading
 * it is example of compile time polymorphism
 * it is performed within the class
 * @author MJ
 */
public class overloading {
    
    void calculation(int a , int b) //method overloading 1st
    {
        int sum;                    //Addition
        sum = a + b;
        System.out.println("Addition is: "+sum);
    }
    
    void calculation(int a , int b, int c)  //2nd 
    {
        int sub;                    //subtraction
        sub = a - b - c;
        System.out.println("Subtraction is : "+sub);
                
    }
    
    public static void main(String args[])
    {
        //overloading ol = new overloading();
        overloading ol = new overriding();
        ol.calculation(10, 4);
        ol.calculation(25, 4, 10);
        
        
       // calculation();
        
    }
}

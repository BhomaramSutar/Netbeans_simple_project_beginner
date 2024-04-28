/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consandencap;

/**a constuctor has a same name as a class name 
 * it has a two types single and parameterize constructor
 *
 * @author MJ
 */
public class constructor {
    
    //int add,sub;
    
    constructor(int a, int b)//parametrizeed constructor 
    {
        int add = a + b;
        System.out.println("Addition is : "+add);
        
      
        int sub = a - b;
        System.out.println("Subtraction is :"+sub);
    }
    
    constructor()//default constructor
    {
        int d =5 ,c=6 ;
        int mul = d * c;
        System.out.println("Multiplication is :"+mul);
    }
    
    public static void main(String args[])
    {
        constructor c = new constructor();
        constructor c1 = new constructor(10,5);
    }
  
}

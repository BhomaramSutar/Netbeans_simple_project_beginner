/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my1stdemo;

/**
 *inheritance single
 * @author MJ
 */
public class inheritchild extends inherit{

  public int mul,sum,sub;
    void mul(int a , int b)
    {
      
        mul = a * b;
        System.out.println(mul);
    
       
    }
    public static void main()
    {
         System.out.println("SINGLE LEVEL INHERITANCE");
         
         inherit i = new inherit();
         
                 i.add(15,5);
                 i.sub(15,5);
                 
    }
   
}

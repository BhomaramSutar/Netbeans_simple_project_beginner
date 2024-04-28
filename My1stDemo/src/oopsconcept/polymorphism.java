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
public class polymorphism extends a{
    void ab(int a , int b)
    {
        int sum;
        sum = a + b;
        System.out.println(sum);
    }
    
    public static void main(String args[])
    {
        a p = new polymorphism(); //upcasting 
       
      // polymorphism p = (polymorphism)new a();
        p.ab(10,9);
        System.out.println(p.sum);
    }
}

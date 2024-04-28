/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author MJ
 */
public class circle {
    operation op;
    double pi=3.14;
    
    double area(int radius)
    {
        op=new operation();
        int rsquare = op.square(radius);//code reusability
        return pi*rsquare;
    }
    
    public static void main(String args[])
    {
        circle c = new circle();
        double result = c.area(5);
        System.out.println(result);
    }
    
}

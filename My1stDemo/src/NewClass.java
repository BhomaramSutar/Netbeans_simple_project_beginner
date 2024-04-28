/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MJ
 */
public class NewClass {
    int add;
    void add(int a,int b)
    {
        add = a + b;
       // System.out.println("Addition is "+add);
    }
    
    int sub;
    void sub(int c, int d)
    {
        sub = c - d;
        //System.out.println("Addition is "+sub);
    }
    
    public static void main(String args[])
    {
        NewClass nc = new NewClass();
        
        nc.add(15,5);
        nc.sub(15,5);
        
        System.out.println("Addition is : \t "+nc.add+"\n"+"Subtraction is /t  :"+nc.sub);
    }
}


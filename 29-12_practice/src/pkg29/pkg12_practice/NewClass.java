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
public class NewClass {
    
    void NewClass() //constructor
    {
        System.out.println("Practice Session is on Process .....:\n ");
    }
    
    //Encapsulation
    
    // Employee name and id 
    public String name;
    public int eid;
    
      
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
     public int getEid()
    {
        return eid;
    }
    
    public void setEid(int eid)
    {
        this.eid = eid;
    }
    
  
   //method overloading 
    void cal(int a,int b)
    { System.out.println(".........Function Overloding ...............");
        int mul;
        mul = a * b;
        System.out.println("Multiplication is  : \t"+mul+"\n");
    }
    
    void cal(int a,int b,int c)
    { System.out.println(".........Function Overloding ...............");
        c = a + b;
        System.out.println("Addition : \t"+c+"\n");
    }
    
    /*void func(int c, int d)
    {
        int a;
        return a*c;
    }*/
    void func(int c , int d )
    {
        System.out.println("Function is Working");
    }
    
    public static void main(String args[])
    {
        //NewClass nc = new NewClass();
        NewClass nc = new NewClass1();
        
        nc.setEid(101);
        nc.setName("vishal");
        
        System.out.println("Employee Data ..: \n");
        System.out.println(nc.getEid() +"\t"+nc.getName());
       
        
        System.out.println("Operation data ...: \n");
        nc.cal(15, 5);
        nc.cal(5, 3, 4);
        nc.cal(5, 4);
    
        
    }

 
}

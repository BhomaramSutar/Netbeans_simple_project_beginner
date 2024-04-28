/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg12_practice;
import java.util.*;
/**
 * method overloading 
 * method overriding
 * constructor
 * scanner 
 * string in build function 
 * Inheritance - single - multiple -
 * Encapsulation get and set method - Employee data name & id 
 * 
 * @author MJ
 */
public class Main extends NewClass1{

    
          
    public static void main(String[] args) {
        // TODO code application logic here
    
       Main ob = new Main();
    
          ob.NewClass();//constructor
         
          
        System.out.println("...........................................\n");
        ob.setEid(101);
        ob.setName("Vishal");
        
        System.out.println("Employee data .. : \n ");
        System.out.println(ob.getEid() + " \t " + ob.getName());
        
       System.out.println(".................................................\n");
         
        System.out.println("Operation data...: ");
       
        
        ob.cal();
        ob.cal(10, 5, 3);
        ob.func(8, 5);
        
        
        System.out.println("...............String Functions ...............");
        
        System.out.println("Enter String : ");
        
       Scanner sc = new Scanner(System.in);
    
        String st = sc.nextLine();
        System.out.println("String is..: \t"+st+"\n");
       
        String ab = st.toUpperCase();
        String ab1 = st.toLowerCase();
        
        System.out.println("\n String To UpperCase \t "+ab+"\n");
        System.out.println("\n String To LowerCase \t "+ab1+"\n");
        
        System.out.println(ab.concat(" \t Hello welcome \t"+ab1+"\n"));
        
        System.out.println(ab.equals(st));
    }
}

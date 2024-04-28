/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkg12_practice;
import java.util.*;
/**
 *
 * @author MJ
 */
public class Addition {
    double a,b;
    void add(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Value of a : ");
    a=sc.nextDouble();
    
    System.out.println("Enter Value of b : ");
    b=sc.nextDouble();
    
    double c=a+b;
    System.out.println("addition is"+c);
   
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;
import java.util.*;
/**
 *
 * @author MJ
 */
public class Stringbuffer {
        public static void main (String args [])
        {
                   StringTokenizer st  =  new StringTokenizer(" My ,Name ,is Anthony ");
            while (st.hasMoreTokens()) 
           {
                System.out.println("New Token is " + st.nextToken(","));//separate the string by coma , 
                // gives separated strings like :-  new token is my     new token name   
                System.out.println(st.countTokens());
            }
        }
}

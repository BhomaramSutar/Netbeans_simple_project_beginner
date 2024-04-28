/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consandencap;

/**
 *
 * @author MJ
 */
public class stringfunc {
    public static void main(String args[])
    {   // Strings for functions ... 
        String s1 = "Hello ;world";
        String s2="UPPER CASE TO LOWER CASE";
        String s7 = "lowercase to uppercase";
        String s3="java programmer";
        String s4[]={"a","b","c","d","e"};
        String s5 = "name";
        String s6 = "name";
        String s8 = "t r  i   m";
       // stringfunc s = new stringfunc();
       String s9 = "    name   name  ";
        int i=2;
        System.out.println(s1.charAt(1)); //gives the character stored at index 7
        System.out.println(s1.length());    // gives the lenght of the string 
        System.out.println(s1+": welcome :"+s3); // concatination of a string using + operator
        System.out.println(s1.concat(s8));  // concatination of a string using concat inbuild function
        
        System.out.println(s5.replace('a', 'v')); // replacing alphabet a to v in string 
        System.out.println(s1.equals(s6)); // checks the string is same or not
        System.out.println(s5.equals(s6)); 
        System.out.println(s1.split(s6)); // split the string into two parts
        
        System.out.println(s1.split("e"));
        
            String a = s1.substring(1,7);
             System.out.println("Substring example : \t "+a);
             
        System.out.println("Index example : \n"+s1.indexOf(';',2)); // gives the index value of e
        System.out.println(s2.toLowerCase()); // change the string uppercase to lowercase
        System.out.println(s7.toUpperCase()); // change the string lowercase to uppercase
        System.out.println(s8.trim()); 
         // use for the space , if we have given lots of space while giving input (string / int) 
        
           System.out.println(s9.trim()); 
        System.out.println(s1.equalsIgnoreCase(s2)); // it ignores the string weather it is equal or not
        System.out.println(s1.substring(1,7));  // prints the string from index value 1 to 7 
        
        System.out.println(s1.substring(2,5)); 
        System.out.println(String.valueOf(i)); // typecasting - change the type int to string
        
        System.out.println(s5.compareTo(s3));
             System.out.println(s5.compareTo(s2));
             System.out.println(s5.compareTo(s6));
             System.out.println(s5.compareTo(s8));
    }
}

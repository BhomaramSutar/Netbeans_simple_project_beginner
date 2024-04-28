package my1stdemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *multilevel inheritance 
 * 1st class inherit
 * 2nd class inherit child 
 *inherit class is extend by inherit child class and
 * inherit child class extend by the multilevel inherit class
 * it is known as a multilevel inheritance where 
 * there is a chain inheritance and
 * 
 * @author MJ
 */
public class multilevelinherit extends inheritchild {
    
    public static void main(String args[])
    { System.out.println("MULTILLEVEL INHERITANCE");
    
    multilevelinherit mi = new multilevelinherit();
      /* inheritchild in = new inheritchild();
        in.mul(15,5);
        
        inherit i = new inherit();
        i.add(15,5);
        i.sub(15,5);
*/
       mi.mul(15,5);
       mi.add(15,5);
       mi.sub(15,5);
         
    }
}

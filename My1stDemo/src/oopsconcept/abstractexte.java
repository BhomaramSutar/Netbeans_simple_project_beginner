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
public class abstractexte extends abstractclass{
    
    void run()
    {
        System.out.println("System is running :");
    }
    
    public static void main(String args[])
    {
        abstractclass ab = new abstractexte();//upcasting
        
        ab.run();
        
    }
}

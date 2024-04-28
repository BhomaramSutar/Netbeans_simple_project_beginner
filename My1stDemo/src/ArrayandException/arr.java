/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;

/**
 *
 * @author MJ
 */
public class arr {
    
    public static void main(String args[])
    {
        try{
            String[] array = new String[2];
            array[0] = "vishal";
            array[1] = "Sutar";
             System.out.println(array);
            //String len = array.length();
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

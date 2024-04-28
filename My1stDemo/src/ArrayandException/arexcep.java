    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayandException;
import java.io.*;
/**
 *
 * @author MJ
 */
public class arexcep {
    public static void main(String args[])
    { 
            try
            {
               //static int a = 5;
                 int arr[][]={{1,2,3},{2,4,5},{4,4,5}}; 
            //int arr[10]={ 1,2,3,4,5,6,7,8,9,10};
                    for(int i=0;i<3;i++)
                    {
                        for(int j=0;j<3;j++)
                        {
                            System.out.println(arr[i][j]+" ");
                        }
                         System.out.println();
                    }
                     //int a = 10 / 0;
                    //  String ab = 102 ; 
            }
            catch(Exception e)
            {
                System.out.println(e);
            }    
    }
}

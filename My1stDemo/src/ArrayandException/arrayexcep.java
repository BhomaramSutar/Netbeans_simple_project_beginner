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
public class arrayexcep {
    
    public static void main(String args[])
    {
        int i = 0;
        try{
            
                int a[] = {1,2,3,4,5};// initialization of array
                        while(i <= 4 ){
                            
                            System.out.println("Array : "+a[i]);
                            i+=1;
                        }
                        
                int[] b = new int[5];
                b[0] = 10 ;    
                b[1] = 20 ;
                b[2] = 30 ;
                b[3] = 40 ;
                b[4] = 50 ;
        
                for(int c=0;c<b.length;c++)
                {//length is the property of array  
//                    System.out.println("length of an array : "+b.length);
                    System.out.println("Araay B : "+b[c] );  
                }  
        
        }catch(Exception e){
            System.out.println(e);
            //System.out.println("IOException");
        }
    }
}


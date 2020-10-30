/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class number1 {
    public static void main(String args[]){
        
        int eileen[] = {22,43,56,66,78};
        int eileencopy[] = new int[5];
        
       // for(int counter=0; counter< eileen.length; counter++){
         //  eileencopy[counter] = eileen[counter];
            
       // }
       
       
       System.arraycopy(eileen, 0, eileencopy, 0, eileen.length);
        eileen[2] =200;
        System.out.println("The eileen array");
        for(int counter=0; counter< eileen.length; counter++){
      
        System.out.println(eileen[counter]);
            
       }
        System.out.println("\nThe eileencopy array");
        for(int counter=0; counter< eileencopy.length; counter++){
          System.out.println(eileencopy[counter]);  
        }
            
       
    }
    
}

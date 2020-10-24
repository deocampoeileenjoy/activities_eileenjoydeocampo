

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class number5 {
    public static String removeDuplicates(String str){
        
       char chars[]= str.toCharArray();
       String newString="";
       for(char c: chars){
           if(newString.indexOf(c)==-1){
               newString=newString+c;
           }
       }
       return newString;
    }
    
    
    
    
    
    
    
     public static void main(String args[]){
         Scanner in =new Scanner(System.in);
         System.out.println("Enter the String: ");
         String s= in.nextLine();
         System.out.println("The original String is: "+s);
         System.out.println("The new String is: "+removeDuplicates(s));
         in.close();
     }
    
    
       
    
    
}

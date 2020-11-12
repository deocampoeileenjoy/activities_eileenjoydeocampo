/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2_assessment;

/**
 *
 * @author hp
 */
public class number3 {
    public void letters(){
        char sky;
        
        
        
        for(sky = 'A' ; sky <= 'Z'; sky++){
            System.out.print(sky + " ");
        }
    }
    
}

class Display{
    public char sky = 'A';
    public static number3 nu = new number3();
    
    
      public static void main(String[] args) {
          nu.letters();
      }
}
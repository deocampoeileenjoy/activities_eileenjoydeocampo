/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.explore;

/**
 *
 * @author hp
 */
public class decreasecounting extends Thread {
    public boolean eileen = false;
    
    
    public void run(){
        
        
        for (int leen=200000;leen>1;leen--){
            if(eileen) break;
            System.out.println("decreasecounting: "+leen);
        }
    }

    }


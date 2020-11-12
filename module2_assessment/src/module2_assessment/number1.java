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
public class number1 {
    public static Operations el = new Operations();
     public static void main(String[] args) {
         
         
         int add = el.add(45, 6);
         System.out.println(add);
     }
}

class Operations{
    public int add (int ed1, int ed2){
        return ed1 + ed2;
    }
}
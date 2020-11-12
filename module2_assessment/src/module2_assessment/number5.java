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
public class number5 {
    public static List arraylist = new List();
      public static void main(String[] args) {
          
          String [] love = {"Twice", "BlackPink", "BTS", "Astro"};
        System.out.println(arraylist.getByIndex(love,0));
      }
}


class List {
    public String getByIndex (String [] array, int index) {
        int Love = array.length;
        return array[index];
    }
}
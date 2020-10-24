
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


public class number3 {
     public static void main(String args[]){
         
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the size of an array: ");
         int size= in.nextInt();
         if(size<=0) {
             System.out.println("Invalid Input");
             System.exit(0);
         }
         int a[] = new int[size];
         System.out.println("Enter the array elements: ");
         for (int i=0;i<size;i++)  {
             a[i]=in.nextInt();
         }
        System.out.println("Original array: ");
         for (int i=0;i<size;i++)  {
             System.out.println(a[i]+ " ");
         }
         double avg= 0.0,sum = 0.0;
          for (int i=0;i<size;i++)  {
              sum = sum+ a[i];
          }
          avg=sum/size;
          System.out.println("\nThe sum is: "+ sum);
          System.out.println("The average of the array is: "+avg);
          System.out.println("The numbers greater than the average: ");
          for (int i=0;i<size;i++)  {
              if(a[i]>avg) {
                  System.out.println(a[i]+ " ");
                  
              }
          }
       in.close();
     }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

import java.util.Scanner;

/**
 *
 * @author rubir
 */
public class Smallest {
      public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner sc = new Scanner(System.in);

      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();

      if ( x < y && x < z )
         System.out.println("First number is smallest.");
      else if ( y < x && y < z )
         System.out.println("Second number is smallest.");
      else if ( z < x && z < y )
         System.out.println("Third number is smallest.");
      else   
         System.out.println("All numbers are equal.");    
    }
  
}

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
public class SimpleInterest {
    public static void main(String args[]) 
    {
        float p, r, t, si;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of Interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time: ");
        t = scan.nextFloat();
       
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}

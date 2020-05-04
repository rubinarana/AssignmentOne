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
public class TryCatchFinally {
    public static void main(String args[])
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        x = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        y = sc.nextInt();
        
        try{
            int z=x/y;
            System.out.println(z);
        }
        catch(Exception e){
            System.out.println("error");
        }
        finally{
            System.out.println("finally block is always executed");
        }  
    }
            
}

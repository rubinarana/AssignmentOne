/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author rubir
 */
public class ArthmeticException {
    public static void main(String args[])
   {
      try{
         int num1=1;
         int num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
           }
      catch(ArithmeticException e){
        System.out.println ("Arithmetic Exception  occurred");
      }
   }
}

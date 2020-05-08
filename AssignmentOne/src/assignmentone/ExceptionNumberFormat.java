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
public class ExceptionNumberFormat {
   public static void main(String args[])
   {
      try{
           int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
       
      }
      catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}  


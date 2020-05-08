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
public class ExceptionStringIndexOutofBound {
  public static void main(String args[])
   {
      try{
	 String str="java";
//	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(5);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException  occurred");
       }
   }
}


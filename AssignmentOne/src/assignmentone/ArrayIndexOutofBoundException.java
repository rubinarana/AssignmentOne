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
class ArrayIndexOutofBoundException {
     public static void main(String args[])
   {
      try{
         int a[]=new int[5];
         a[6] = 9;
      }
         catch(ArrayIndexOutOfBoundsException e){
        System.out.println ("ArrayIndexOutOfBounds occurred");
      }
   }
}

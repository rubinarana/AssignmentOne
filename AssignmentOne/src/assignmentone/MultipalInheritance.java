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
interface Printable{  
void print();  
}  

interface Showable{  
void print();  
}  
  
class MultipalInheritance implements Printable, Showable{  
public void print()
{
    System.out.println("Hello");
}  
public static void main(String args[]){  
    MultipalInheritance obj = new MultipalInheritance();  
    obj.print();  
     }  
}  

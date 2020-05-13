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
interface Politican{
    public void calculateSalary();
}
interface Sportsman{
     public void calculateSalary();
}
class Person implements Politican, Sportsman 
{ 
    public void calculateSalary()
   {
        double taxRate = 0.20;
        double tax = 4000 * taxRate;
        double netSalary = 4000 - tax;
       System.out.println("The total salary is " +netSalary);
   }
    public static void main(String args[]) 
    { 
        Person p = new Person(); 
        p.calculateSalary(); 
    
    } 
} 

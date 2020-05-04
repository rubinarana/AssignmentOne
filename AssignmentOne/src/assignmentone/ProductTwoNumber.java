/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;
import java.util.Scanner;


public class ProductTwoNumber {
    public static void main(String[] args) {
        int num1, num2, mult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        mult = num1 * num2;
        System.out.println("Sum of these numbers: "+mult);
    }
}

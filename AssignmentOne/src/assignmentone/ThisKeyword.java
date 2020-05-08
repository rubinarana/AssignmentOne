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
public class ThisKeyword {
    int rollno;  
    String name;  
    float fee;  
    
    ThisKeyword(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
}  
    
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class Student{  
    public static void main(String args[]){  
    ThisKeyword t1=new ThisKeyword (1,"Ram",5000f);  
    ThisKeyword  t2=new ThisKeyword (2,"Shyam",60f);  
    t1.display();  
    t2.display();  
    }
}  

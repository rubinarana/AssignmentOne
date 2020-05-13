package assignmentone;

abstract class Employee { 
    
    static double taxRate = 0.20;
    static double tax = 4000 * taxRate;
    static double netSalary = 4000 - tax;
    
    abstract void display();
    public float salary() 
    { 
        return (float) netSalary; 
    } 
} 
  
class Manager extends Employee { 
    public float salary() 
    { 
        return (float) netSalary+2000; 
    } 
     void display(){
        System.out.println("Manager's salary : ");
    }
} 
  
class Clerk extends Employee { 
      public float salary() 
    { 
        return (float) netSalary+100; 
    } 
    void display(){
        System.out.println("Clerk's salary :");
    }
} 
   
class questionNine { 
    public static void printNetSalary(Employee e) 
    { 
        System.out.println(e.salary()); 
    } 
  
    public static void main(String[] args) 
    { 
        Employee obj1 = new Manager(); 
        obj1.display();
         printNetSalary(obj1);
  
        Employee obj2 = new Clerk(); 
       obj2.display();
        printNetSalary(obj2); 
    } 
} 
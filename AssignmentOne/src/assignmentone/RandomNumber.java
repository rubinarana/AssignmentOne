package assignmentone;

import java.util.concurrent.ThreadLocalRandom;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Negative Number");
    }
}
class Thread2 extends Thread {
    
    public void run() {
        System.out.println("Even Number");
    }
}
class Thread3 extends Thread {
   
    public void run() {
        System.out.println("Odd Number");
    }
}

public class  RandomNumber {
	public static void main(String args[]) {
            
            for (int i = 1; i <= 10; i++) {
                int rand_num= ThreadLocalRandom.current().nextInt();
                
                if(rand_num < 0){
                    Thread1 t1 = new Thread1();              
                    t1.start();
                }

                else if (rand_num % 2 ==0){
                    Thread2 t2 = new Thread2();
                    t2.start();
                }

                else if(rand_num % 2 !=0){

                    Thread3 t3 = new Thread3();
                    t3.start();
                }
                System.out.println("The generated number is: "+rand_num);
            }
        }
    }

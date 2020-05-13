package assignmentone;
import java.util.Random;

class Multithreading implements Runnable 
{ 
    public void run() 
    { 
        int counter;
        Random rnum = new Random();
        for (counter = 1; counter <= 5; counter++) {
        System.out.println(rnum.nextInt());
       }
    } 
}   

class RandomNumber 
{ 
    public static void main(String[] args) 
    { 
       Runnable m =new Multithreading();
       Thread thread=new Thread(m);
       thread.start();
     } 
} 


//class odd implements Runnable{
//    public void run(){
//        for(int i=0;i<11;i+=2) {
//            System.out.println("even:" +i);
//        }
//    }
//}
//
//class even implements Runnable{
//    public void run(){
//        for(int i=1;i<=11;i+=2) {
//           System.out.println("odd:" +i);
//        }
//    }
//}
//
//public class RandomNumber {
//
//    public static void main(String[] args) {
//        Runnable r1 = new odd();
//        Thread t = new Thread(r1);
//        Runnable r2 = new even();
//        Thread t2 = new Thread(r2);
//        t.start();
//        t2.start();
//    }
//}
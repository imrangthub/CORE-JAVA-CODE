
package Thread_Operation;

public class SimpleThread extends Thread{
    
    public void run(){
        System.out.println("Thread Running.......");
    }
    
    public static void main(String[] args){
        SimpleThread t1 = new SimpleThread();
         t1.start();
       //  t1.start(); Can't start same Object thread second time
       
       SimpleThread t2 = new SimpleThread();
         t2.start();
        // t2.run(); This is not a Thread this is like a normal method call
    }
    
    
}

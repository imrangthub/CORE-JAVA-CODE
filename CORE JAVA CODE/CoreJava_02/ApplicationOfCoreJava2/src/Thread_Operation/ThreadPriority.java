
package Thread_Operation;

public class ThreadPriority extends Thread{
    
    public static void main(String[] args){
        
        ThreadPriority m1 = new ThreadPriority();
         m1.setName("Thread M1");
         m1.setPriority(Thread.MAX_PRIORITY);
         
        ThreadPriority m2 = new ThreadPriority();
         m2.setName("Thread M2");
         m2.setPriority(Thread.MIN_PRIORITY);
        
        m2.start();
        m1.start();
        
        
        
        
    }
    
    public void run(){
        
        System.out.println("Running Thread Name: "+ Thread.currentThread().getName());
        System.out.println("Running Thread Priority: "+Thread.currentThread().getPriority());
        
    }
    
}


package Thread_Operation;

import static java.lang.Thread.sleep;


class NewThread2 extends Thread {
    NewThread2(){
        super("Demo Thread");
        System.out.println("Child Thread Name: "+this);
        this.start();
    }
    
    public void run(){
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Child Thread: "+i);
                sleep(500);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}








public class ThreadUsingThreadCls {
    public static void main(String[] args){
        new NewThread2();
        
        try{
             for(int i = 5; i>0; i--){
                System.out.println("Main Thread: "+i);
                sleep(1000);
            }
            
        }catch(InterruptedException ee){
            System.out.println("Main thread Intrupt Exception.");
        }
        System.out.println("Main Thread End");
    }
    
}

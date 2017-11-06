
package Thread_Operation;

class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t = new Thread(this, "Damp Thread");
        System.out.println("Chield Name: "+t);
        t.start();
    }
    
    public void run(){
         try{
            for(int i =5; i>0; i--){
                System.out.println("Chield Thread: "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Chield Thread Interrupted");
        }
       
    }
    
}


public class ThreadUsingRunnableInterface {
    
   
    public static void main(String[] args){
        
         new NewThread();
        
        
        try{
            for(int i =5; i>0; i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("End main Thread");
    }
    
    
    
}

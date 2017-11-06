
package Thread_Operation;

public class SynchronizationOfThread extends Thread{
    
    public static void main(String[] srgs){
        SynchronizationOfThread stObj1 = new SynchronizationOfThread();
        SynchronizationOfThread stObj2 = new SynchronizationOfThread();
            stObj1.start();
            stObj2.start();
    }
    
    
    public void run(){
        synchronized(this){
            print();
        }       
    }
    

    static synchronized void print(){
        try{
            for(int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep(500);
            }
            
        }catch(InterruptedException e){
            System.out.println("Interrupted !!!!!!");
        }
    }
    
}

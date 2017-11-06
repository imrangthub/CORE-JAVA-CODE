
package Thread_Operation;

public class JoiningThread implements Runnable{
    
    public static void main(String[] args){
    
        try{
            Thread t = new Thread( new JoiningThread());
             t.start();
             
             System.out.println("Main Class Started");
             t.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Main Class Completed");
    }
    
    public void run(){
        System.out.println("This is thread Running...........");
    }
    
    
    
}

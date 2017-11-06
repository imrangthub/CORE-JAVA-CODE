
package Thread_Operation;

public class ThreadWaitAndNotifyBankingApp {
    
    int totalAmount = 10000;
    
    public static void main(String[] args){
        
        final ThreadWaitAndNotifyBankingApp App = new ThreadWaitAndNotifyBankingApp();
         
        new Thread(){
             public void run(){
                 App.withdrowAmount(15000);
             }
         }.start();
         
         new Thread(){
             public void run(){
                 App.depositAmount(10000);
             }
         }.start();
        
    }
    
    
    
    
    synchronized void withdrowAmount(int amount){
        System.out.println("Withdraw start.........");
         if(totalAmount< amount){
             System.out.println("Not enought money.! Wait for Deposit");
               
              try{
                  wait();
              }catch(Exception e){
                  
              }
         }
         totalAmount -= amount;
         System.out.println("Withdrow Copleted.");
         System.out.println("Current balance: "+totalAmount);
          
    }
    synchronized void depositAmount(int amount){
        System.out.println("Deposit start.......");
        totalAmount += amount;
        System.out.println("Depostiy is Completed");
         notify();
    }
    
}

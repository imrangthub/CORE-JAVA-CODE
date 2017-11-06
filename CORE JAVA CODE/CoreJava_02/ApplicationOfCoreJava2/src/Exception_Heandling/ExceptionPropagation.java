
package Exception_Heandling;

public class ExceptionPropagation {
    
    void m(){
        try{
            System.out.println("Block start");
            int data  = 50/0;
            System.out.println(data);
        }catch(Exception e){
            System.out.println("Divided by 0");
        }
    }
    
    
    void n(){
        m();
    }
    void p(){  // here we can used tryCatch
        n();
    }
    
    
    public static void main(String[] args){
        ExceptionPropagation epObj = new ExceptionPropagation();
         epObj.p(); // here we also can used tryCatch
    }
}


package Exception_Heandling;

public class ExceptionHeandling_00CatchAndShow {
    
    public static void main(String[] args){
        
        try{
            
          int x = 1; // check with 0
          int y = 5 /x;  // ArithmeticException
          int z[] = new int[2];
          System.out.println(z[3]); // ArrayIndexOutOfBoundException
        
        
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("This is divide by zero  Exception.");
        }catch(ArrayIndexOutOfBoundsException ee){
            System.out.println(ee);
           // ee.printStackTrace();
        }catch(Exception e){   // Super class will after sub-class of Exception
            System.out.println(e);   // Can be able to catch all exception
        }
         finally{ // Optional Block. Error or nor error this block must executable 
            System.out.println("Comlete try Catch");
        }
       
        System.out.println("Runing Finised");
        
    }
    
}
 
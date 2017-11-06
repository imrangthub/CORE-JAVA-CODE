
package Exception_Heandling;


public class ExceptionThrowThrows1 {
    
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Under 18 not Allowed.");      
        }else{
            System.out.println("Welcome to Vote");
        }
    }
    
    public static void main(String[] args){
        
        try{
            validate(5);
        }catch(ArithmeticException e){
            System.out.println("Some thing wrong: "+e);
        }
        
        
    }
    
}

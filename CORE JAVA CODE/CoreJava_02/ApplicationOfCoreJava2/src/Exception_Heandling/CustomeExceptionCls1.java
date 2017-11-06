
package Exception_Heandling;

public class CustomeExceptionCls1 {
    
    static void validate(int age) throws myCustomeException{
        if(age<18){
            throw new myCustomeException("Under 18");
        }else{
            System.out.println("Welcome to Vote");
        }
    }
    
    
    public static void main(String[] args){
        
        try{
            
            validate(5);
            
        }catch(myCustomeException e){
            System.out.println(e);
        }
    }
    
}

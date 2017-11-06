
package Recursion_Method;

public class RecursionExample {
    
    public static int factorial(int n){
        
        if (n == 0){  // must have a breake point 
            return 1;
        }
        return n* factorial(n-1);
    }
    
    public static void main(String[] args){
        
        System.out.println(factorial(5));
        
    }
    
}


package Short_Circuit_Operator;

public class ShortCirtcuitOperator {
    
    public static void main(String[] args){
        
        boolean b = true;
        int x = 8;
        int y = 9;
        int z = 2;
        
        if((z>x) && (b = false)){
            System.out.println("This is true: and B is:"+b);
        }else{
             System.out.println("This is fales: and B is:"+b);
        }
        
        
    }
    
}

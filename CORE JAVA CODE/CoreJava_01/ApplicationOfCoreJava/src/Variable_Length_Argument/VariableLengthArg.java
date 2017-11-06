
package Variable_Length_Argument;

public class VariableLengthArg {
    
    public static void test(int id, String...args){
        System.out.print("Id is: "+id+" and Value:");
        
        for(String arg: args){
            System.out.print(" "+arg);
        }
        System.out.println("");
    }
    
    public static void main(String[] arg){
        
        test(212, "Dhaka","Bangladesh","Kumella");
        test(3123,"Nework City"," Vargina");
        
    }
    
}

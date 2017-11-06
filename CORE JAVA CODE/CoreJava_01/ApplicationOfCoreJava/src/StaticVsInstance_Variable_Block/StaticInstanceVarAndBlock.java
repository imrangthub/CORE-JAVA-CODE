
package StaticVsInstance_Variable_Block;

public class StaticInstanceVarAndBlock {
    
    static {
        System.out.println("Class starting loading.......");
    }
    
    static final long ONE_DAY_IN_MILLIS = 24*60*60*1000; // final as constant var
    static int instanceCounter;  // normal static field
    
    static {
        System.out.println("The ONE_DAY_IN_MILLIS is: "+ONE_DAY_IN_MILLIS+" and Counter is: "+instanceCounter);
        
    }
    
    {
    instanceCounter ++;
        System.out.println("InstanceCounter after update is: "+instanceCounter);
    }
    
    
       
    public static void main(String[] args) {
        
        System.out.println("============ Finish class Loading and now Start from main Method. =================");
          
        new StaticInstanceVarAndBlock();
        new StaticInstanceVarAndBlock();
        new StaticInstanceVarAndBlock();
        
        System.out.println("====== Finish main method ======= and finally Counter is: "+instanceCounter);
    }
    
    
    static {
        
        System.out.println("Class Instance fully loaded");
    }
    
   
}

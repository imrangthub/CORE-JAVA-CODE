
package StaticVsInstance_Variable_Block;

public class Whene_nonStatic {
    
     static {
        System.out.println("When non-static Class starting loading.......");
    }
    
    static final long ONE_DAY_IN_MILLIS = 24*60*60*1000; // final as constant var
    int instanceCounters;  // normal static field
    
    static {
        System.out.println("The ONE_DAY_IN_MILLIS is: "+ONE_DAY_IN_MILLIS+" and Counter is: "+new Whene_nonStatic().instanceCounters);
        
    }
    
    {
    instanceCounters ++;
        System.out.println("InstanceCounter after update is: "+instanceCounters);
    }
    
    
       
    public static void main(String[] args) {
        
        System.out.println("============ Finish class Loading and now Start from main Method. =================");
          
        new StaticInstanceVarAndBlock();
        new StaticInstanceVarAndBlock();
        new StaticInstanceVarAndBlock();
        
        System.out.println("====== Finish main method ======= and finally Counter is: "+new Whene_nonStatic().instanceCounters);
    }
    
    
    static {
        
        System.out.println("Class Instance fully loaded");
    }
    
}


package Local_Instance_Static_Variable;


public class LocalAndGlovalVariable {
    
    int aGlobalVar;
    
    public void calAge(){
        int age=0;
        age = age+10;
        aGlobalVar = age;
        
        System.out.println(aGlobalVar);
        
    }
    
    
    
    public static void main(String[] args) {
        
        LocalAndGlovalVariable test = new LocalAndGlovalVariable();
        test.calAge();
    }
    
}

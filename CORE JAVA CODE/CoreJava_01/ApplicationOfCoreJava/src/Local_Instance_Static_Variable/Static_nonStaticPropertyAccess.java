
package Local_Instance_Static_Variable;

public class Static_nonStaticPropertyAccess {
    
    private static double salary;     // a private static variavble
    int x;      // instance/non-static varibale
    public static final String DEPARTMENT = "Devalopment";
    
     void test(){        // non-static member can access static and non-static property
         x = 0;
         salary = 50000;
        
     }
    
    public static void main(String[] args) {
        
        int testStaticVar = 10;  // it will be automatic static
        
       // x = 100;   static method can't access non-static property
       Static_nonStaticPropertyAccess stNoNstObj = new Static_nonStaticPropertyAccess();
       stNoNstObj.x = 100;
       
       salary = 100000; // Can access static property
       
        System.out.println("Department Name: "+DEPARTMENT+" and Salary: "+salary);
        
        
    }
    
}

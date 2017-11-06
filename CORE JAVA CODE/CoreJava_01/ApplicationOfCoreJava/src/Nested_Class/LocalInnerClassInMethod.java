
package Nested_Class;


public class LocalInnerClassInMethod {
    
    private String glMsg = "This is a Field or Global Mag";
    
    void display(){
        String msg1="Can  be used Inner Cls";
        final String MSG2 = "Can be used Inner Cls cos this is final variable";
        
        class LocalCls{
            void msg(){
                System.out.println(msg1);
                System.out.println(MSG2);
                System.out.println(glMsg);
            }
        }
        LocalCls locObj = new LocalCls();  // must used this cls inside the method not outside
        locObj.msg();
    }
    
    public static void main(String[] args){
        
        LocalInnerClassInMethod localInnerObj = new LocalInnerClassInMethod();
        localInnerObj.display();
        
        
        
    }
    
    
}

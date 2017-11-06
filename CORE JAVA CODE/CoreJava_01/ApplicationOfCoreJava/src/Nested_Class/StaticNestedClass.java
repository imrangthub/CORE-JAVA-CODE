
package Nested_Class;

public class StaticNestedClass {
    
    static String msg1 = "This is a static Msg can be used static Class";
           String msg2 = "This si a non-static msg Cnt't used static class";
          
           static class InnerStCls{
               
               void normalMsg(){
                   System.out.println("This is from normal Method");
                   System.out.println("This is global static Var:" +msg1); // can't used non-static variable in static class
               }
               static void stMag(){
                   System.out.println("This is from static Method");
               }
               
           } // end of inner class
           
           
           
           public static void main(String[] args){
             
              InnerStCls innObj = new InnerStCls();
               innObj.normalMsg();
               InnerStCls.stMag();
           }
    
}

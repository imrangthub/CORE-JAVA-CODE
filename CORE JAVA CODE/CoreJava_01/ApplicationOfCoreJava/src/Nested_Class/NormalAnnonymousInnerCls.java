
package Nested_Class;


 class TestInner{
     String InnerMsg = "This is InnerMsg";
  void display(){
      System.out.println("This Message from TestInner Class");
    }
 }

public class NormalAnnonymousInnerCls {
    
    public static void main(String[] args){
        
        new TestInner(){
            
            void display(){
                System.out.println("This is override msg");
            }
            
        }.display();
    }
    
}


package Nested_Class;

public class NonStaticMemberInnerCls {
    
    private int outerData = 99;
    private String Msg = "This Message from Outer Class";
    
     class InnerCls{
         private int innerData = 100;
         void msgInner(){
             System.out.println("This is Message from Inner Class. and Data is:"+outerData);
         }
     }
     
     void displayMsg(){
         
         InnerCls innObj = new InnerCls();
                 innObj.msgInner();
                 System.out.println(innObj.innerData);
                 System.out.println(this.Msg);
     }
    
    
    
    public static void main(String[] args){
        
       NonStaticMemberInnerCls outerObj = new NonStaticMemberInnerCls();
       outerObj.displayMsg();
        
    }
    
}

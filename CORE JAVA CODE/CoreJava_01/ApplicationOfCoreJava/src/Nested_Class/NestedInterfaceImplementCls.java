
package Nested_Class;

public class NestedInterfaceImplementCls  implements NestedInterface.MessageIn{
    
    public void displayData(){
        System.out.println("This is override nested Interface Method witn . operator");
    }
    
    public static void main(String[] args){
        NestedInterfaceImplementCls msg = new NestedInterfaceImplementCls();
        
        msg.displayData();
    }
    
}

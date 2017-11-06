
package Nested_Class;

abstract class PersonAbstCls{
    abstract void eat();
}


public class AnnonyMousInnerClsWithAbstractCls {
    
    public static void main(String[] args){
        
         new PersonAbstCls(){
             void eat(){
                 System.out.println("This is a abstract Override Mag");
             }
         }.eat();
         
    }
    
}

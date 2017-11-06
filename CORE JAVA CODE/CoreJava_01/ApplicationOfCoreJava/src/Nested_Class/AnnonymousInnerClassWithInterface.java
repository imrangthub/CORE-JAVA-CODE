
package Nested_Class;


interface Eatable{ // a interface
    void eat();
}


public class AnnonymousInnerClassWithInterface { // no need implement that Interface
    
    public static void main(String[] args){
        
       new Eatable(){  // this is anonemous class
          
            public void eat(){
                System.out.println("This Method Override Message");
            }
        }.eat();
    }
    
}

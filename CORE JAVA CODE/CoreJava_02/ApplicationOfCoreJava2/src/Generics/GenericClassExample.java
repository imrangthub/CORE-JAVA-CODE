
package Generics;

public class GenericClassExample<T> {
    
    private T value;
    
    public void setValue(T t){
        this.value = t;
    }
    public T getValue(){
        return value;
    }
    
    public static void main(String[] args){
        GenericClassExample<Integer> integerBox = new GenericClassExample();
         integerBox.setValue(9090);
         
         GenericClassExample<String> stringBox = new GenericClassExample();
         stringBox.setValue("Hello this is a String");
         
         System.out.print("Integer value: "+ integerBox.getValue() +"\n" );
         System.out.println("String value: "+stringBox.getValue() +"\n");
         
         
        
    }
    
}

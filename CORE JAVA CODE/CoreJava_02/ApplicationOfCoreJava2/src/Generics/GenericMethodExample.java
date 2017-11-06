
package Generics;

public class GenericMethodExample {
    
    public static <E>void printArray( E[] anyArray){
        
        for(E element : anyArray){
            System.out.print(element+" , ");
        }
        System.out.println();
        
    }
    
    public static void main(String args[]){
        Integer[] intArray = {1,2,3,4,5};
        String[] stArray = {"Dhaka","Khulna","Borisal"};
        
        
        System.out.print("Printing a Integer Array: ");
         printArray(intArray);
         
        System.out.print("Printing a String Array: ");
         printArray(stArray);
    }
    
    
    
}

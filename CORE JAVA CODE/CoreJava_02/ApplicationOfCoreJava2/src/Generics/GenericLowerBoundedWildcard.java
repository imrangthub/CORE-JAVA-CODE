
package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundedWildcard {
    
    public static void addingList(List<? super Integer> myList){
        myList.add(new Integer(50));
        myList.add(new Integer(1));
    }
    
    public static void main(String[] args){
        
        List<Number> intList = new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(5));
        intList.add(new Integer(10));
        
        addingList(intList);
        
         for(int i=0; i<intList.size(); i++){
             System.out.println(intList.get(i));
         }
        
        
    }
    
}

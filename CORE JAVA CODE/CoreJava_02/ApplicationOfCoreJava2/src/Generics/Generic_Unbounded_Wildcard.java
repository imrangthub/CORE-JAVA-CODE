
package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic_Unbounded_Wildcard {
    
    public static void processElement(List<?> elements){ // given no type this called Unbounded wildcard
        for(Object o : elements){
            System.out.println(o);
          }
    }
    
    public static void main(String[] args){
        
        List<Integer> intList = new ArrayList<>();
        intList.add(99);
        intList.add(98);
        intList.add(32);
        processElement(intList);
        
        List<String> stList = new ArrayList<>();
        stList.add("Babu");
        stList.add("Labu");
        stList.add("Biddut");
        processElement(stList);
        
        
    }
    
}

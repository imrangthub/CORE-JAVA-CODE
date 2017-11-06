
package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToListConverting {
    
    public static void main(String[] srgs){
    
    
        String sArray[] = {"Elem1","Elem2","Elem3"};
        
         System.out.println(sArray);
         System.out.println(sArray[1]);
         
        List<String> aList = Arrays.asList(sArray);
        
        System.out.println("1 Iterator Loop: ");
        
        Iterator iter = aList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println(" ");
        
      
        
        
    }
    
}


package Collection_Framework;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoopingExample {
    
    public static void main(String[] args){
        
        List<String> list = new ArrayList();
        
         list.add("Value 1");
         list.add("Value 2");
         list.add("Value 3");
         
         System.out.println(" #1 Normal for Loop:");
          
         for(int i=0; i<list.size(); i++){
             System.out.print(" "+list.get(i));
         }
         System.out.println();
         
         System.out.println("#2 advance for Loop: ");
         
          for(String tempVal: list){
              System.out.print(""+tempVal);
          }
          System.out.println();
          
          System.out.println("#3 While loop");
 
           int j = 0;
           while(list.size()>j){
               System.out.print(" "+list.get(j));
               j++;
           }
           System.out.println();
           
           System.out.println("#4 Iteraror Loop");
           
            Iterator<String> iter = list.iterator();
             while(iter.hasNext()){
                 System.out.print(" "+iter.next());
             }
             System.out.println();
            
        
        
        
        
    }
    
}

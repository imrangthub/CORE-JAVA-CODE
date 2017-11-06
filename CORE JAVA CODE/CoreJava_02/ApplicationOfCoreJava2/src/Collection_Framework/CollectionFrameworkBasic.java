
package Collection_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFrameworkBasic {
    
    public static void main(String[] args){
        
        
        
        List ls = new LinkedList(); // list allow doplicated element
         ls.add("List: Dhaka");
         ls.add("Borisal");
         ls.add("Khulna");
         ls.add("Borisal");
         print(ls);
         
         Set s = new HashSet(); // Not allow doplicated value
          s.add("Set: Dhaka");
          s.add("Borisal");
          s.add("Khulna");
          s.add("Borisal");
         print(s);
         
         SortedSet ss = new TreeSet(); // sorted set 
          ss.add("TreeSet: Dhaka");
          ss.add("Borisal");
          ss.add("A Khulna");
          ss.add("Borisal");
         print(ss);
         
         LinkedHashSet sss = new LinkedHashSet();
           sss.add("TreeSet: Dhaka");
           sss.add("Borisal");
           sss.add("A Khulna");
           sss.add("Borisal");
         print(sss);
         
         Map ml = new LinkedHashMap();// as key value List
          ml.put("Name", "IMRAN");
          ml.put("Edu", "B.Sc");
          ml.put("Gender", "Male");
          ml.put("Edu", "B.Sc");  // Not allow doplicated value
           print(ml.keySet());
           print(ml.values());
           
        SortedMap ms = new TreeMap();  // sorted Map
          ms.put("Name", "IMRAN");
          ms.put("Edu", "B.Sc");
          ms.put("Gender", "Male");
          ms.put("Edu", "B.Sc");  // Not allow doplicated value
           print(ms.keySet());
           print(ms.values());
           
        Map mh = new HashMap();
          mh.put("Name", "IMRAN");
          mh.put("Edu", "B.Sc");
          mh.put("Gender", "Male");
          mh.put("Edu", "B.Sc");  // Not allow doplicated value
           print(mh.keySet());
           print(mh.values());
        
    
        
           
         
         
          
          
         
         
         
        
    }
    
    
    
    static void print(Collection anyColl){
        
        Iterator iter = anyColl.iterator();
         while(iter.hasNext()){
             String elem = (String)iter.next();
             System.out.print(elem+" ");
         }
         System.out.println();
            
        }
   
}

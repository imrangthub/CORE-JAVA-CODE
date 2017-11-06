
package Generics;

import java.util.ArrayList;
import java.util.List;


public class IntroduceGenerices {
    
    public static void main(String[] args){
        
        List list = new ArrayList(); // no Generics
        
        list.add(new Integer(2)); // we can add any obj in this list
        list.add("a string");
        list.add(90);
        
        System.out.println(list);
        System.out.println((String) list.get(1));
        
        List<String> myStList = new ArrayList();
        
      //  myStList.add(1); // can't add int or Obj
      
         myStList.add("Value1");
         myStList.add("Value2");
         myStList.add("Value3");
         
         System.out.println(myStList);
         System.out.println(myStList.get(2));
         
          for(String s : myStList){
              System.out.println(s);
          }
      
         
        
    }
    
}

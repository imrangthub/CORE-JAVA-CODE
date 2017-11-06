
package Collection_Framework;

import java.util.ArrayList;

public class ArrayListExample1 {
    
    public static void main(String[] args){
        
        ArrayList<String> myList = new ArrayList();
         System.out.println("Size of myList: "+myList.size());
         System.out.println("Element Of myList: "+ myList);
          
         
         myList.add("Dhaka");
         myList.add("Khulna");
         myList.add("Borisal");
         myList.add("Dhaka");
         myList.add(0,"Shariatpur");  // can make position
         
         System.out.println("Size of myList after adding: "+myList.size());
         System.out.println("Element Of myList after adding: "+ myList);
         System.out.println("Single Element Of myList: "+ myList.get(1));
         
         
         myList.remove("Borisal");
         myList.remove(1); // used obj opsition
        
         System.out.println("Size of myList after adding: "+myList.size());
         System.out.println("Element Of myList after adding: "+ myList);
         
         
         for(int i=0; i< myList.size(); i++ ){
             String s = myList.get((i));
             System.out.print(s+" ");
         }
         System.out.println();
         
    }
    
}

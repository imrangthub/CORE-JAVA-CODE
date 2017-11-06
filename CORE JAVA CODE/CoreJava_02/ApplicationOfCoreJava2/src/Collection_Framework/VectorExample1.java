
package Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample1 {
    
    public static void main(String[] args){
        
        
        Vector v = new Vector(3,2);
         System.out.println("Initial Vector Size: "+v.size());
         System.out.println("Initial Vector Capicity: "+v.capacity());
         
          v.addElement(new Integer(4));
          v.addElement(new Integer(2));
          v.addElement(new Integer(100));
          
         System.out.println("After adding Vector Size: "+v.size());
         System.out.println("After adding Vector Capicity: "+v.capacity());
         
          v.addElement(new Double(65.3423));
          
           System.out.println("After over size Vector Size: "+v.size());
           System.out.println("After over size Vector Capicity: "+v.capacity());
         
           v.addElement(new String("Hello"));
           v.addElement(new Float(4.4));
           
           System.out.println("Again over size Vector Size: "+v.size());
           System.out.println("Aagain over size Vector Capicity: "+v.capacity());
           
            // show value
            
            System.out.println("Vactor First element: "+  v.firstElement());
            System.out.println("Vactor Last element: "+  v.lastElement());
           
            // Checking element
            
            if(v.contains(new Integer(100))){
                System.out.println("Yes there is a Element as 100.");
            }
            
            // print all element using enum
            
            Enumeration vEnum = v.elements();
            
             while(vEnum.hasMoreElements()){
                 System.out.print(vEnum.nextElement()+" ");
             }
             System.out.println();
            
            
            
            
         
         
         
    }
    
    
    
}


package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUpperBoundedWildcard {
    
    public static double sum(List<? extends Number> myList){
        double sum=0;
        for(Number n: myList){
            sum+= n.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args){
        
        List<Integer> intList = new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(2));
        intList.add(new Integer(4));
        
        double sum = sum(intList);
        System.out.println(sum);
        
        
    }
    
}


package Enum_Constant;


public class EnumExampleCls {
    
    
    public enum Day { SAT,SUN, MON, TUE, WED, THU, FRI}; 
    
    
    public static void main(String[] args){
        
        for(Day day : Day.values()){
          System.out.println(day);  
        }
        
        
        
    }
    
}

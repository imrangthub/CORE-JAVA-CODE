
package Enum_Constant;

public class EnumExampleCls3 {
    
    public static void main(String[] args){
        
        
        for(SeasonEnum2 ss : SeasonEnum2.values()){
          System.out.println(ss+" "+ss.value); 
        }
        
        for(SeasonEnum2 ss : SeasonEnum2.values()){
          System.out.println(ss+" "+ss.displaySeason());
        }
        
    }
    
}

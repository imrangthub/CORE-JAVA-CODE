
package Enum_Constant;





public class EnumExampleCls2 {
    
    public static void main(String[] args){
        
        for(SeasonEnum s : SeasonEnum.values()){
            System.out.println(s+" "+s.myValue);
        }
        
    }
    
}


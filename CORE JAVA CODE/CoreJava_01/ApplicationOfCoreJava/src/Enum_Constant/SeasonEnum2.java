
package Enum_Constant;

public enum SeasonEnum2 {
    
    WINTER(10){
    
        public String displaySeason(){
            return "This is Winter";
        }
    }, SUMMER(20){
       public String displaySeason(){
           return "This is Summer";
       }
    };
    
    
    
     public int value;  
    SeasonEnum2(int val ){
        this.value = val;
    }
    
    
    public abstract String displaySeason(); //abstract method
    
    
    
}

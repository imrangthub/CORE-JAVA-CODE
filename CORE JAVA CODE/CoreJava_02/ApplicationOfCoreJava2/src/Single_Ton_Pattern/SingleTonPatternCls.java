
package Single_Ton_Pattern;


class SinToCls{
   private static SinToCls Obj = null; 
   private SinToCls(){
       
   }
   
   public static SinToCls getInstance(){
       if(Obj == null ){
           Obj = new SinToCls();
       }
       return Obj;
   }


}


public class SingleTonPatternCls {
    public static void main(String[] args){

        System.out.println("This is a Obj: "+SinToCls.getInstance());
    }
    
}


package Input_Output_Operation_IO;

import java.io.File;

public class fileDeleteing {
    
    public static void main(String[] args){
        
       try{
           File file = new File("C:\\Users\\USER\\Desktop\\newName.doc");
           
            if(file.delete()){
                System.out.println(file.getName()+": is Deleted..!");                
            }else{
                System.out.println("Deleting failed");
            }
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
}

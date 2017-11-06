
package Input_Output_Operation_IO;

import java.io.File;
import java.io.IOException;


public class fileCreation {
    
    public static void main(String[] args){
        
        try{
            
            File file = new File("C:\\Users\\USER\\Desktop\\a.doc");
            if(file.createNewFile()){
                System.out.println("Successfully file created....!");        
            }else{
                System.out.println("This file already exists.");
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}


package Input_Output_Operation_IO;

import java.io.File;

public class fileRename {
    
    public static void main(String[] args){
        
        File oldFile = new File("C:\\Users\\USER\\Desktop\\a.doc");
        File newFile = new File("C:\\Users\\USER\\Desktop\\newName.doc");
         
        if(oldFile.renameTo(newFile)){
            System.out.println("Successfully Rename");
        }else{
            System.out.println("Rename failed");
        }
    }
    
    
}


package Input_Output_Operation_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class fileWriterUsingBufferWriter {
    
    public static void main(String[] args){
        
        String content1 = "This is first line from Buffer Writer";
        String content2 = "This is second line from Buffer Writer";
        
        File file = new File("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Input_Output_Operation_IO\\simpleText.txt");
               if(!file.exists()) {      
          try {
               file.createNewFile();  
               
               FileWriter fw = new FileWriter(file, true); // this true parameter is for append as totally new or below of Old line true mean below of old line
                BufferedWriter bw = new BufferedWriter(fw);
                 
                 bw.newLine();
                 bw.write(content1);
                 bw.newLine();
                 bw.write(content2);
                 bw.close();
               
               
            } catch (IOException ex) {
               Logger.getLogger(fileWriterUsingBufferWriter.class.getName()).log(Level.SEVERE, null, ex);
           }
          
        }else{
            
            try {
                FileWriter fw = new FileWriter(file, true); // this true parameter is for append as totally new or below of Old line true mean below of old line
                BufferedWriter bw = new BufferedWriter(fw);
                 
                 bw.newLine();
                 bw.write(content1);
                 bw.newLine();
                 bw.write(content2);
                 bw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(fileWriterUsingBufferWriter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
          System.out.println("Writing done");
        
    }
    
}

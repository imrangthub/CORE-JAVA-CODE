
package Input_Output_Operation_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class fileReadUsingBufferReader {
    
    public static void main(String[] args){
        
        try {
            BufferedReader br = new BufferedReader( new FileReader("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Input_Output_Operation_IO\\simpleText.txt"));
            
            String currentLine;
            
            while((currentLine = br.readLine()) != null){
                 
                System.out.println(currentLine);
            }
            br.close();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileReadUsingBufferReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fileReadUsingBufferReader.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}

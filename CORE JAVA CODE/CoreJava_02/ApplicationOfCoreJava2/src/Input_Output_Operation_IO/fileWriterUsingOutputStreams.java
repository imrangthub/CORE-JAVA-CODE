
package Input_Output_Operation_IO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;

public class fileWriterUsingOutputStreams {
    
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fOut = new FileOutputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Input_Output_Operation_IO\\simpleTextOutputStream.txt");
        BufferedOutputStream bOut = new BufferedOutputStream(fOut);
        
        String myString = "This is a text string for OutputStream";
         byte b[] = myString.getBytes();
         bOut.write(b);
         
         bOut.flush();
         bOut.close();
        System.out.println("Write Successfully completed.");
    }
    
}

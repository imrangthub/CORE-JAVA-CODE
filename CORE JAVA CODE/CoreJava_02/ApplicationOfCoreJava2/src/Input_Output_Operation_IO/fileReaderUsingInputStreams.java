
package Input_Output_Operation_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class fileReaderUsingInputStreams {
    
    public static void main(String[] args){
        try{
            
            FileInputStream fInput = new FileInputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Input_Output_Operation_IO\\simpleTextOutputStream.txt");
            BufferedInputStream bInput = new BufferedInputStream(fInput);
            
            int i;
            while((i = bInput.read()) != -1){
                System.out.print((char) i);
            }
            fInput.close();
        }catch(Exception e){
            System.out.println(e);
        }
      System.out.println();
    }
    
}

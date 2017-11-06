
package Using_Properties_File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateProperty {
    
    public static void main(String[] args){
        
        Properties propObj = new Properties();
        OutputStream outPut = null;
        
        try{
            
            outPut = new FileOutputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Using_Properties_File\\config.properties");
            
            propObj.setProperty("host","localhost");
            propObj.setProperty("database", "mydb");
            propObj.setProperty("admin","imranmadbar@gmail.com");
            propObj.setProperty("password", "12345");
            
             propObj.store(outPut, null);
             outPut.close();
            System.out.println("Successfully Done");
             
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                outPut.close();
            } catch (IOException ex) {
                Logger.getLogger(CreateProperty.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}

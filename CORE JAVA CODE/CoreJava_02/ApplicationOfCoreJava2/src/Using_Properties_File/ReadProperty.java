
package Using_Properties_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadProperty {
    public static void main(String[] args){
        
        Properties propObj = new Properties();
        InputStream inPut = null;
        
         try{
             
             inPut = new FileInputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Using_Properties_File\\config.properties");
             propObj.load(inPut);
             
              System.out.println(propObj.getProperty("host"));
              System.out.println(propObj.getProperty("database"));
              System.out.println(propObj.getProperty("admin"));
              System.out.println(propObj.getProperty("password"));
             
              Enumeration<?> e = propObj.propertyNames();
               while(e.hasMoreElements()){
                   String key = (String) e.nextElement();
                   String value = propObj.getProperty(key);
                   System.out.println("Key: "+key+" Value: "+ value);
               }
               inPut.close();
               
             System.out.println("Operation Completed.");
               
              
             
         }catch(Exception e){
             e.printStackTrace();
         }finally{
            try {
                inPut.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadProperty.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        
        
    }
    
}

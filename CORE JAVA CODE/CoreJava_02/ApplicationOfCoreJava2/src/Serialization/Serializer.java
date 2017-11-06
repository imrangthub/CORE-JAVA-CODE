
package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    
    public static void main(String[] args){
        
        Serializer serializerObj = new Serializer();
        
        Address addressObj = new Address();       
         addressObj.setStreet("Wall Street");
         addressObj.setCountry("London");
      
         System.out.println(addressObj);
         
        Address addressObj2 = new Address();       
         addressObj2.setStreet("Dhaka");
         addressObj2.setCountry("Bangladesh");
         
        serializerObj.serializeAddrClsObj(addressObj);
        
    }
    
    public void serializeAddrClsObj( Address ad){
        
        try{
            FileOutputStream fOut = new FileOutputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Serialization\\addressSerializ.ser");
            ObjectOutputStream oos =new ObjectOutputStream(fOut);
             oos.writeObject(fOut);
             oos.close();
             System.out.println("Serialization is Done");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
   
    
    
    
}

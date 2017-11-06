
package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
    
    public static void main(String[] args){
        
        Deserializer deserializer = new Deserializer();
        Address addressObj = deserializer.deserializeAddress();
        
         System.out.println(addressObj);
    }
    
    public Address deserializeAddress(){
        Address addressObj;
        
        try{
            
            FileInputStream fInput = new FileInputStream("D:\\JAVA\\CORE JAVAcod\\CoreJava_02\\ApplicationOfCoreJava2\\src\\Serialization\\addressSerializ.ser");
            ObjectInputStream oIs = new ObjectInputStream(fInput);
             addressObj = (Address)oIs.readObject();
             oIs.close();
             
             return addressObj;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
}

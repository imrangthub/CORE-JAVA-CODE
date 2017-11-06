
package Working_with_Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class WorkingWitnData {
    
    
    public static void main(String[] args){
        
        Date date = new Date();
        
        DateFormat dateFormate1 = new SimpleDateFormat("yyy/MM/dd hh:mm:ss a");
        DateFormat dateFormate2 = new SimpleDateFormat("yyy/MM/dd");
        
        
        
         System.out.println(date);
         
          System.out.println(dateFormate2.format(date));
          System.out.println(dateFormate1.format(date));
        System.out.println("=========== Useing Calender Class =============");
        
          Calendar calObj = Calendar.getInstance();
           String st = calObj.getTime().toString();
           System.out.println(st);
           System.out.println(dateFormate2.format(calObj.getTime()));
    }
    
}

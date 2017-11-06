
package Working_with_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DayNameFormDate {
    
    public static void main(String[] args){
        
        try {
            String input_date = "19/09/2015";
            
            SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
            
            Date dt1 = format1.parse(input_date);
            
            DateFormat format2 = new SimpleDateFormat("EEEE");
            DateFormat format3 = new SimpleDateFormat("EE");
            
            String fullDay = format2.format(dt1);
            String sortDay = format3.format(dt1);
             System.out.println(fullDay);
             System.out.println(sortDay);
            
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(DayNameFormDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

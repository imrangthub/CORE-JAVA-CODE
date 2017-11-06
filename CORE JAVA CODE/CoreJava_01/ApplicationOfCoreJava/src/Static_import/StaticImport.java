/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_import;

import java.util.Date;
import static java.lang.Math.sqrt;   // if import with static keyword not need static calss ( Math. ) name.


/**
 *
 * @author USER
 */
public class StaticImport {
    
    public static void main(String[] args){
        Date dt = new Date();
        System.out.println(dt.getTime());
        
        System.out.println(Math.PI);
        System.out.println("Result is: "+sqrt(144)); // no need to use calss name as static import
        
        
    }
    
}

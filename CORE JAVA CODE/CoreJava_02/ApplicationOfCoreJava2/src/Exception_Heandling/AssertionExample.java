/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Heandling;


public class AssertionExample {
    
    public static void main(String[] args){
        int x = 1;
        //assert(x<0);   // 1. simple form
        assert(x>0):"This is error msg"; // 2.augment form
        
        System.out.println("Everything Okey");
    }
    
}

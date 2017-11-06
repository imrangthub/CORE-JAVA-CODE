/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments_In_Java;

/**
 * @version This me set a comment document comments
 * @author USER
 */
public class CommentsThreeStyle {
    
    
    int myVar; // this is Single line comment Style 01
    /*
    This is a
    Multi line Comments
    Style 02
    */
    
    
    /**    This is comments called documentations comments style 03
     * This is a Method for Display data
     * @param yourData This is Input data
     */  
    void printData(String yourData){
        System.out.println(yourData);
    }
    
    public static void main(String[] args) {
        
        CommentsThreeStyle print =new CommentsThreeStyle();
        print.printData("My Data");
        
    }
    
}

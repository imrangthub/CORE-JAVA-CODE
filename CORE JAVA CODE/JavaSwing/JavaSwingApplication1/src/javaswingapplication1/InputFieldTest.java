/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class InputFieldTest {
    
    public static void main(String[] args){
        
        String input = JOptionPane.showInputDialog("Enter a number please: ");
        
        int num = Integer.parseInt(input);
        System.out.println("You Enter: "+num);
    }
    
}

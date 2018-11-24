/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JavaApplication2 {

   
    public static void main(String[] args) {
        
       teste t =  new teste();
       
       t.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("digite um numero")));
       
       t.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("digite outro numero")));
       
       JOptionPane.showMessageDialog(null,"primeiro numero: " + t.getNumero1() + "\nsegundo numero: " + t.getNumero2());
    }
    
    
    
}

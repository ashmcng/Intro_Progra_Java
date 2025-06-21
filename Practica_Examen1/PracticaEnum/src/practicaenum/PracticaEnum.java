/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaenum;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class PracticaEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        persona ash = new persona("Ashley", ColorFavorito.VERDE);
        JOptionPane.showMessageDialog(null, ash);  // Ashley ama el color VERDE 
    }
    
}

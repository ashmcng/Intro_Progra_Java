/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Semana3_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // USO DE FOR 
        
        /*
        for (int i = 10; i >= 0; i--) {
            
            JOptionPane.showInternalMessageDialog(null, "El valor de i es  "+ i);
            
        }
         */
        /*
        int i = 10; 
        while (i>=0) {
           JOptionPane.showInternalMessageDialog(null, "El valor de i es  "+ i); 
           i--; 
        }
         */
        String Salida = "No";
        while (Salida.equals("No")) {
            Salida = JOptionPane.showInputDialog(null, "Digite Si si desea salir");
        }
    }
}
 
    


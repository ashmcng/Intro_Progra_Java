/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Clase4 {
 
    public String nombreEmpresa = "Sistema patitos SA";
    
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    
    public static void main(String[] args) {    
        Persona kata = new Persona();
        Persona Juan = new Persona();
        Persona julia = new Persona();
        
        kata.cedula = 40563489; 
        kata.edad = 18; 
        kata.nombre = "kata"; 
        kata.salario = 500.000; 
        kata.gritrarfrase();
        JOptionPane.showInternalMessageDialog(null, "edad falsa   " + kata.mentiredad());
        
        
        
    
    }
    
}

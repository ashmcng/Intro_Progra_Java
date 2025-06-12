/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Persona {
    
    public int cedula;
    public String nombre;
    public int edad; 
    public double salario; 
    
    // ESTE METODO NO DEVUELVE NADA 
    
    public void gritrarfrase(){
    JOptionPane.showMessageDialog(null, "deja que el pato nade" + " "+ nombre);
    
    }
    
    public int mentiredad(){
        
        if  (edad < 18)
                return edad+5; 
        else if (edad > 35)
                return edad-5; 
        else 
           return edad;
    
    }
    
    /**
     * esto es un metodo de ejemplo para mostrar el java doc
     */
    
    public String metodoej(String parametro1){
        
        return null;
        
    }
    
}

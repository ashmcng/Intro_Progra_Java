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
public class Carro {
    
    // declaramos variables 
    
    public int cedula;
    public String nombre;
    public double Pcarro; // esto incluye unicamente el precio necesario para comprar el carro\

    public double Ingreso_year; 
    
    
    // inicializamos 
    
    public void calificacion_compra(){
        
        if ( Ingreso_year > Pcarro )
         JOptionPane.showMessageDialog(null, "Puede comprar el carro");
        else if ( Ingreso_year  < Pcarro )
            JOptionPane.showMessageDialog(null, "Nolo puede comprar");
        
        
    }
    }
    


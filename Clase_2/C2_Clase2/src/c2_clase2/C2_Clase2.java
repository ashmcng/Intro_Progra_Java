/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2_clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class C2_Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /// A • Escriba un nuevo programa en JAVAque le solicite al usuario su edad y le indique si puede o no puede votar.
         /// Considere que en nuestro país, solo las personas con
        /// 18 años o más pueden votar.
        ///
        // DEFINIMOS LAS VARIABLES 
        
        String Nombre;
        int edad; 
        String Lectura;
        
        //llenamos de 0 
        
        Nombre = " "; 
        edad = 0; 
        Lectura = " ";
        
        
        //Mensaje de bienvenida
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PROGRAMA QUE DETERMINA SI PUEDE VOTAR EN COSTA RICA");
        
        // pedimos usuario su informacion
        
        Nombre = JOptionPane.showInputDialog("Digite su nombre"); // pedimos usuario su nombre
        
        Lectura = JOptionPane.showInputDialog("Digite su edad"); //pedimos a usuario su edad
        
        edad = Integer.parseInt(Lectura); // Asignamos el valor de lectura a la edad
        
        
        // INICIO IF 
        
        
        if (edad >= 18 ){
            
            JOptionPane.showMessageDialog(null, "Estimado/a usuario: "+ Nombre + " " + "Usted puede votar");
            
            
        } else if (edad  <= 18) { 
            
            JOptionPane.showMessageDialog(null, "Estimado/a usuario: "+ Nombre + " " + "Usted no puede votar");
        }
        
        }
           
        
        
        
    }
    


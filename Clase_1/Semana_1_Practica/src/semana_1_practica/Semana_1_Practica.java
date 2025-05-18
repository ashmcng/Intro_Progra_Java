/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_1_practica;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Semana_1_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARAMOS LAS VARIABLES
        
        String lectura; 
        int edad;
        String nombre;
        
        // LAS PONEMOS VACIAS 
        
        edad=0; 
        nombre=" ";
        
        //MENSAJE DE BIENVENIDA 
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL CUESTIONARIO PERSONAL");
        
        //Le pedimos al usuario su informacion 
        
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        lectura = JOptionPane.showInputDialog("Digite su edad");
                 
        // Nuevo valor de Edad 
        edad = Integer.parseInt(lectura);
        
        //Mostramos los datos obtenidos 
        
        JOptionPane.showMessageDialog(null, "Esta es su edad digitada"+ " " + edad + " " + "\n"+ 
               "Su nombre es"+ " "+ nombre);

  }  
}

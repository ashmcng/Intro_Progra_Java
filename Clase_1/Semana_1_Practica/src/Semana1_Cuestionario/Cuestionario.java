/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana1_Cuestionario;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Cuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARAMOS LAS VARIABLES
        
        String lectura; 
        String lectura2;
        int edad;
        String nombre;
        double salario;
         
        // LAS PONEMOS VACIAS 
        
        edad=0; 
        nombre=" ";
        salario=0;
        
        //MENSAJE DE BIENVENIDA 
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL CUESTIONARIO PERSONAL");
        
        //Le pedimos al usuario su informacion 
        
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        lectura = JOptionPane.showInputDialog("Digite su edad");
        lectura2 = JOptionPane.showInputDialog("Digite su salario");   
        
        // Nuevo valor de Edad y salario 
        
        edad = Integer.parseInt(lectura);
        salario = Integer.parseInt(lectura2);
        
        //Mostramos los datos obtenidos 
        
        JOptionPane.showMessageDialog(null, "Su nombre es"+ " "+ nombre + "Esta es su edad digitada"+ " " + edad + " " + "\n"+ 
              "Su salario es de:" + " "+ salario);

  }  
}

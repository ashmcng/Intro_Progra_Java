/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario_calculo;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Salario_Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // En este programa vamos a calcular el salario bruto y Neto de un empresario mediante la solicitud de unicamente su ingreso bruto semanal 
        
        // Declaramos las variables necesarias 
        
        double S_Bruto;
        double S_Neto; 
        double S_Semanal; 
        String Lectura1;
        String Nombre; 
        
        
        // Llenamos las variables de 0 
        
        S_Bruto = 0; 
        S_Neto = 0; 
        S_Semanal = 0; 
        Nombre = " ";
        Lectura1 = " "; 
        
        //Mensaje de bienvenida al programa 
        
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de calculo de salario Bruto y Neto");
       
        
        Nombre = JOptionPane.showInputDialog("Digite su nombre"); //Pedimos el nombre del usuario con el proposito de la impresion de datos 
               
        Lectura1 = JOptionPane.showInputDialog("Digite su salario Bruto Semanal"); // Solicitamos al usuario que ingrese su salario semanal
      
                
        S_Semanal = Integer.parseInt(Lectura1);  // Asiganmos el valor de lectura al salario semanal 
        
        // Realizamos los calculos de salario bruto y de salario neto 
        
        S_Bruto = S_Semanal * 4;  // Calculamos salrio bruto 
        S_Neto = S_Bruto - ((S_Bruto * 9.34)/100); // Calculamos salario neto con deduciones de un 9.34% 
        
        // Fin damos resultados 
        
        JOptionPane.showMessageDialog(null, "Estimado/a" + " "+ Nombre + ", " + "Su salario bruto semanal ingresado fue de: " + S_Semanal + ", " + "\n"
               + "Su salario Bruto es de: " + S_Bruto + ", " + "Su salario bruto es de: " + S_Neto);
        
    }
    
}
